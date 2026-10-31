package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class af {
    public static final af a;
    public static final af b;
    public static final af c;
    public static final af d;
    public static final af e;
    public static final af f;
    public static final af g;
    public static final af h;
    public static final af i;
    public static final /* synthetic */ af[] t;

    static {
        af afVar = new af("L", 0);
        a = afVar;
        af afVar2 = new af("XL", 1);
        b = afVar2;
        af afVar3 = new af("XXL", 2);
        c = afVar3;
        af afVar4 = new af("XXXL", 3);
        d = afVar4;
        af afVar5 = new af("AX1", 4);
        e = afVar5;
        af afVar6 = new af("AX2", 5);
        f = afVar6;
        af afVar7 = new af("AX3", 6);
        g = afVar7;
        af afVar8 = new af("AX4", 7);
        h = afVar8;
        af afVar9 = new af("AX5", 8);
        i = afVar9;
        t = new af[]{afVar, afVar2, afVar3, afVar4, afVar5, afVar6, afVar7, afVar8, afVar9};
    }

    public static af valueOf(String str) {
        return (af) Enum.valueOf(af.class, str);
    }

    public static af[] values() {
        return (af[]) t.clone();
    }

    public final boolean a() {
        return compareTo(i) <= 0 && compareTo(e) >= 0;
    }
}
