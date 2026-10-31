package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zw51 {
    public static final zw51 a;
    public static final zw51 b;
    public static final zw51 c;
    public static final /* synthetic */ zw51[] d;

    static {
        zw51 zw51Var = new zw51("Hidden", 0);
        a = zw51Var;
        zw51 zw51Var2 = new zw51("Selected", 1);
        b = zw51Var2;
        zw51 zw51Var3 = new zw51("NotSelected", 2);
        c = zw51Var3;
        d = new zw51[]{zw51Var, zw51Var2, zw51Var3};
    }

    public static zw51 valueOf(String str) {
        return (zw51) Enum.valueOf(zw51.class, str);
    }

    public static zw51[] values() {
        return (zw51[]) d.clone();
    }
}
