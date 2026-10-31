package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class fmv0 {
    public static final q8a0 a = new q8a0(iep0.b, false);
    public static final q8a0 b;
    public static final q8a0 c;
    public static final LinkedHashMap d;

    static {
        iep0 iep0Var = iep0.c;
        b = new q8a0(iep0Var, false);
        c = new q8a0(iep0Var, true);
        dn81 dn81Var = new dn81((byte) 0);
        new nn61(dn81Var, "java/util/Iterator", (byte) 19).b("forEachRemaining", (String) null, new ryq((byte) 10));
        new nn61(dn81Var, "java/lang/Iterable", (byte) 19).b("spliterator", (String) null, new ryq((byte) 21));
        nn61 nn61Var = new nn61(dn81Var, "java/util/Collection", (byte) 19);
        nn61Var.b("removeIf", (String) null, new emv0((byte) 2));
        nn61Var.b("stream", (String) null, new emv0((byte) 13));
        nn61Var.b("parallelStream", (String) null, new emv0((byte) 18));
        nn61 nn61Var2 = new nn61(dn81Var, "java/util/List", (byte) 19);
        nn61Var2.b("replaceAll", (String) null, new emv0((byte) 19));
        nn61Var2.b("addFirst", "2.1", new emv0((byte) 20));
        nn61Var2.b("addLast", "2.1", new emv0((byte) 21));
        nn61Var2.b("removeFirst", "2.1", new emv0((byte) 22));
        nn61Var2.b("removeLast", "2.1", new emv0((byte) 23));
        nn61 nn61Var3 = new nn61(dn81Var, "java/util/LinkedList", (byte) 19);
        nn61Var3.b("addFirst", "2.1", new ryq((byte) 11));
        nn61Var3.b("addLast", "2.1", new ryq((byte) 12));
        nn61Var3.b("removeFirst", "2.1", new ryq((byte) 13));
        nn61Var3.b("removeLast", "2.1", new ryq((byte) 14));
        nn61 nn61Var4 = new nn61(dn81Var, "java/util/LinkedHashSet", (byte) 19);
        nn61Var4.b("addFirst", "2.2", new ryq((byte) 15));
        nn61Var4.b("addLast", "2.2", new ryq((byte) 16));
        nn61Var4.b("removeFirst", "2.2", new ryq((byte) 17));
        nn61Var4.b("removeLast", "2.2", new ryq((byte) 18));
        nn61Var4.b("getFirst", "2.2", new ryq((byte) 19));
        nn61Var4.b("getLast", "2.2", new ryq((byte) 20));
        nn61 nn61Var5 = new nn61(dn81Var, "java/util/Map", (byte) 19);
        nn61Var5.b("forEach", (String) null, new ryq((byte) 22));
        nn61Var5.b("putIfAbsent", (String) null, new ryq((byte) 23));
        nn61Var5.b("replace", (String) null, new ryq((byte) 24));
        nn61Var5.b("replace", (String) null, new ryq((byte) 25));
        nn61Var5.b("replaceAll", (String) null, new ryq((byte) 26));
        nn61Var5.b("compute", (String) null, new ryq((byte) 27));
        nn61Var5.b("computeIfAbsent", (String) null, new ryq((byte) 28));
        nn61Var5.b("computeIfPresent", (String) null, new ryq((byte) 29));
        nn61Var5.b("merge", (String) null, new emv0((byte) 0));
        nn61 nn61Var6 = new nn61(dn81Var, "java/util/LinkedHashMap", (byte) 19);
        nn61Var6.b("putFirst", "2.2", new emv0((byte) 1));
        nn61Var6.b("putLast", "2.2", new emv0((byte) 3));
        nn61 nn61Var7 = new nn61(dn81Var, "java/util/Optional", (byte) 19);
        nn61Var7.b("empty", (String) null, new emv0((byte) 4));
        nn61Var7.b("of", (String) null, new emv0((byte) 5));
        nn61Var7.b("ofNullable", (String) null, new emv0((byte) 6));
        nn61Var7.b("get", (String) null, new emv0((byte) 7));
        nn61Var7.b("ifPresent", (String) null, new emv0((byte) 8));
        new nn61(dn81Var, "java/lang/ref/Reference", (byte) 19).b("get", (String) null, new emv0((byte) 9));
        new nn61(dn81Var, "java/util/function/Predicate", (byte) 19).b("test", (String) null, new emv0((byte) 10));
        new nn61(dn81Var, "java/util/function/BiPredicate", (byte) 19).b("test", (String) null, new emv0((byte) 11));
        new nn61(dn81Var, "java/util/function/Consumer", (byte) 19).b("accept", (String) null, new emv0((byte) 12));
        new nn61(dn81Var, "java/util/function/BiConsumer", (byte) 19).b("accept", (String) null, new emv0((byte) 14));
        new nn61(dn81Var, "java/util/function/Function", (byte) 19).b("apply", (String) null, new emv0((byte) 15));
        new nn61(dn81Var, "java/util/function/BiFunction", (byte) 19).b("apply", (String) null, new emv0((byte) 16));
        new nn61(dn81Var, "java/util/function/Supplier", (byte) 19).b("get", (String) null, new emv0((byte) 17));
        d = (LinkedHashMap) dn81Var.b;
    }
}
