-- 创建数据库（命名为resume_db）

USE resume_db;

-- 1. 个人基础信息表
CREATE TABLE IF NOT EXISTS personal_info (
                                             id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                             name VARCHAR(20) NOT NULL COMMENT '姓名',
    gender VARCHAR(2) NOT NULL COMMENT '性别',
    birth_date VARCHAR(20) NOT NULL COMMENT '出生年月',
    address VARCHAR(50) NOT NULL COMMENT '现居地',
    phone VARCHAR(20) NOT NULL COMMENT '电话',
    email VARCHAR(50) NOT NULL COMMENT '邮箱',
    github_url VARCHAR(100) COMMENT 'GitHub链接',
    job_intention VARCHAR(50) NOT NULL COMMENT '求职意向',
    self_tag VARCHAR(100) NOT NULL COMMENT '个人标签',
    intro VARCHAR(500) NOT NULL COMMENT '一句话简介'
    ) COMMENT '个人基础信息表';

-- 2. 教育背景表
CREATE TABLE IF NOT EXISTS education (
                                         id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                         school VARCHAR(50) NOT NULL COMMENT '学校名称',
    major VARCHAR(50) NOT NULL COMMENT '专业',
    education VARCHAR(10) NOT NULL COMMENT '学历',
    start_time VARCHAR(20) NOT NULL COMMENT '开始时间',
    end_time VARCHAR(20) NOT NULL COMMENT '结束时间',
    core_course VARCHAR(200) COMMENT '核心课程',
    certificate VARCHAR(100) COMMENT '证书'
    ) COMMENT '教育背景表';

-- 3. 技能表
CREATE TABLE IF NOT EXISTS skill (
                                     id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                     skill_type VARCHAR(20) NOT NULL COMMENT '技能分类（后端/前端/数据库）',
    skill_name VARCHAR(30) NOT NULL COMMENT '技能名称',
    proficiency VARCHAR(10) NOT NULL COMMENT '熟练度（熟练/基础/了解）'
    ) COMMENT '技能表';

-- 4. 项目经验表
CREATE TABLE IF NOT EXISTS project (
                                       id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                       project_name VARCHAR(50) NOT NULL COMMENT '项目名称',
    start_time VARCHAR(20) NOT NULL COMMENT '开始时间',
    end_time VARCHAR(20) NOT NULL COMMENT '结束时间',
    role VARCHAR(30) NOT NULL COMMENT '角色',
    background VARCHAR(200) COMMENT '项目背景',
    responsibility VARCHAR(300) COMMENT '核心职责',
    tech_stack VARCHAR(200) COMMENT '技术栈',
    achievement VARCHAR(300) COMMENT '项目成果',
    github_link VARCHAR(100) COMMENT 'GitHub链接'
    ) COMMENT '项目经验表';

-- 5. 实践经历表
CREATE TABLE IF NOT EXISTS experience (
                                          id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                          start_time VARCHAR(20) NOT NULL COMMENT '开始时间',
    end_time VARCHAR(20) NOT NULL COMMENT '结束时间',
    title VARCHAR(50) NOT NULL COMMENT '经历标题',
    desc_content VARCHAR(300) NOT NULL COMMENT '经历描述'
    ) COMMENT '实践经历表';

-- 6. 荣誉奖励表
CREATE TABLE IF NOT EXISTS award (
                                     id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                     award_name VARCHAR(50) NOT NULL COMMENT '奖项名称',
    award_level VARCHAR(20) NOT NULL COMMENT '奖项等级'
    ) COMMENT '荣誉奖励表';

-- 7. 自我评价表
CREATE TABLE IF NOT EXISTS self_evaluation (
                                               id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                                               eval_content VARCHAR(500) NOT NULL COMMENT '自我评价内容',
    short_plan VARCHAR(500) COMMENT '短期规划',
    long_plan VARCHAR(500) COMMENT '长期规划'
    ) COMMENT '自我评价表';

-- 插入你的简历数据（复制直接执行）
INSERT INTO personal_info VALUES
    (1, '马斌', '男', '2004-08', '广西百色市', '18078649604', '2916336046@qq.com', 'https://github.com/aoma-0', '计算机相关部门实习生', '大专在读 | 全栈开发（Java+Vue） | 项目实战经验', '计算机应用技术专业在读，具备Java后端+Vue前端全栈开发能力，有多个实战项目经验，求职计算机相关实习生岗位，可快速上手基础开发/辅助工作。');

