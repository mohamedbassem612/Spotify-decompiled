package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fmw0 {
    public static final fmw0 a;
    public static final fmw0 b;
    public static final /* synthetic */ fmw0[] c;

    static {
        fmw0 fmw0Var = new fmw0("IDLE", 0);
        a = fmw0Var;
        fmw0 fmw0Var2 = new fmw0("STREAMING", 1);
        b = fmw0Var2;
        c = new fmw0[]{fmw0Var, fmw0Var2};
    }

    public static fmw0 valueOf(String str) {
        return (fmw0) Enum.valueOf(fmw0.class, str);
    }

    public static fmw0[] values() {
        return (fmw0[]) c.clone();
    }
}
