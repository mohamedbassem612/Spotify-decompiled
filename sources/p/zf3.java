package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zf3 {
    public static final zf3 a;
    public static final zf3 b;
    public static final /* synthetic */ zf3[] c;

    static {
        zf3 zf3Var = new zf3("RowClicked", 0);
        a = zf3Var;
        zf3 zf3Var2 = new zf3("AddToLibraryClicked", 1);
        b = zf3Var2;
        c = new zf3[]{zf3Var, zf3Var2};
    }

    public static zf3 valueOf(String str) {
        return (zf3) Enum.valueOf(zf3.class, str);
    }

    public static zf3[] values() {
        return (zf3[]) c.clone();
    }
}
