package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zfe0 {
    public static final zfe0 a;
    public static final zfe0 b;
    public static final /* synthetic */ zfe0[] c;

    static {
        zfe0 zfe0Var = new zfe0("PLAYING", 0);
        a = zfe0Var;
        zfe0 zfe0Var2 = new zfe0("NOT_PLAYING", 1);
        b = zfe0Var2;
        c = new zfe0[]{zfe0Var, zfe0Var2};
        new jma((byte) 15);
    }

    public static zfe0 valueOf(String str) {
        return (zfe0) Enum.valueOf(zfe0.class, str);
    }

    public static zfe0[] values() {
        return (zfe0[]) c.clone();
    }
}
