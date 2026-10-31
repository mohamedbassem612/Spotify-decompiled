package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ell {
    public static final ell a;
    public static final ell b;
    public static final ell c;
    public static final ell d;
    public static final ell e;
    public static final ell f;
    public static final /* synthetic */ ell[] g;

    static {
        ell ellVar = new ell("Unspecified", 0);
        a = ellVar;
        ell ellVar2 = new ell("Explicit", 1);
        b = ellVar2;
        ell ellVar3 = new ell("Plus18", 2);
        c = ellVar3;
        ell ellVar4 = new ell("SouthKorea19", 3);
        d = ellVar4;
        ell ellVar5 = new ell("Erotica", 4);
        e = ellVar5;
        ell ellVar6 = new ell("Unrecognized", 5);
        f = ellVar6;
        g = new ell[]{ellVar, ellVar2, ellVar3, ellVar4, ellVar5, ellVar6};
    }

    public static ell valueOf(String str) {
        return (ell) Enum.valueOf(ell.class, str);
    }

    public static ell[] values() {
        return (ell[]) g.clone();
    }
}
