package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a7o0 {
    public static final a7o0 a;
    public static final a7o0 b;
    public static final a7o0 c;
    public static final a7o0 d;
    public static final /* synthetic */ a7o0[] e;

    static {
        a7o0 a7o0Var = new a7o0("UNMETERED", 0);
        a = a7o0Var;
        a7o0 a7o0Var2 = new a7o0("CELLULAR", 1);
        b = a7o0Var2;
        a7o0 a7o0Var3 = new a7o0("EXPENSIVE", 2);
        c = a7o0Var3;
        a7o0 a7o0Var4 = new a7o0("CONSTRAINED", 3);
        d = a7o0Var4;
        e = new a7o0[]{a7o0Var, a7o0Var2, a7o0Var3, a7o0Var4};
    }

    public static a7o0 valueOf(String str) {
        return (a7o0) Enum.valueOf(a7o0.class, str);
    }

    public static a7o0[] values() {
        return (a7o0[]) e.clone();
    }
}
