package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zt40 {
    public static final zt40 a;
    public static final zt40 b;
    public static final /* synthetic */ zt40[] c;

    static {
        zt40 zt40Var = new zt40("AUTOMATIC", 0);
        a = zt40Var;
        zt40 zt40Var2 = new zt40("EXTERNAL_APP", 1);
        b = zt40Var2;
        c = new zt40[]{zt40Var, zt40Var2};
    }

    public static zt40 valueOf(String str) {
        return (zt40) Enum.valueOf(zt40.class, str);
    }

    public static zt40[] values() {
        return (zt40[]) c.clone();
    }
}
