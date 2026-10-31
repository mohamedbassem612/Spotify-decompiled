package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t8w0 {
    public static final t8w0 a;
    public static final /* synthetic */ t8w0[] b;

    static {
        t8w0 t8w0Var = new t8w0("RowClicked", 0);
        a = t8w0Var;
        b = new t8w0[]{t8w0Var};
    }

    public static t8w0 valueOf(String str) {
        return (t8w0) Enum.valueOf(t8w0.class, str);
    }

    public static t8w0[] values() {
        return (t8w0[]) b.clone();
    }
}
