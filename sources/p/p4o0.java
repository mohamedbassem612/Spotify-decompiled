package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p4o0 {
    public static final p4o0 a;
    public static final p4o0 b;
    public static final p4o0 c;
    public static final p4o0 d;
    public static final /* synthetic */ p4o0[] e;

    static {
        p4o0 p4o0Var = new p4o0("Granted", 0);
        a = p4o0Var;
        p4o0 p4o0Var2 = new p4o0("DeniedOnce", 1);
        b = p4o0Var2;
        p4o0 p4o0Var3 = new p4o0("DeniedTwice", 2);
        c = p4o0Var3;
        p4o0 p4o0Var4 = new p4o0("NeverDenied", 3);
        d = p4o0Var4;
        e = new p4o0[]{p4o0Var, p4o0Var2, p4o0Var3, p4o0Var4};
    }

    public static p4o0 valueOf(String str) {
        return (p4o0) Enum.valueOf(p4o0.class, str);
    }

    public static p4o0[] values() {
        return (p4o0[]) e.clone();
    }
}
