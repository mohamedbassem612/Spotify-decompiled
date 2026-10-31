package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b73 {
    public static final b73 a;
    public static final b73 b;
    public static final b73 c;
    public static final /* synthetic */ b73[] d;

    static {
        b73 b73Var = new b73("RowClicked", 0);
        a = b73Var;
        b73 b73Var2 = new b73("AddToLibraryClicked", 1);
        b = b73Var2;
        b73 b73Var3 = new b73("ContextMenuClicked", 2);
        c = b73Var3;
        d = new b73[]{b73Var, b73Var2, b73Var3};
    }

    public static b73 valueOf(String str) {
        return (b73) Enum.valueOf(b73.class, str);
    }

    public static b73[] values() {
        return (b73[]) d.clone();
    }
}
