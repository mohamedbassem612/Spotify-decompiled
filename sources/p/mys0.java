package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mys0 {
    public static final mys0 a;
    public static final mys0 b;
    public static final mys0 c;
    public static final /* synthetic */ mys0[] d;

    static {
        mys0 mys0Var = new mys0("ACCEPTED", 0);
        a = mys0Var;
        mys0 mys0Var2 = new mys0("FAILED", 1);
        b = mys0Var2;
        mys0 mys0Var3 = new mys0("BLOCKED_BY_LAUNCHER", 2);
        c = mys0Var3;
        d = new mys0[]{mys0Var, mys0Var2, mys0Var3};
    }

    public static mys0 valueOf(String str) {
        return (mys0) Enum.valueOf(mys0.class, str);
    }

    public static mys0[] values() {
        return (mys0[]) d.clone();
    }
}
