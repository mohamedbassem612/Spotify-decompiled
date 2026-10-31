package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rjc1 {
    public static final rjc1 a;
    public static final rjc1 b;
    public static final rjc1 c;
    public static final /* synthetic */ rjc1[] d;

    static {
        rjc1 rjc1Var = new rjc1("None", 0);
        a = rjc1Var;
        rjc1 rjc1Var2 = new rjc1("Public", 1);
        b = rjc1Var2;
        rjc1 rjc1Var3 = new rjc1("Locked", 2);
        c = rjc1Var3;
        d = new rjc1[]{rjc1Var, rjc1Var2, rjc1Var3};
    }

    public static rjc1 valueOf(String str) {
        return (rjc1) Enum.valueOf(rjc1.class, str);
    }

    public static rjc1[] values() {
        return (rjc1[]) d.clone();
    }
}
