package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ic8 {
    public static final ic8 a;
    public static final ic8 b;
    public static final /* synthetic */ ic8[] c;

    static {
        ic8 ic8Var = new ic8("RowClicked", 0);
        a = ic8Var;
        ic8 ic8Var2 = new ic8("AddToLibraryClicked", 1);
        b = ic8Var2;
        c = new ic8[]{ic8Var, ic8Var2};
    }

    public static ic8 valueOf(String str) {
        return (ic8) Enum.valueOf(ic8.class, str);
    }

    public static ic8[] values() {
        return (ic8[]) c.clone();
    }
}
