package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class w7a0 {
    public static final List a;
    public static final List b;
    public static final Map c;
    public static final Map d;
    public static final LinkedHashMap e;

    static {
        wf5 wf5Var = wf5.TYPE_PARAMETER_BOUNDS;
        wf5 wf5Var2 = wf5.TYPE_USE;
        wf5 wf5Var3 = wf5.FIELD;
        wf5 wf5Var4 = wf5.METHOD_RETURN_TYPE;
        wf5 wf5Var5 = wf5.VALUE_PARAMETER;
        List listM = p7h.M(new wf5[]{wf5Var3, wf5Var4, wf5Var5, wf5Var, wf5Var2});
        a = listM;
        List listSingletonList = Collections.singletonList(wf5Var5);
        b = listSingletonList;
        kf30 kf30Var = fia0.a;
        iep0 iep0Var = iep0.c;
        List list = listM;
        Map mapJ = sqg0.J(new mmr0[]{new mmr0(kf30Var, new v7a0(new bvl1(iep0Var, false), list, false, true, true)), new mmr0(fia0.b, new v7a0(new bvl1(iep0Var, false), list, false, true, true)), new mmr0(fia0.c, new v7a0(new bvl1(iep0.a, false), list, 4))});
        c = mapJ;
        List list2 = listSingletonList;
        Map mapJ2 = sqg0.J(new mmr0[]{new mmr0(fia0.h, new v7a0(new bvl1(iep0Var, false), list2, 28)), new mmr0(fia0.i, new v7a0(new bvl1(iep0.b, false), list2, 28))});
        d = mapJ2;
        e = sqg0.O(mapJ, mapJ2);
    }
}
