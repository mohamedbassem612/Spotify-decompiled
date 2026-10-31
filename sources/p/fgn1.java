package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fgn1 {
    public static final fgn1 a;
    public static final /* synthetic */ fgn1[] b;

    static {
        fgn1 fgn1Var = new fgn1("DEFAULT", 0);
        a = fgn1Var;
        b = new fgn1[]{fgn1Var, new fgn1("SIGNED", 1), new fgn1("FIXED", 2)};
    }

    public static fgn1[] values() {
        return (fgn1[]) b.clone();
    }
}
