package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r600 {
    public static final r600 a;
    public static final r600 b;
    public static final r600 c;
    public static final /* synthetic */ r600[] d;

    static {
        r600 r600Var = new r600("RowClicked", 0);
        a = r600Var;
        r600 r600Var2 = new r600("RowLongClicked", 1);
        b = r600Var2;
        r600 r600Var3 = new r600("OnContextMenuClicked", 2);
        c = r600Var3;
        d = new r600[]{r600Var, r600Var2, r600Var3};
    }

    public static r600 valueOf(String str) {
        return (r600) Enum.valueOf(r600.class, str);
    }

    public static r600[] values() {
        return (r600[]) d.clone();
    }
}
