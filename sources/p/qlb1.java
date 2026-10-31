package p;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qlb1 {
    public static final qlb1 a;
    public static final qlb1 b;
    public static final qlb1 c;
    public static final HashMap d;
    public static final /* synthetic */ qlb1[] e;

    static {
        qlb1 qlb1Var = new qlb1("SPREAD", 0);
        a = qlb1Var;
        qlb1 qlb1Var2 = new qlb1("SPREAD_INSIDE", 1);
        b = qlb1Var2;
        qlb1 qlb1Var3 = new qlb1("PACKED", 2);
        c = qlb1Var3;
        e = new qlb1[]{qlb1Var, qlb1Var2, qlb1Var3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        d = map2;
        map.put("packed", qlb1Var3);
        map.put("spread_inside", qlb1Var2);
        map.put("spread", qlb1Var);
        cy30.v(2, map2, "packed", 1, "spread_inside");
        map2.put("spread", 0);
    }

    public static int a(String str) {
        HashMap map = d;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }

    public static qlb1 valueOf(String str) {
        return (qlb1) Enum.valueOf(qlb1.class, str);
    }

    public static qlb1[] values() {
        return (qlb1[]) e.clone();
    }
}
