package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cob1 {
    public static final cob1 a;
    public static final cob1 b;
    public static final cob1 c;
    public static final /* synthetic */ cob1[] d;

    static {
        cob1 cob1Var = new cob1("None", 0);
        a = cob1Var;
        cob1 cob1Var2 = new cob1("Paused", 1);
        b = cob1Var2;
        cob1 cob1Var3 = new cob1("Playing", 2);
        c = cob1Var3;
        d = new cob1[]{cob1Var, cob1Var2, cob1Var3};
    }

    public static cob1 valueOf(String str) {
        return (cob1) Enum.valueOf(cob1.class, str);
    }

    public static cob1[] values() {
        return (cob1[]) d.clone();
    }

    public final boolean a() {
        return this == b || b();
    }

    public final boolean b() {
        return this == c;
    }
}
