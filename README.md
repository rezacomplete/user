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
kubectl apply -f workloads.yml
```
```
kubectl apply -f services.yml
```
```
curl --request GET 'http://localhost:30020/users/rezacomplete@gmail.com'
```
```
curl --request GET 'http://localhost:30021/users/rezacomplete@gmail.com/posts' 
```
```
curl --request GET 'http://localhost:30022/users/rezacomplete@gmail.com/educations' 
```
```
kubectl delete -f .
```
