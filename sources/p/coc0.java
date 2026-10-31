package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class coc0 {
    public static final coc0 a;
    public static final coc0 b;
    public static final /* synthetic */ coc0[] c;

    static {
        coc0 coc0Var = new coc0("PLAYLIST", 0);
        a = coc0Var;
        coc0 coc0Var2 = new coc0("FOLDER", 1);
        b = coc0Var2;
        c = new coc0[]{coc0Var, coc0Var2};
    }

    public static coc0 valueOf(String str) {
        return (coc0) Enum.valueOf(coc0.class, str);
    }

    public static coc0[] values() {
        return (coc0[]) c.clone();
    }
}
