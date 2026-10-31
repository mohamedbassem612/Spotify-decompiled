package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zaz0 {
    public static final zaz0 a;
    public static final zaz0 b;
    public static final zaz0 c;
    public static final /* synthetic */ zaz0[] d;

    static {
        zaz0 zaz0Var = new zaz0("CAPPED", 0);
        a = zaz0Var;
        zaz0 zaz0Var2 = new zaz0("NOT_CAPPED", 1);
        b = zaz0Var2;
        zaz0 zaz0Var3 = new zaz0("UNKNOWN", 2);
        c = zaz0Var3;
        d = new zaz0[]{zaz0Var, zaz0Var2, zaz0Var3};
    }

    public static zaz0 valueOf(String str) {
        return (zaz0) Enum.valueOf(zaz0.class, str);
    }

    public static zaz0[] values() {
        return (zaz0[]) d.clone();
    }
}
