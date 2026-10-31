package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wgn1 {
    public static final wgn1 a;
    public static final wgn1 b;
    public static final /* synthetic */ wgn1[] c;

    static {
        wgn1 wgn1Var = new wgn1("IEEE_P1363", 0);
        a = wgn1Var;
        wgn1 wgn1Var2 = new wgn1("DER", 1);
        b = wgn1Var2;
        c = new wgn1[]{wgn1Var, wgn1Var2};
    }

    public static wgn1[] values() {
        return (wgn1[]) c.clone();
    }
}
