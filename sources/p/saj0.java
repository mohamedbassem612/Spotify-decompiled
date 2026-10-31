package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class saj0 {
    public static final saj0 a;
    public static final saj0 b;
    public static final saj0 c;
    public static final /* synthetic */ saj0[] d;

    static {
        saj0 saj0Var = new saj0("SortOrder", 0);
        a = saj0Var;
        saj0 saj0Var2 = new saj0("VideoMode", 1);
        b = saj0Var2;
        saj0 saj0Var3 = new saj0("SortOrderAndVideoMode", 2);
        c = saj0Var3;
        d = new saj0[]{saj0Var, saj0Var2, saj0Var3};
    }

    public static saj0 valueOf(String str) {
        return (saj0) Enum.valueOf(saj0.class, str);
    }

    public static saj0[] values() {
        return (saj0[]) d.clone();
    }
}
