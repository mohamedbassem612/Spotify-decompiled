package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rcn0 {
    public static final rcn0 a;
    public static final rcn0 b;
    public static final /* synthetic */ rcn0[] c;

    static {
        rcn0 rcn0Var = new rcn0("READ_ONLY", 0);
        a = rcn0Var;
        rcn0 rcn0Var2 = new rcn0("MUTABLE", 1);
        b = rcn0Var2;
        c = new rcn0[]{rcn0Var, rcn0Var2};
    }

    public static rcn0 valueOf(String str) {
        return (rcn0) Enum.valueOf(rcn0.class, str);
    }

    public static rcn0[] values() {
        return (rcn0[]) c.clone();
    }
}
