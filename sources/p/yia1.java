package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yia1 {
    public static final yia1 a;
    public static final yia1 b;
    public static final yia1 c;
    public static final /* synthetic */ yia1[] d;

    static {
        yia1 yia1Var = new yia1("SortOrderClicked", 0);
        a = yia1Var;
        yia1 yia1Var2 = new yia1("ViewDensityClicked", 1);
        b = yia1Var2;
        yia1 yia1Var3 = new yia1("EditClicked", 2);
        c = yia1Var3;
        d = new yia1[]{yia1Var, yia1Var2, yia1Var3};
    }

    public static yia1 valueOf(String str) {
        return (yia1) Enum.valueOf(yia1.class, str);
    }

    public static yia1[] values() {
        return (yia1[]) d.clone();
    }
}
