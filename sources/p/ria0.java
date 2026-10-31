package p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ria0 {
    public static final LinkedHashSet a = dm61.x0("java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;", i2x0.f("Collection", new String[]{"toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"}));
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;
    public static final LinkedHashSet g;

    static {
        List<nja0> listM = p7h.M(new nja0[]{nja0.e, nja0.f});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (nja0 nja0Var : listM) {
            String strB = nja0Var.d.a.g().b();
            String[] strArr = {nja0Var.b + "Value()" + nja0Var.c};
            String strConcat = "java/lang/".concat(strB);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str : strArr2) {
                linkedHashSet2.add(strConcat + '.' + str);
            }
            r7h.W(linkedHashSet2, linkedHashSet);
        }
        b = dm61.y0(dm61.y0(dm61.y0(dm61.y0(dm61.y0(dm61.y0(linkedHashSet, i2x0.f("List", new String[]{"sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;"})), i2x0.e("String", new String[]{"codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"})), i2x0.e("Double", new String[]{"isInfinite()Z", "isNaN()Z"})), i2x0.e("Float", new String[]{"isInfinite()Z", "isNaN()Z"})), i2x0.e("Enum", new String[]{"getDeclaringClass()Ljava/lang/Class;", "finalize()V"})), i2x0.e("CharSequence", new String[]{"isEmpty()Z"}));
        c = i2x0.f("List", new String[]{"getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;"});
        d = dm61.y0(dm61.y0(dm61.y0(dm61.y0(dm61.y0(dm61.y0(i2x0.e("CharSequence", new String[]{"codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"}), i2x0.f("Iterator", new String[]{"forEachRemaining(Ljava/util/function/Consumer;)V"})), i2x0.e("Iterable", new String[]{"forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"})), i2x0.e("Throwable", new String[]{"setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"})), i2x0.f("Collection", new String[]{"spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"})), i2x0.f("List", new String[]{"replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;"})), i2x0.f("Map", new String[]{"getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"}));
        e = dm61.y0(dm61.y0(i2x0.f("Collection", new String[]{"removeIf(Ljava/util/function/Predicate;)Z"}), i2x0.f("List", new String[]{"replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;"})), i2x0.f("Map", new String[]{"computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"}));
        nja0 nja0Var2 = nja0.e;
        nja0 nja0Var3 = nja0.g;
        List listM2 = p7h.M(new nja0[]{nja0Var2, nja0Var3, nja0.Y, nja0.t, nja0Var3, nja0.i, nja0.X, nja0.h});
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = listM2.iterator();
        while (it.hasNext()) {
            String strB2 = ((nja0) it.next()).d.a.g().b();
            String[] strArrA = i2x0.a(new String[]{"Ljava/lang/String;"});
            r7h.W(i2x0.e(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)), linkedHashSet3);
        }
        String[] strArrA2 = i2x0.a(new String[]{"D"});
        LinkedHashSet linkedHashSetY0 = dm61.y0(linkedHashSet3, i2x0.e("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = i2x0.a(new String[]{"[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;"});
        f = dm61.y0(linkedHashSetY0, i2x0.e("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = i2x0.a(new String[]{"Ljava/lang/String;Ljava/lang/Throwable;ZZ"});
        g = i2x0.e("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }
}
