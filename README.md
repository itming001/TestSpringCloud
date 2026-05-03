# Spring Cloud Gateway + Nacos 教学示例

这是一个偏教学用途的最小可运行项目，重点是 **Gateway**，并接入 **Nacos 注册中心/配置中心**。

## 项目结构
- `.`: 网关服务 `lecturer-gateway`（端口 8080）
- `user-service`: 用户测试微服务（端口 9001）
- `order-service`: 订单测试微服务（端口 9002）

## 包含内容
- Spring Cloud Gateway 路由转发（`/api/user/**`、`/api/order/**`）
- 基于服务名的负载均衡转发（`lb://user-service`、`lb://order-service`）
- 全局过滤器注入 `X-Trace-Id`
- 两个测试微服务自动注册到 Nacos

## 启动顺序
1. 启动 Nacos（默认地址 `127.0.0.1:8848`）
2. 启动 user-service
   ```bash
   cd user-service && mvn spring-boot:run
   ```
3. 启动 order-service
   ```bash
   cd order-service && mvn spring-boot:run
   ```
4. 启动 gateway
   ```bash
   cd /workspace/TestSpringCloud && mvn spring-boot:run
   ```

## 访问验证（通过 Gateway）
```bash
curl http://localhost:8080/api/user/user/profile
curl http://localhost:8080/api/order/order/list
```

## 说明
你给的飞书文档链接在当前环境无法直接读取（需要权限），所以当前是按常见授课场景给的 Gateway + Nacos + 两个测试服务版本。
