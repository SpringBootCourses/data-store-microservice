# Data store microservice

This is data store microservice
for [YouTube course](https://www.youtube.com/playlist?list=PL3Ur78l82EFBhKojbSO26BVqQ7n4AthHC).

This application receives data
from [Data analyser service](https://github.com/IlyaLisov/data-analyser-microservice)
with Apache Kafka and Debezium.

### Usage

To start an application you need to pass variables to `.env` file.

You can find Docker compose file
in [Data analyser service](https://github.com/IlyaLisov/data-analyser-microservice) `docker/docker-compose.yaml`.

Application is running on port `8083`.

All insignificant features (checkstyle, build check, dto validation) are not
presented.

#### Example:

```agsl
REDIS_HOST=localhost
REDIS_PORT=6379
KAFKA_BOOTSTRAP_SERVERS=localhost:9092
DEBEZIUM_KAFKA_BROKER_ID=2
```

Just after startup application will try to connect to Apache Kafka and begin to
listen topics from `data` topic created by Debezium.
