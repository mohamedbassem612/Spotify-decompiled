package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l620 {
    public static final l620 a;
    public static final l620 b;
    public static final l620 c;
    public static final /* synthetic */ l620[] d;
    public static final /* synthetic */ t0z e;

    static {
        l620 l620Var = new l620("None", 0);
        a = l620Var;
        l620 l620Var2 = new l620("AvailableOffline", 1);
        b = l620Var2;
        l620 l620Var3 = new l620("UnPlayed", 2);
        c = l620Var3;
        l620[] l620VarArr = {l620Var, l620Var2, l620Var3};
        d = l620VarArr;
        e = new t0z(l620VarArr);
    }

    public static l620 valueOf(String str) {
        return (l620) Enum.valueOf(l620.class, str);
    }

    public static l620[] values() {
        return (l620[]) d.clone();
    }
}
