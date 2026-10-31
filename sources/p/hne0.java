package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hne0 {
    public static final hne0 a;
    public static final hne0 b;
    public static final /* synthetic */ hne0[] c;

    static {
        hne0 hne0Var = new hne0("RowClicked", 0);
        a = hne0Var;
        hne0 hne0Var2 = new hne0("RemoveClicked", 1);
        b = hne0Var2;
        c = new hne0[]{hne0Var, hne0Var2};
    }

    public static hne0 valueOf(String str) {
        return (hne0) Enum.valueOf(hne0.class, str);
    }

    public static hne0[] values() {
        return (hne0[]) c.clone();
    }
}
