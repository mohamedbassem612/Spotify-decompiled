package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gv50 {
    public static final gv50 a;
    public static final gv50 b;
    public static final /* synthetic */ gv50[] c;

    static {
        gv50 gv50Var = new gv50("NEXT", 0);
        a = gv50Var;
        gv50 gv50Var2 = new gv50("SKIP", 1);
        b = gv50Var2;
        c = new gv50[]{gv50Var, gv50Var2};
    }

    public static gv50 valueOf(String str) {
        return (gv50) Enum.valueOf(gv50.class, str);
    }

    public static gv50[] values() {
        return (gv50[]) c.clone();
    }
}
