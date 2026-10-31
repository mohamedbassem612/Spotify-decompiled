package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hzf1 {
    public static final hzf1 a;
    public static final hzf1 b;
    public static final /* synthetic */ hzf1[] c;

    static {
        hzf1 hzf1Var = new hzf1("RowClicked", 0);
        a = hzf1Var;
        hzf1 hzf1Var2 = new hzf1("ContextMenuClicked", 1);
        b = hzf1Var2;
        c = new hzf1[]{hzf1Var, hzf1Var2};
    }

    public static hzf1 valueOf(String str) {
        return (hzf1) Enum.valueOf(hzf1.class, str);
    }

    public static hzf1[] values() {
        return (hzf1[]) c.clone();
    }
}