INSERT INTO education VALUES
    (1, '广西现代职业技术学院', '计算机应用技术', '大专', '2023年08月', '2026年08月（预计）', 'Java、Spring Boot、MySQL、Vue、JavaScript', 'Java Web 1+X初级证书、高等学校英语应用能力B级');

INSERT INTO skill VALUES
                      (1, '后端技术', 'Java', '熟练'),
                      (2, '后端技术', 'Spring Boot', '熟练'),
                      (3, '后端技术', 'MyBatis', '熟练'),
                      (4, '后端技术', 'API文档编写', '基础'),
                      (5, '前端技术', 'HTML/CSS', '熟练'),
                      (6, '前端技术', 'Vue/Vite', '熟练'),
                      (7, '前端技术', 'Element UI/Pinia', '熟练'),
                      (8, '前端技术', 'Axios', '熟练'),
                      (9, '数据库 & 其他', 'MySQL 9.0', '熟练'),
                      (10, '数据库 & 其他', '微信小程序', '基础'),
                      (11, '数据库 & 其他', 'Git版本管理', '基础'),
                      (12, '数据库 & 其他', 'Linux基础', '了解');

INSERT INTO project VALUES
                        (1, '后端管理系统', '2025.02', '2025.08', '个人全栈开发负责人', '为学习全栈开发，独立开发通用型后端管理系统，适配图书/物业管理场景。', '全流程负责（需求梳理→数据库设计→后端接口开发→前端页面实现→测试）。', 'MySQL 9.0、Spring Boot、MyBatis、Vue+Vite、Element UI、Pinia、Axios。', '完成核心数据库表设计与接口开发，实现前后端数据交互无报错，代码已上传GitHub。', 'https://github.com/aoma-0'),
                        (2, '图书管理系统', '开发中', '开发中', '独立开发', '学习型项目，聚焦图书管理场景', '实现图书增删改查、借阅/归还管理、用户权限控制等核心功能', 'Java、Spring Boot、MyBatis、Vue、MySQL', '完成核心功能开发，持续优化中', 'https://github.com/aoma-0'),
                        (3, '智慧物业管理系统', '开发中', '开发中', '独立开发', '学习型项目，聚焦物业管理场景', '实现业主信息管理、物业费缴纳、报修工单处理等功能模块', 'Java、Spring Boot、MyBatis、Vue、MySQL', '完成核心功能开发，持续优化中', 'https://github.com/aoma-0');

INSERT INTO experience VALUES
                           (1, '2023.06', '2026.08（预计）', '英豪机器有限公司 | 技工', '参与车辆配件产品制造，负责产品质量检测与打磨修正；主动向老员工请教解决问题，理解工业化生产逻辑，锻炼了主动学习、问题解决、沟通协作能力。'),
                           (2, '2023.10', '2025.08', '耐力突破计划 | 执行人', '制定2年耐力训练计划，累计训练路程500+公里，并在2025校运会取得优异成绩；锻炼了目标规划、执行力、抗压能力。'),
                           (3, '2024.10', '2024.10', '2024环广西公路自行车赛 | 志愿者', '联动交警部门开展安全隐患系统性排查，建立风险预判与对应机制；锻炼了责任心、团队协作、问题预判能力。');

INSERT INTO award VALUES
                      (1, '大学生网络安全知识竞赛', '荣誉证书'),
                      (2, '大学生计算机知识竞赛', '决赛一等奖');

INSERT INTO self_evaluation VALUES
    (1, '计算机应用技术专业在读，熟练掌握Java后端、Vue前端及MySQL数据库核心技能，具备全栈开发实战经验；做事有规划、执行力强，能主动请教解决问题，具备基础的英文文档阅读能力；对技术学习有持续热情，愿意从基础工作做起，快速适配团队节奏，为部门提供技术辅助支持。', '1. 快速熟悉公司业务流程与团队开发规范，掌握团队常用开发工具；2. 独立完成基础开发/测试/文档编写任务，主动配合团队完成工作；3. 积累实战经验，弥补理论与实践的差距，提升问题解决能力。', '深耕全栈开发方向，持续学习前沿技术，逐步具备独立负责功能模块的能力，成为一名能为团队创造价值的技术人员。');