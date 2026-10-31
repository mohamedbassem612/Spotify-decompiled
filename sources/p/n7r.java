package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n7r {
    public static final n7r a;
    public static final n7r b;
    public static final n7r c;
    public static final n7r d;
    public static final n7r e;
    public static final n7r f;
    public static final n7r g;
    public static final /* synthetic */ n7r[] h;
    public static final /* synthetic */ t0z i;

    static {
        n7r n7rVar = new n7r("SUNDAY", 0);
        a = n7rVar;
        n7r n7rVar2 = new n7r("MONDAY", 1);
        b = n7rVar2;
        n7r n7rVar3 = new n7r("TUESDAY", 2);
        c = n7rVar3;
        n7r n7rVar4 = new n7r("WEDNESDAY", 3);
        d = n7rVar4;
        n7r n7rVar5 = new n7r("THURSDAY", 4);
        e = n7rVar5;
        n7r n7rVar6 = new n7r("FRIDAY", 5);
        f = n7rVar6;
        n7r n7rVar7 = new n7r("SATURDAY", 6);
        g = n7rVar7;
        n7r[] n7rVarArr = {n7rVar, n7rVar2, n7rVar3, n7rVar4, n7rVar5, n7rVar6, n7rVar7};
        h = n7rVarArr;
        i = new t0z(n7rVarArr);
    }

    public static n7r valueOf(String str) {
        return (n7r) Enum.valueOf(n7r.class, str);
    }

    public static n7r[] values() {
        return (n7r[]) h.clone();
    }

    public final int a() {
        return ordinal() + 1;
    }
}
