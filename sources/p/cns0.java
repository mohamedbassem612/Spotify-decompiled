package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cns0 {
    public static final cns0 a;
    public static final cns0 b;
    public static final cns0 c;
    public static final cns0 d;
    public static final /* synthetic */ cns0[] e;

    static {
        cns0 cns0Var = new cns0("PlayNewContext", 0);
        a = cns0Var;
        cns0 cns0Var2 = new cns0("AddToQueue", 1);
        b = cns0Var2;
        cns0 cns0Var3 = new cns0("HostPaused", 2);
        c = cns0Var3;
        cns0 cns0Var4 = new cns0("Unspecified", 3);
        d = cns0Var4;
        e = new cns0[]{cns0Var, cns0Var2, cns0Var3, cns0Var4};
    }

    public static cns0 valueOf(String str) {
        return (cns0) Enum.valueOf(cns0.class, str);
    }

    public static cns0[] values() {
        return (cns0[]) e.clone();
    }
}
