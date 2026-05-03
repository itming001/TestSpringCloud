# Spring Cloud Gateway + Nacos 教学示例

这是一个偏教学用途的最小可运行项目，重点是 **Gateway**，并接入 **Nacos 注册中心/配置中心**。

## 包含内容
- Spring Cloud Gateway 路由转发（`/api/user/**`、`/api/order/**`）
- 基于服务名的负载均衡转发（`lb://service-name`）
- 全局过滤器注入 `X-Trace-Id`
- Nacos Discovery + Nacos Config 基础配置
- Gateway Actuator 端点

## 启动前准备
1. 启动 Nacos（默认地址 `127.0.0.1:8848`）
2. 在 Nacos 中准备下游服务（例如 `user-service`、`order-service`）

## 本地启动
```bash
mvn spring-boot:run
```

## 测试请求示例
```bash
curl http://localhost:8080/api/user/profile
curl http://localhost:8080/api/order/list
```

## 可覆盖环境变量
- `NACOS_SERVER_ADDR`
- `NACOS_NAMESPACE`
- `NACOS_GROUP`
- `NACOS_USERNAME`
- `NACOS_PASSWORD`

> 说明：你给的飞书文档链接在当前环境无法直接读取（需要权限），所以我先按常见教学大纲给出一版“Gateway 为主 + Nacos”的讲师示例代码。
