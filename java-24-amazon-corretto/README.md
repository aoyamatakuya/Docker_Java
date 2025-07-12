# Java 24 Amazon Corretto Dockerコンテナ

このリポジトリは、Amazon Corretto 24を使ったJava実行環境のDockerコンテナを構築します。

---

## 必要条件

- Docker
- Docker Compose

---

## コンテナのビルドと起動

1. リポジトリのルートディレクトリで以下を実行し、Dockerイメージをビルド＆コンテナをバックグラウンドで起動します。

```bash
docker-compose up -d --build