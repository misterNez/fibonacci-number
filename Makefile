JCC	= javac
JFLAGS	= -g

PROG1	= Memo.class
OBJ1	= Memo.java

PROG2	= NoMemo.class
OBJ2	= NoMemo.java

all: $(PROG1) $(PROG2)

$(PROG1):	$(OBJ1)
	$(JCC) $(CFLAGS) $(OBJ1)

$(PROG2):	$(OBJ2)
	$(JCC) $(CFLAGS) $(OBJ2)

clean:
	rm -f *.class
