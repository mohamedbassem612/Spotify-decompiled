package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qi51 {
    public static final qi51 a;
    public static final /* synthetic */ qi51[] b;
    public static final /* synthetic */ t0z c;

    /* JADX INFO: Fake field, exist only in values array */
    qi51 EF0;

    static {
        qi51 qi51Var = new qi51("GRID", 0);
        qi51 qi51Var2 = new qi51("GRID_COMPACT", 1);
        qi51 qi51Var3 = new qi51("LIST", 2);
        a = qi51Var3;
        qi51[] qi51VarArr = {qi51Var, qi51Var2, qi51Var3, new qi51("LIST_WITHOUT_TITLE", 3), new qi51("SIMPLE_ROW", 4), new qi51("SINGLE_ITEM", 5), new qi51("SINGLE_ITEM_WITH_TITLE", 6), new qi51("IMAGE_ROW_WITH_TEXT_LABELS", 7)};
        b = qi51VarArr;
        c = new t0z(qi51VarArr);
    }

    public static qi51 valueOf(String str) {
        return (qi51) Enum.valueOf(qi51.class, str);
    }

    public static qi51[] values() {
        return (qi51[]) b.clone();
    }
}
