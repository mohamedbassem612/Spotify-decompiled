package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n5w0 {
    public static final n5w0 a;
    public static final n5w0 b;
    public static final n5w0 c;
    public static final n5w0 d;
    public static final /* synthetic */ n5w0[] e;

    static {
        n5w0 n5w0Var = new n5w0("Enough", 0);
        a = n5w0Var;
        n5w0 n5w0Var2 = new n5w0("TooFew", 1);
        b = n5w0Var2;
        n5w0 n5w0Var3 = new n5w0("OutgoingRowMissing", 2);
        c = n5w0Var3;
        n5w0 n5w0Var4 = new n5w0("FetchFailed", 3);
        d = n5w0Var4;
        e = new n5w0[]{n5w0Var, n5w0Var2, n5w0Var3, n5w0Var4};
    }

    public static n5w0 valueOf(String str) {
        return (n5w0) Enum.valueOf(n5w0.class, str);
    }

    public static n5w0[] values() {
        return (n5w0[]) e.clone();
    }
}
