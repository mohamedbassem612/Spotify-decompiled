package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dxf1 {
    public static final dxf1 a;
    public static final dxf1 b;
    public static final dxf1 c;
    public static final /* synthetic */ dxf1[] d;

    static {
        dxf1 dxf1Var = new dxf1("RowClicked", 0);
        a = dxf1Var;
        dxf1 dxf1Var2 = new dxf1("RowLongClicked", 1);
        b = dxf1Var2;
        dxf1 dxf1Var3 = new dxf1("ContextMenuClicked", 2);
        c = dxf1Var3;
        d = new dxf1[]{dxf1Var, dxf1Var2, dxf1Var3};
    }

    public static dxf1 valueOf(String str) {
        return (dxf1) Enum.valueOf(dxf1.class, str);
    }

    public static dxf1[] values() {
        return (dxf1[]) d.clone();
    }
}
