package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uoe0 {
    public static final uoe0 a;
    public static final uoe0 b;
    public static final uoe0 c;
    public static final /* synthetic */ uoe0[] d;

    static {
        uoe0 uoe0Var = new uoe0("NOT_COMPUTED", 0);
        a = uoe0Var;
        uoe0 uoe0Var2 = new uoe0("COMPUTING", 1);
        b = uoe0Var2;
        uoe0 uoe0Var3 = new uoe0("RECURSION_WAS_DETECTED", 2);
        c = uoe0Var3;
        d = new uoe0[]{uoe0Var, uoe0Var2, uoe0Var3};
    }

    public static uoe0 valueOf(String str) {
        return (uoe0) Enum.valueOf(uoe0.class, str);
    }

    public static uoe0[] values() {
        return (uoe0[]) d.clone();
    }
}
