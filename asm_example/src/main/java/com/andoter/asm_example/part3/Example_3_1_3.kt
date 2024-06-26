package com.andoter.asm_example.part3

data class Example_3_1_3(var name: String)

/*
通过 Tools -> Kotlin -> Show kotlin Bytecode 查看上面的 data class 的字节码

// ================com/andoter/asm_example/part3/Example_3_1_3.class =================
// class version 50.0 (50)
// access flags 0x31
public final class com/andoter/asm_example/part3/Example_3_1_3 {


  // access flags 0x2
  private Ljava/lang/String; name
  @Lorg/jetbrains/annotations/NotNull;() // invisible

  // access flags 0x11
  public final getName()Ljava/lang/String;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
   L0
    LINENUMBER 3 L0
    ALOAD 0
    GETFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lcom/andoter/asm_example/part3/Example_3_1_3; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  public final setName(Ljava/lang/String;)V
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 1
    LDC "<set-?>"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 3 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    RETURN
   L2
    LOCALVARIABLE this Lcom/andoter/asm_example/part3/Example_3_1_3; L0 L2 0
    LOCALVARIABLE <set-?> Ljava/lang/String; L0 L2 1
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public <init>(Ljava/lang/String;)V
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 1
    LDC "name"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 3 L1
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    ALOAD 0
    ALOAD 1
    PUTFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    RETURN
   L2
    LOCALVARIABLE this Lcom/andoter/asm_example/part3/Example_3_1_3; L0 L2 0
    LOCALVARIABLE name Ljava/lang/String; L0 L2 1
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x11
  public final component1()Ljava/lang/String;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
   L0
    ALOAD 0
    GETFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lcom/andoter/asm_example/part3/Example_3_1_3; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  public final copy(Ljava/lang/String;)Lcom/andoter/asm_example/part3/Example_3_1_3;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 1
    LDC "name"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
    NEW com/andoter/asm_example/part3/Example_3_1_3
    DUP
    ALOAD 1
    INVOKESPECIAL com/andoter/asm_example/part3/Example_3_1_3.<init> (Ljava/lang/String;)V
    ARETURN
   L1
    LOCALVARIABLE this Lcom/andoter/asm_example/part3/Example_3_1_3; L0 L1 0
    LOCALVARIABLE name Ljava/lang/String; L0 L1 1
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x1009
  public static synthetic copy$default(Lcom/andoter/asm_example/part3/Example_3_1_3;Ljava/lang/String;ILjava/lang/Object;)Lcom/andoter/asm_example/part3/Example_3_1_3;
    ILOAD 2
    ICONST_1
    IAND
    IFEQ L0
    ALOAD 0
    GETFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    ASTORE 1
   L0
    ALOAD 0
    ALOAD 1
    INVOKEVIRTUAL com/andoter/asm_example/part3/Example_3_1_3.copy (Ljava/lang/String;)Lcom/andoter/asm_example/part3/Example_3_1_3;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public toString()Ljava/lang/String;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "Example_3_1_3(name="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public hashCode()I
    ALOAD 0
    GETFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    DUP
    IFNULL L0
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
    GOTO L1
   L0
    POP
    ICONST_0
   L1
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    @Lorg/jetbrains/annotations/Nullable;() // invisible, parameter 0
    ALOAD 0
    ALOAD 1
    IF_ACMPEQ L0
    ALOAD 1
    INSTANCEOF com/andoter/asm_example/part3/Example_3_1_3
    IFEQ L1
    ALOAD 1
    CHECKCAST com/andoter/asm_example/part3/Example_3_1_3
    ASTORE 2
    ALOAD 0
    GETFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    ALOAD 2
    GETFIELD com/andoter/asm_example/part3/Example_3_1_3.name : Ljava/lang/String;
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L1
   L0
    ICONST_1
    IRETURN
   L1
    ICONST_0
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 3

  @Lkotlin/Metadata;(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0009\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0009\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0009\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0009\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\u0010"}, d2={"Lcom/andoter/asm_example/part3/Example_3_1_3;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "asm_example"})
  // compiled from: Example_3_1_3.kt
}


// ================META-INF/asm_example.kotlin_module =================
            




 */