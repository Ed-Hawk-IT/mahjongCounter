#run mahjong counter
driver_compile:
	javac -d classes Driver.java

src_compile:
	javac -d classes -sourcepath src src/*.java

run: src_compile driver_compile
	java Driver

#run test
compile_test: src_compile
	javac -d classes -cp "classes:junit-1.8.1.jar" ./MahjongTest.java

test: compile_test
	java -jar ./junit-1.8.1.jar -cp classes -c MahjongTest

# clean
clean:
	rm -rf classes