package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ak60 {
    public static final ak60 a;
    public static final ak60 b;
    public static final ak60 c;
    public static final ak60 d;
    public static final ak60 e;
    public static final /* synthetic */ ak60[] f;

    static {
        ak60 ak60Var = new ak60("RowClicked", 0);
        a = ak60Var;
        ak60 ak60Var2 = new ak60("AddToLibraryClicked", 1);
        b = ak60Var2;
        ak60 ak60Var3 = new ak60("ClearClicked", 2);
        c = ak60Var3;
        ak60 ak60Var4 = new ak60("AddToQueueSwiped", 3);
        d = ak60Var4;
        ak60 ak60Var5 = new ak60("AddToLibrarySwiped", 4);
        e = ak60Var5;
        f = new ak60[]{ak60Var, ak60Var2, ak60Var3, ak60Var4, ak60Var5};
    }

    public static ak60 valueOf(String str) {
        return (ak60) Enum.valueOf(ak60.class, str);
    }

    public static ak60[] values() {
        return (ak60[]) f.clone();
    }
}
