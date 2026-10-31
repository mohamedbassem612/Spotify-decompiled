package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gta1 {
    public static final gta1 a;
    public static final gta1 b;
    public static final /* synthetic */ gta1[] c;

    static {
        gta1 gta1Var = new gta1("OnCancelClicked", 0);
        a = gta1Var;
        gta1 gta1Var2 = new gta1("OnSaveClicked", 1);
        b = gta1Var2;
        c = new gta1[]{gta1Var, gta1Var2};
    }

    public static gta1 valueOf(String str) {
        return (gta1) Enum.valueOf(gta1.class, str);
    }

    public static gta1[] values() {
        return (gta1[]) c.clone();
    }
}
