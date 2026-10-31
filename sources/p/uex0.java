package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uex0 {
    public static final uex0 a;
    public static final uex0 b;
    public static final uex0 c;
    public static final uex0 d;
    public static final /* synthetic */ uex0[] e;

    static {
        uex0 uex0Var = new uex0("Idle", 0);
        a = uex0Var;
        uex0 uex0Var2 = new uex0("Requesting", 1);
        b = uex0Var2;
        uex0 uex0Var3 = new uex0("AwaitingFocusStability", 2);
        c = uex0Var3;
        uex0 uex0Var4 = new uex0("Retrying", 3);
        d = uex0Var4;
        e = new uex0[]{uex0Var, uex0Var2, uex0Var3, uex0Var4};
    }

    public static uex0 valueOf(String str) {
        return (uex0) Enum.valueOf(uex0.class, str);
    }

    public static uex0[] values() {
        return (uex0[]) e.clone();
    }
}
