package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lr9 {
    public static final lr9 a;
    public static final lr9 b;
    public static final lr9 c;
    public static final /* synthetic */ lr9[] d;

    static {
        lr9 lr9Var = new lr9("IDLE", 0);
        a = lr9Var;
        lr9 lr9Var2 = new lr9("PIP", 1);
        b = lr9Var2;
        lr9 lr9Var3 = new lr9("NPV_OVERLAY", 2);
        c = lr9Var3;
        d = new lr9[]{lr9Var, lr9Var2, lr9Var3};
    }

    public static lr9 valueOf(String str) {
        return (lr9) Enum.valueOf(lr9.class, str);
    }

    public static lr9[] values() {
        return (lr9[]) d.clone();
    }
}
