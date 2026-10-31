package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gq50 {
    public static final gq50 a;
    public static final gq50 b;
    public static final gq50 c;
    public static final gq50 d;
    public static final /* synthetic */ gq50[] e;

    static {
        gq50 gq50Var = new gq50("UNKNOWN", 0);
        a = gq50Var;
        gq50 gq50Var2 = new gq50("GROUPED", 1);
        b = gq50Var2;
        gq50 gq50Var3 = new gq50("GROUPABLE", 2);
        c = gq50Var3;
        gq50 gq50Var4 = new gq50("CONNECTING", 3);
        d = gq50Var4;
        e = new gq50[]{gq50Var, gq50Var2, gq50Var3, gq50Var4};
    }

    public static gq50 valueOf(String str) {
        return (gq50) Enum.valueOf(gq50.class, str);
    }

    public static gq50[] values() {
        return (gq50[]) e.clone();
    }
}
