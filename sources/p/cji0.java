package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cji0 {
    public static final cji0 a;
    public static final cji0 b;
    public static final cji0 c;
    public static final /* synthetic */ cji0[] d;

    static {
        cji0 cji0Var = new cji0("None", 0);
        a = cji0Var;
        cji0 cji0Var2 = new cji0("CanBeFollowed", 1);
        b = cji0Var2;
        cji0 cji0Var3 = new cji0("CanBeUnFollowed", 2);
        c = cji0Var3;
        d = new cji0[]{cji0Var, cji0Var2, cji0Var3};
    }

    public static cji0 valueOf(String str) {
        return (cji0) Enum.valueOf(cji0.class, str);
    }

    public static cji0[] values() {
        return (cji0[]) d.clone();
    }
}
