package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jhu0 {
    public static final jhu0 a;
    public static final jhu0 b;
    public static final jhu0 c;
    public static final /* synthetic */ jhu0[] d;

    static {
        jhu0 jhu0Var = new jhu0("RowClicked", 0);
        a = jhu0Var;
        jhu0 jhu0Var2 = new jhu0("AddToLibraryClicked", 1);
        b = jhu0Var2;
        jhu0 jhu0Var3 = new jhu0("ContextMenuClicked", 2);
        c = jhu0Var3;
        d = new jhu0[]{jhu0Var, jhu0Var2, jhu0Var3};
    }

    public static jhu0 valueOf(String str) {
        return (jhu0) Enum.valueOf(jhu0.class, str);
    }

    public static jhu0[] values() {
        return (jhu0[]) d.clone();
    }
}
