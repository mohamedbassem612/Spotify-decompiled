package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zkt0 {
    public static final zkt0 a;
    public static final zkt0 b;
    public static final zkt0 c;
    public static final /* synthetic */ zkt0[] d;

    static {
        zkt0 zkt0Var = new zkt0("PLAYING", 0);
        a = zkt0Var;
        zkt0 zkt0Var2 = new zkt0("PAUSED", 1);
        b = zkt0Var2;
        zkt0 zkt0Var3 = new zkt0("NONE", 2);
        c = zkt0Var3;
        d = new zkt0[]{zkt0Var, zkt0Var2, zkt0Var3};
    }

    public static zkt0 valueOf(String str) {
        return (zkt0) Enum.valueOf(zkt0.class, str);
    }

    public static zkt0[] values() {
        return (zkt0[]) d.clone();
    }
}
