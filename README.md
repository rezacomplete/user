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
kubectl delete -f .
```
