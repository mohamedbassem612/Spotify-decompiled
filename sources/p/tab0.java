package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tab0 {
    public static final tab0 a;
    public static final tab0 b;
    public static final tab0 c;
    public static final tab0 d;
    public static final /* synthetic */ tab0[] e;

    static {
        tab0 tab0Var = new tab0("ProgressHeader", 0);
        a = tab0Var;
        tab0 tab0Var2 = new tab0("NoProgressHeader", 1);
        b = tab0Var2;
        tab0 tab0Var3 = new tab0("PageNumber", 2);
        tab0 tab0Var4 = new tab0("UpdatePageNumberButton", 3);
        tab0 tab0Var5 = new tab0("PageNumberIncorrectButton", 4);
        tab0 tab0Var6 = new tab0("ScanPageButton", 5);
        c = tab0Var6;
        tab0 tab0Var7 = new tab0("FindPageButton", 6);
        d = tab0Var7;
        e = new tab0[]{tab0Var, tab0Var2, tab0Var3, tab0Var4, tab0Var5, tab0Var6, tab0Var7, new tab0("ScanBarcodeButton", 7)};
    }

    public static tab0 valueOf(String str) {
        return (tab0) Enum.valueOf(tab0.class, str);
    }

    public static tab0[] values() {
        return (tab0[]) e.clone();
    }
}
