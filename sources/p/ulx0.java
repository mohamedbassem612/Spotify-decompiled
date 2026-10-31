package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ulx0 {
    public static final ulx0 a;
    public static final ulx0 b;
    public static final ulx0 c;
    public static final /* synthetic */ ulx0[] d;

    static {
        ulx0 ulx0Var = new ulx0("RESERVED_ANNOUNCE", 0);
        a = ulx0Var;
        ulx0 ulx0Var2 = new ulx0("RESERVED_SALE", 1);
        b = ulx0Var2;
        ulx0 ulx0Var3 = new ulx0("OTHER", 2);
        c = ulx0Var3;
        d = new ulx0[]{ulx0Var, ulx0Var2, ulx0Var3};
    }

    public static ulx0 valueOf(String str) {
        return (ulx0) Enum.valueOf(ulx0.class, str);
    }

    public static ulx0[] values() {
        return (ulx0[]) d.clone();
    }
}
