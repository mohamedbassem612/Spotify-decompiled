package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class az31 {
    public static final az31 a;
    public static final az31 b;
    public static final az31 c;
    public static final /* synthetic */ az31[] d;

    static {
        az31 az31Var = new az31("IDLE", 0);
        a = az31Var;
        az31 az31Var2 = new az31("USER_INTERACTING", 1);
        b = az31Var2;
        az31 az31Var3 = new az31("ANIMATING_EXTERNAL", 2);
        c = az31Var3;
        d = new az31[]{az31Var, az31Var2, az31Var3};
    }

    public static az31 valueOf(String str) {
        return (az31) Enum.valueOf(az31.class, str);
    }

    public static az31[] values() {
        return (az31[]) d.clone();
    }
}
