package p;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d0z0 extends t0u0 {
    public static final Map y1 = sqg0.J(new mmr0[]{new mmr0(Double.valueOf(0.0d), (Object) null), new mmr0(Double.valueOf(0.1d), (Object) null), new mmr0(Double.valueOf(0.25d), co0.FIRST_QUARTILE), new mmr0(Double.valueOf(0.5d), co0.MIDPOINT), new mmr0(Double.valueOf(0.75d), co0.THIRD_QUARTILE), new mmr0(Double.valueOf(0.95d), (Object) null), new mmr0(Double.valueOf(1.0d), co0.ENDED)});
    public final xu0 u1;
    public final yu0 v1;
    public final ao0 w1;
    public koe1 x1;

    public d0z0(xu0 xu0Var, yu0 yu0Var, ao0 ao0Var) {
        super(yu0Var);
        this.u1 = xu0Var;
        this.v1 = yu0Var;
        this.w1 = ao0Var;
    }

    public final void k(long j, long j2) {
        super.k(j, j2);
        koe1 koe1VarB = this.x1;
        if (koe1VarB == null) {
            Map map = y1;
            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(Long.valueOf((long) (((Number) entry.getKey()).doubleValue() * j)), entry.getValue());
            }
            TreeMap treeMap = new TreeMap(linkedHashMap);
            koe1VarB = this.v1.c.b(o7h.m1(treeMap.keySet()), true, new hyy0(treeMap, this, (byte) 1));
        }
        this.x1 = koe1VarB;
    }
}
