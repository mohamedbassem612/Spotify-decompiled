package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l2r0 {
    public static final l2r0 a;
    public static final l2r0 b;
    public static final l2r0 c;
    public static final /* synthetic */ l2r0[] d;

    static {
        l2r0 l2r0Var = new l2r0("NEW", 0);
        a = l2r0Var;
        l2r0 l2r0Var2 = new l2r0("EDIT", 1);
        b = l2r0Var2;
        l2r0 l2r0Var3 = new l2r0("VIEW", 2);
        c = l2r0Var3;
        d = new l2r0[]{l2r0Var, l2r0Var2, l2r0Var3};
    }

    public static l2r0 valueOf(String str) {
        return (l2r0) Enum.valueOf(l2r0.class, str);
    }

    public static l2r0[] values() {
        return (l2r0[]) d.clone();
    }
}
