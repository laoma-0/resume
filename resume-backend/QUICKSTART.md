# 快速启动指南

## 前提条件

1. ✅ Java 21 已安装
2. ✅ Maven 已安装
3. ✅ MySQL 数据库已安装并运行

## 启动步骤

### 步骤 1: 初始化数据库

方式一：使用命令行导入 SQL 脚本
```bash
mysql -u root -p < src/main/resources/schema.sql
```

方式二：手动执行
1. 打开 MySQL 客户端
2. 执行 `src/main/resources/schema.sql` 文件中的 SQL 语句

### 步骤 2: 配置数据库连接

编辑 `src/main/resources/application.yml` 文件，修改数据库连接信息：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/resume_db?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true
    username: your_username  # 改为你的 MySQL 用户名
    password: your_password  # 改为你的 MySQL 密码
```

### 步骤 3: 启动项目

方式一：使用 Maven 命令直接运行
```bash
mvn spring-boot:run
```

方式二：先打包再运行
```bash
mvn clean package
java -jar target/resume-backend-1.0-SNAPSHOT.jar
```

### 步骤 4: 验证启动

看到以下日志表示启动成功：
```
Started ResumeApplication in X.XXX seconds
```

访问：http://localhost:8080

## 测试 API

### 使用浏览器测试
- 访问个人信息接口：http://localhost:8080/api/personal-info
- 访问教育经历接口：http://localhost:8080/api/education
- 访问技能接口：http://localhost:8080/api/skill

### 使用 Postman 测试

示例：新增个人信息
```
POST http://localhost:8080/api/personal-info
Content-Type: application/json

{
  "name": "李四",
  "gender": "男",
  "birthDate": "1995-05-15",
  "phone": "13900139000",
  "email": "lisi@example.com",
  "address": "上海市浦东新区",
  "avatar": ""
}
```

## 常见问题

### 1. 端口被占用
修改 `application.yml` 中的端口号：
```yaml
server:
  port: 8080  # 改为其他端口，如 8081
```

### 2. 数据库连接失败
- 检查 MySQL 服务是否启动
- 检查数据库名、用户名、密码是否正确
- 检查防火墙设置

### 3. 中文乱码
确保 MySQL 使用了正确的字符集：
```sql
ALTER DATABASE resume_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

## 项目信息

- **启动类**: `ResumeApplication.java`
- **配置文件**: `application.yml`
- **API 基础路径**: `/api`
- **默认端口**: `8080`
- **跨域支持**: ✅ 已启用

## 下一步

1. 查看 README.md 了解完整的 API 文档
2. 查看 schema.sql 了解数据库表结构
3. 开始开发你的功能模块

祝开发愉快！🚀
