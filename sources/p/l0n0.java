package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l0n0 {
    public static final Set a = f46.S0(new q4j0[]{o4j0.a, n4j0.a, p4j0.a});

    public static q3j0 a(q4j0 q4j0Var, d3j0 d3j0Var) {
        Set set = a;
        if (!set.contains(q4j0Var)) {
            return q4j0Var instanceof k4j0 ? new p3j0(new vgq0(new q4j0[]{q4j0Var}, (byte) 27), new i2i1(new q4j0[]{q4j0Var}, (byte) 0), new a0m(new q4j0[]{q4j0Var}, (byte) 29)) : gz3.a;
        }
        c3j0 c3j0Var = d3j0Var.a;
        if (c3j0Var instanceof b3j0) {
            m3j0 m3j0Var = gz3.a;
            return new m3j0(q9w.g, new qim(set, (byte) 1));
        }
        if ((c3j0Var instanceof z2j0) || (c3j0Var instanceof a3j0)) {
            return new m3j0(new iyq0(set, (byte) 3), null);
        }
        eg.o();
        return null;
    }
}
