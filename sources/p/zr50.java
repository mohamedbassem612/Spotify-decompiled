package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zr50 {
    public static final zr50 a;
    public static final zr50 b;
    public static final zr50 c;
    public static final /* synthetic */ zr50[] d;

    static {
        zr50 zr50Var = new zr50("None", 0);
        a = zr50Var;
        zr50 zr50Var2 = new zr50("Selection", 1);
        b = zr50Var2;
        zr50 zr50Var3 = new zr50("Cursor", 2);
        c = zr50Var3;
        d = new zr50[]{zr50Var, zr50Var2, zr50Var3};
    }

    public static zr50 valueOf(String str) {
        return (zr50) Enum.valueOf(zr50.class, str);
    }

    public static zr50[] values() {
        return (zr50[]) d.clone();
    }
}
