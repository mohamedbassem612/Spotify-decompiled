package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pv60 {
    public static final pv60 a;
    public static final pv60 b;
    public static final pv60 c;
    public static final pv60 d;
    public static final /* synthetic */ pv60[] e;

    static {
        pv60 pv60Var = new pv60("LEARN_MORE_CLICKED", 0);
        a = pv60Var;
        pv60 pv60Var2 = new pv60("DISMISSED", 1);
        b = pv60Var2;
        pv60 pv60Var3 = new pv60("ACCEPT_SINGLE_REQUEST", 2);
        c = pv60Var3;
        pv60 pv60Var4 = new pv60("DECLINE_SINGLE_REQUEST", 3);
        d = pv60Var4;
        e = new pv60[]{pv60Var, pv60Var2, pv60Var3, pv60Var4};
    }

    public static pv60 valueOf(String str) {
        return (pv60) Enum.valueOf(pv60.class, str);
    }

    public static pv60[] values() {
        return (pv60[]) e.clone();
    }
}
