package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w8n0 {
    public static final w8n0 a;
    public static final w8n0 b;
    public static final w8n0 c;
    public static final /* synthetic */ w8n0[] d;

    static {
        w8n0 w8n0Var = new w8n0("RowClicked", 0);
        a = w8n0Var;
        w8n0 w8n0Var2 = new w8n0("RowLongClicked", 1);
        b = w8n0Var2;
        w8n0 w8n0Var3 = new w8n0("ContextMenuClicked", 2);
        c = w8n0Var3;
        d = new w8n0[]{w8n0Var, w8n0Var2, w8n0Var3};
    }

    public static w8n0 valueOf(String str) {
        return (w8n0) Enum.valueOf(w8n0.class, str);
    }

    public static w8n0[] values() {
        return (w8n0[]) d.clone();
    }
}
