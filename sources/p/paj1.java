package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class paj1 {
    public static final paj1 a;
    public static final paj1 b;
    public static final paj1 c;
    public static final /* synthetic */ paj1[] d;

    static {
        paj1 paj1Var = new paj1("COMPACT_FILL", 0);
        a = paj1Var;
        paj1 paj1Var2 = new paj1("COMPACT_FIXED", 1);
        b = paj1Var2;
        paj1 paj1Var3 = new paj1("OVERLAY", 2);
        c = paj1Var3;
        d = new paj1[]{paj1Var, paj1Var2, paj1Var3};
    }

    public static paj1 valueOf(String str) {
        return (paj1) Enum.valueOf(paj1.class, str);
    }

    public static paj1[] values() {
        return (paj1[]) d.clone();
    }
}
