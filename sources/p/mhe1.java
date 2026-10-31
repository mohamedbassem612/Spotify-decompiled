package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mhe1 {
    public static final mhe1 a;
    public static final mhe1 b;
    public static final /* synthetic */ mhe1[] c;

    static {
        mhe1 mhe1Var = new mhe1("UP", 0);
        a = mhe1Var;
        mhe1 mhe1Var2 = new mhe1("DOWN", 1);
        b = mhe1Var2;
        c = new mhe1[]{mhe1Var, mhe1Var2};
    }

    public static mhe1 valueOf(String str) {
        return (mhe1) Enum.valueOf(mhe1.class, str);
    }

    public static mhe1[] values() {
        return (mhe1[]) c.clone();
    }
}
