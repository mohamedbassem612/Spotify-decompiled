package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zx10 {
    public static final zx10 a;
    public static final zx10 b;
    public static final zx10 c;
    public static final /* synthetic */ zx10[] d;

    static {
        zx10 zx10Var = new zx10("THUMBS_UP", 0);
        a = zx10Var;
        zx10 zx10Var2 = new zx10("THUMBS_DOWN", 1);
        b = zx10Var2;
        zx10 zx10Var3 = new zx10("NONE", 2);
        c = zx10Var3;
        d = new zx10[]{zx10Var, zx10Var2, zx10Var3};
    }

    public static zx10 valueOf(String str) {
        return (zx10) Enum.valueOf(zx10.class, str);
    }

    public static zx10[] values() {
        return (zx10[]) d.clone();
    }
}
