package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vh61 {
    public static final vh61 a;
    public static final vh61 b;
    public static final vh61 c;
    public static final vh61 d;
    public static final /* synthetic */ vh61[] e;

    static {
        vh61 vh61Var = new vh61("ONLINE_AND_LOGGED_IN", 0);
        a = vh61Var;
        vh61 vh61Var2 = new vh61("NOT_LOGGED_IN", 1);
        b = vh61Var2;
        vh61 vh61Var3 = new vh61("OFFLINE", 2);
        c = vh61Var3;
        vh61 vh61Var4 = new vh61("TIMEOUT_ERROR", 3);
        d = vh61Var4;
        e = new vh61[]{vh61Var, vh61Var2, vh61Var3, vh61Var4};
    }

    public static vh61 valueOf(String str) {
        return (vh61) Enum.valueOf(vh61.class, str);
    }

    public static vh61[] values() {
        return (vh61[]) e.clone();
    }
}
