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
キャッシュをクリアしてビルド
(docker-compose build --no-cache)

コンテナを起動
(docker-compose up -d)

コンテナに作成したJava24の環境でファイル編集・デバッグ等を行う
(Ctrl + Shift + P → Devcontainerに対してAttachを選択)