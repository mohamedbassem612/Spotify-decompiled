package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h6r0 {
    public static final h6r0 a;
    public static final h6r0 b;
    public static final h6r0 c;
    public static final /* synthetic */ h6r0[] d;

    static {
        h6r0 h6r0Var = new h6r0("IDLE", 0);
        a = h6r0Var;
        h6r0 h6r0Var2 = new h6r0("FOCUSED", 1);
        b = h6r0Var2;
        h6r0 h6r0Var3 = new h6r0("NOT_FOCUSED", 2);
        c = h6r0Var3;
        d = new h6r0[]{h6r0Var, h6r0Var2, h6r0Var3};
    }

    public static h6r0 valueOf(String str) {
        return (h6r0) Enum.valueOf(h6r0.class, str);
    }

    public static h6r0[] values() {
        return (h6r0[]) d.clone();
    }
}
