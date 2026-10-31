package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class anh1 {
    public static final anh1 a;
    public static final anh1 b;
    public static final /* synthetic */ anh1[] c;

    static {
        anh1 anh1Var = new anh1("CardClicked", 0);
        a = anh1Var;
        anh1 anh1Var2 = new anh1("NotifyMeClicked", 1);
        b = anh1Var2;
        c = new anh1[]{anh1Var, anh1Var2};
    }

    public static anh1 valueOf(String str) {
        return (anh1) Enum.valueOf(anh1.class, str);
    }

    public static anh1[] values() {
        return (anh1[]) c.clone();
    }
}
