package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c88 {
    public static final c88 a;
    public static final c88 b;
    public static final c88 c;
    public static final /* synthetic */ c88[] d;

    static {
        c88 c88Var = new c88("RowClicked", 0);
        a = c88Var;
        c88 c88Var2 = new c88("AddToLibraryClicked", 1);
        b = c88Var2;
        c88 c88Var3 = new c88("ContextMenuClicked", 2);
        c = c88Var3;
        d = new c88[]{c88Var, c88Var2, c88Var3};
    }

    public static c88 valueOf(String str) {
        return (c88) Enum.valueOf(c88.class, str);
    }

    public static c88[] values() {
        return (c88[]) d.clone();
    }
}
