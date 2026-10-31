package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jf40 {
    public static final jf40 a;
    public static final jf40 b;
    public static final jf40 c;
    public static final jf40 d;
    public static final jf40 e;
    public static final jf40 f;
    public static final jf40 g;
    public static final /* synthetic */ jf40[] h;

    static {
        jf40 jf40Var = new jf40("GET_MEMOIZED_IS_INITIALIZED", 0);
        a = jf40Var;
        jf40 jf40Var2 = new jf40("SET_MEMOIZED_IS_INITIALIZED", 1);
        b = jf40Var2;
        jf40 jf40Var3 = new jf40("BUILD_MESSAGE_INFO", 2);
        c = jf40Var3;
        jf40 jf40Var4 = new jf40("NEW_MUTABLE_INSTANCE", 3);
        d = jf40Var4;
        jf40 jf40Var5 = new jf40("NEW_BUILDER", 4);
        e = jf40Var5;
        jf40 jf40Var6 = new jf40("GET_DEFAULT_INSTANCE", 5);
        f = jf40Var6;
        jf40 jf40Var7 = new jf40("GET_PARSER", 6);
        g = jf40Var7;
        h = new jf40[]{jf40Var, jf40Var2, jf40Var3, jf40Var4, jf40Var5, jf40Var6, jf40Var7};
    }

    public static jf40 valueOf(String str) {
        return (jf40) Enum.valueOf(jf40.class, str);
    }

    public static jf40[] values() {
        return (jf40[]) h.clone();
    }
}
