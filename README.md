```
./gradlew clean build
```
```
docker build . -t rezacomplete/user
```
```
docker push docker.io/rezacomplete/user
```
```
kubectl apply -f configmap.yml
```
```
kubectl apply -f workloads.yml
```
```
kubectl apply -f services.yml
```
```
curl --request GET 'http://localhost:8084/users/rezacomplete@gmail.com'
```
```
docker run -p 8085:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:18.0.0 start-dev

```
```
curl --location --request POST 'http://localhost:8085/realms/master/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=test-client-id' \
--data-urlencode 'client_secret=MzBcVSPICThgd0AlsfxwAK264e2c4bHH' \
--data-urlencode 'scope=openid' \
--data-urlencode 'grant_type=client_credentials'
```
```
kubectl delete -f .
```
