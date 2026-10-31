package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bkd0 {
    public static final bkd0 a;
    public static final bkd0 b;
    public static final bkd0 c;
    public static final /* synthetic */ bkd0[] d;

    static {
        bkd0 bkd0Var = new bkd0("CardClicked", 0);
        a = bkd0Var;
        bkd0 bkd0Var2 = new bkd0("CtaButtonClicked", 1);
        b = bkd0Var2;
        bkd0 bkd0Var3 = new bkd0("LockedButtonClicked", 2);
        c = bkd0Var3;
        d = new bkd0[]{bkd0Var, bkd0Var2, bkd0Var3};
    }

    public static bkd0 valueOf(String str) {
        return (bkd0) Enum.valueOf(bkd0.class, str);
    }

    public static bkd0[] values() {
        return (bkd0[]) d.clone();
    }
}
