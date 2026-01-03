#run mahjong counter
driver_compile:
	javac -d classes -sourcepath src Driver

src_compile:
	javac -d classes -sourcepath src src/*.java

run: src_compile driver_compile
	java Driver

#run test
compile_test: src_compile
	javac -d classes -cp "./test/junit-1.8.1.jar:src"  ./Test.java

test: compile_test
	java -jar ./test/junit-1.8.1.jar -cp classes -c Test

# clean
clean:
	rm -rf classes output.txt