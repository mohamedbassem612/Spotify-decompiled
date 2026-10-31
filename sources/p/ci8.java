package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ci8 {
    public static final bi8 Companion;
    public static final znb0 a;
    public static final ci8 b;
    public static final ci8 c;
    public static final /* synthetic */ ci8[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ci8 EF0;

    static {
        ci8 ci8Var = new ci8("NONE", 0);
        ci8 ci8Var2 = new ci8("IDT", 1);
        b = ci8Var2;
        ci8 ci8Var3 = new ci8("STT", 2);
        c = ci8Var3;
        d = new ci8[]{ci8Var, ci8Var2, ci8Var3};
        Companion = new bi8();
        a = dm5.S(2, vc7.S0);
    }

    public static ci8 valueOf(String str) {
        return (ci8) Enum.valueOf(ci8.class, str);
    }

    public static ci8[] values() {
        return (ci8[]) d.clone();
    }
}
