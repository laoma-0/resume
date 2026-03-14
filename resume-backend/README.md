# 简历后端管理系统

基于 Spring Boot + MyBatis 的简历管理后端系统

## 技术栈

- Java 21
- Spring Boot 3.2.0
- MyBatis 3.0.3
- MySQL
- Maven
- Lombok

## 项目结构

```
src/main/java/com/mabin/resume/
├── ResumeApplication.java          # Spring Boot 启动类
├── config/                         # 配置类
│   └── WebConfig.java             # 跨域配置
├── controller/                     # 控制器层
│   ├── PersonalInfoController.java
│   ├── EducationController.java
│   ├── SkillController.java
│   ├── ProjectController.java
│   ├── ExperienceController.java
│   ├── AwardController.java
│   └── SelfEvaluationController.java
├── entity/                         # 实体类
│   ├── PersonalInfo.java
│   ├── Education.java
│   ├── Skill.java
│   ├── Project.java
│   ├── Experience.java
│   ├── Award.java
│   └── SelfEvaluation.java
├── mapper/                         # MyBatis Mapper 接口
│   ├── PersonalInfoMapper.java
│   ├── EducationMapper.java
│   ├── SkillMapper.java
│   ├── ProjectMapper.java
│   ├── ExperienceMapper.java
│   ├── AwardMapper.java
│   └── SelfEvaluationMapper.java
└── service/                        # 服务层
    ├── PersonalInfoService.java
    ├── EducationService.java
    ├── SkillService.java
    ├── ProjectService.java
    ├── ExperienceService.java
    ├── AwardService.java
    ├── SelfEvaluationService.java
    └── impl/                      # 服务实现类
        ├── PersonalInfoServiceImpl.java
        ├── EducationServiceImpl.java
        ├── SkillServiceImpl.java
        ├── ProjectServiceImpl.java
        ├── ExperienceServiceImpl.java
        ├── AwardServiceImpl.java
        └── SelfEvaluationServiceImpl.java
```

## 快速开始

### 1. 数据库配置

创建 MySQL 数据库并执行初始化脚本：

```bash
mysql -u root -p < src/main/resources/schema.sql
```

或者手动执行 `schema.sql` 文件中的 SQL 语句。

### 2. 修改配置文件

编辑 `src/main/resources/application.yml`，修改数据库连接信息：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/resume_db?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true
    username: your_username
    password: your_password
```

### 3. 运行项目

使用 Maven 运行项目：

```bash
mvn spring-boot:run
```

或者打包后运行：

```bash
mvn clean package
java -jar target/resume-backend-1.0-SNAPSHOT.jar
```

### 4. 访问接口

项目启动后，访问 http://localhost:8080

## API 接口说明

所有接口都支持跨域访问，基础路径为 `/api`

### 个人信息接口
- GET `/api/personal-info` - 获取所有个人信息
- GET `/api/personal-info/{id}` - 根据 ID 获取个人信息
- POST `/api/personal-info` - 新增个人信息
- PUT `/api/personal-info` - 更新个人信息
- DELETE `/api/personal-info/{id}` - 删除个人信息

### 教育经历接口
- GET `/api/education` - 获取所有教育经历
- GET `/api/education/{id}` - 根据 ID 获取教育经历
- POST `/api/education` - 新增教育经历
- PUT `/api/education` - 更新教育经历
- DELETE `/api/education/{id}` - 删除教育经历

### 技能接口
- GET `/api/skill` - 获取所有技能
- GET `/api/skill/{id}` - 根据 ID 获取技能
- POST `/api/skill` - 新增技能
- PUT `/api/skill` - 更新技能
- DELETE `/api/skill/{id}` - 删除技能

### 项目经历接口
- GET `/api/project` - 获取所有项目经历
- GET `/api/project/{id}` - 根据 ID 获取项目经历
- POST `/api/project` - 新增项目经历
- PUT `/api/project` - 更新项目经历
- DELETE `/api/project/{id}` - 删除项目经历

### 工作经历接口
- GET `/api/experience` - 获取所有工作经历
- GET `/api/experience/{id}` - 根据 ID 获取工作经历
- POST `/api/experience` - 新增工作经历
- PUT `/api/experience` - 更新工作经历
- DELETE `/api/experience/{id}` - 删除工作经历

### 获奖情况接口
- GET `/api/award` - 获取所有获奖情况
- GET `/api/award/{id}` - 根据 ID 获取获奖情况
- POST `/api/award` - 新增获奖情况
- PUT `/api/award` - 更新获奖情况
- DELETE `/api/award/{id}` - 删除获奖情况

### 自我评价接口
- GET `/api/self-evaluation` - 获取所有自我评价
- GET `/api/self-evaluation/{id}` - 根据 ID 获取自我评价
- POST `/api/self-evaluation` - 新增自我评价
- PUT `/api/self-evaluation` - 更新自我评价
- DELETE `/api/self-evaluation/{id}` - 删除自我评价

## 数据表说明

1. **personal_info** - 个人信息表
2. **education** - 教育经历表
3. **skill** - 技能表
4. **project** - 项目经历表
5. **experience** - 工作经历表
6. **award** - 获奖情况表
7. **self_evaluation** - 自我评价表

详细表结构请查看 `schema.sql` 文件

## 注意事项

1. 确保已安装 Java 21 和 Maven
2. 确保 MySQL 数据库已启动
3. 首次运行需要执行 `schema.sql` 初始化数据库
4. 默认端口为 8080，可在 `application.yml` 中修改
5. 已配置跨域访问，可直接被前端项目调用

## 开发工具推荐

- IntelliJ IDEA
- MySQL Workbench
- Postman (API 测试)
