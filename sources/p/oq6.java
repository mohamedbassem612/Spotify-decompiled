package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oq6 {
    public static final oq6 a;
    public static final /* synthetic */ oq6[] b;

    static {
        oq6 oq6Var = new oq6("RowClicked", 0);
        a = oq6Var;
        b = new oq6[]{oq6Var};
    }

    public static oq6 valueOf(String str) {
        return (oq6) Enum.valueOf(oq6.class, str);
    }

    public static oq6[] values() {
        return (oq6[]) b.clone();
    }
}
