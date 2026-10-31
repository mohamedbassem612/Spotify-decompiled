package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dqa1 {
    public static final dqa1 a;
    public static final dqa1 b;
    public static final dqa1 c;
    public static final /* synthetic */ dqa1[] d;

    static {
        dqa1 dqa1Var = new dqa1("NotRequested", 0);
        a = dqa1Var;
        dqa1 dqa1Var2 = new dqa1("Enabled", 1);
        b = dqa1Var2;
        dqa1 dqa1Var3 = new dqa1("Failed", 2);
        c = dqa1Var3;
        d = new dqa1[]{dqa1Var, dqa1Var2, dqa1Var3};
    }

    public static dqa1 valueOf(String str) {
        return (dqa1) Enum.valueOf(dqa1.class, str);
    }

    public static dqa1[] values() {
        return (dqa1[]) d.clone();
    }
}
