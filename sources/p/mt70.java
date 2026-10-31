package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mt70 {
    public static final mt70 a;
    public static final mt70 b;
    public static final /* synthetic */ mt70[] c;

    static {
        mt70 mt70Var = new mt70("BackButtonClicked", 0);
        a = mt70Var;
        mt70 mt70Var2 = new mt70("ArtworkClicked", 1);
        b = mt70Var2;
        c = new mt70[]{mt70Var, mt70Var2};
    }

    public static mt70 valueOf(String str) {
        return (mt70) Enum.valueOf(mt70.class, str);
    }

    public static mt70[] values() {
        return (mt70[]) c.clone();
    }
}
