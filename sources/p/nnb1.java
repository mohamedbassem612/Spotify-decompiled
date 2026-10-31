package p;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nnb1 {
    public static final HashMap a;
    public static final /* synthetic */ nnb1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    nnb1 EF0;

    static {
        nnb1 nnb1Var = new nnb1("NONE", 0);
        nnb1 nnb1Var2 = new nnb1("CHAIN", 1);
        nnb1 nnb1Var3 = new nnb1("ALIGNED", 2);
        b = new nnb1[]{nnb1Var, nnb1Var2, nnb1Var3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        a = map2;
        map.put("none", nnb1Var);
        map.put("chain", nnb1Var2);
        map.put("aligned", nnb1Var3);
        cy30.v(0, map2, "none", 3, "chain");
        map2.put("aligned", 2);
    }

    public static nnb1 valueOf(String str) {
        return (nnb1) Enum.valueOf(nnb1.class, str);
    }

    public static nnb1[] values() {
        return (nnb1[]) b.clone();
    }
}
