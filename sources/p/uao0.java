package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uao0 {
    public static final uao0 a;
    public static final uao0 b;
    public static final uao0 c;
    public static final uao0 d;
    public static final /* synthetic */ uao0[] e;

    static {
        uao0 uao0Var = new uao0("FeatureDisabled", 0);
        a = uao0Var;
        uao0 uao0Var2 = new uao0("Loading", 1);
        b = uao0Var2;
        uao0 uao0Var3 = new uao0("OptedIn", 2);
        c = uao0Var3;
        uao0 uao0Var4 = new uao0("OptedOut", 3);
        d = uao0Var4;
        e = new uao0[]{uao0Var, uao0Var2, uao0Var3, uao0Var4};
    }

    public static uao0 valueOf(String str) {
        return (uao0) Enum.valueOf(uao0.class, str);
    }

    public static uao0[] values() {
        return (uao0[]) e.clone();
    }
}
