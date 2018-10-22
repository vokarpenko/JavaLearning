package styd;

public class styd {
String fio;
int age;
int group;
double av;
styd(String fio, int age, int group, double av){
	this.fio = fio;
	this.age = age;
	this.group = group;
	this.av = av;
}
String getFio() {
	return fio;
}
int getAge() {
	return age;
}
int group() {
	return group;
}
double av() {
	return av;
}
void setFio(String fio) {
	this.fio = fio ;
}
void setAge(int age) {
	this.age = age ;
}
void setGroup(int group) {
	this.group = group;
}
void setAv(double av) {
	this.av=av;
}
public String toString() {
	return "ФИО " + fio+ "\n Возраст "+ age + "\n Группа " + group + "\n Средний балл " + av;
}
}

