package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qdh0 {
    public static final qdh0 a;
    public static final qdh0 b;
    public static final qdh0 c;
    public static final /* synthetic */ qdh0[] d;

    static {
        qdh0 qdh0Var = new qdh0("NORMAL", 0);
        a = qdh0Var;
        qdh0 qdh0Var2 = new qdh0("LINK_TEXT", 1);
        b = qdh0Var2;
        qdh0 qdh0Var3 = new qdh0("LINK_URL", 2);
        c = qdh0Var3;
        d = new qdh0[]{qdh0Var, qdh0Var2, qdh0Var3};
    }

    public static qdh0 valueOf(String str) {
        return (qdh0) Enum.valueOf(qdh0.class, str);
    }

    public static qdh0[] values() {
        return (qdh0[]) d.clone();
    }
}
