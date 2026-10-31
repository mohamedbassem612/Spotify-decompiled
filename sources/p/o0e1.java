package p;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o0e1 {
    public final Map a;

    public o0e1() {
        mmr0 mmr0Var = new mmr0(wbe1.a, Float.valueOf(0.2f));
        Float fValueOf = Float.valueOf(0.7f);
        this.a = sqg0.J(new mmr0[]{mmr0Var, new mmr0(wbe1.c, fValueOf), new mmr0(wbe1.e, Float.valueOf(0.1f)), new mmr0(wbe1.d, fValueOf), new mmr0(wbe1.b, Float.valueOf(0.3f))});
    }

    public final float a(Set set, wbe1 wbe1Var) {
        Object next;
        Iterator it = set.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xbe1) next).a != wbe1Var);
        xbe1 xbe1Var = (xbe1) next;
        float f = xbe1Var != null ? xbe1Var.b : 0.0f;
        Float f2 = (Float) this.a.get(wbe1Var);
        return f * (f2 != null ? f2.floatValue() : 0.0f);
    }

    public final float b(dce1 dce1Var) {
        Set set = dce1Var.b;
        float fA = a(set, wbe1.a) + a(set, wbe1.c) + a(set, wbe1.e);
        return ((a(set, wbe1.b) + a(set, wbe1.d)) * 0.3f) + (fA * 0.7f);
    }
}
