# 🌟 Kika: AI 答题应用平台 🌟

Kika 是一款综合利用 Vue 3、Spring Boot、Redis、ChatGLM、RxJava 和 SSE 技术打造的 **AI 答题应用平台**。用户能够快速基于 AI 创建并发布答题应用，支持功能包括检索、分享、在线答题及 AI 生成的回答总结；管理员则可以集中管理和审核应用。

---

## Kika Logo
<img src="https://github.com/AiChiXiaoXiongBingGan/Kika-front/blob/master/public/logo.png" alt="My Image" width="300" />

## 一、项目介绍

**什么是答题应用？**

许多人都体验过 MBTI 性格测试，这类测试通常包含多道题目，用户根据题目选择相应选项，最终提交答案并获得性格分析结果。

在本项目中，我们将开发一个 `答题应用平台`，使任何人都能在平台上创建和发布自己的答题应用，同时可以体验其他用户创建的应用。

同时还会基于AI赋能答题应用平台，实现ai生成与ai判别

---

## 二、项目功能梳理

### 平台功能

- **用户模块**
  - 📝 注册
  - 🔐 登录
  - 👥 管理用户（增删改查，仅管理员可用）

- **应用模块**
  - 📱 创建应用（名称、描述、上传图片、应用类型）
  - 🛠 用户修改应用
  - ✅ 管理员审核发布和下架应用
  - 📋 管理员管理应用（增删改查）
  - 📲 应用分享（扫码查看）

- **题目模块**
  - 📝 创建题目（名称、选项）
  - 🛠 修改题目
  - ❌ 删除题目
  - 🤖 AI 生成题目

- **评分模块**
  - 📊 多种评分策略
  - 📝 创建评分结果
  - ⚙️ 题目得分设置

- **回答模块**
  - 📝 提交选择
  - 🗂 回答记录
  - 🤖 AI 分析总结回答

- **统计分析模块**
  - 📈 应用评分结果分析

---

## 三、技术选型

### 开发工具

- **前端 IDE**：JetBrains WebStorm
- **后端 IDE**：JetBrains IDEA

### 后端技术栈

- **开发框架**：Java Spring Boot（万用后端模板）
- **数据存储**：MySQL 数据库 + Redis 缓存 + 腾讯云 COS 对象存储
- **代码生成**：MyBatis-Plus 及 MyBatis X
- **分布式锁**：Redission
- **本地缓存**：Caffeine
- **AI 能力**：基于 ChatGLM 大模型
- **响应式框架**：RxJava + 多线程 / 线程池实战
- **分库分表**：Shardingsphere + 分布式 ID 雪花算法
- **服务端推送**：SSE
- **设计模式**：多种设计模式
- **项目优化**：性能、稳定性、幂等性优化等

---

## 项目概览
<img src="https://github.com/AiChiXiaoXiongBingGan/Kika-front/blob/master/text1.png" alt="My Image" width="1000" />
<img src="https://github.com/AiChiXiaoXiongBingGan/Kika-front/blob/master/text2.png" alt="My Image" width="1000" />
<img src="https://github.com/AiChiXiaoXiongBingGan/Kika-front/blob/master/text3.png" alt="My Image" width="1000" />

