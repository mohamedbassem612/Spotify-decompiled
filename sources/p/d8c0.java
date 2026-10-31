package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d8c0 {
    public final i310 a;

    public d8c0(i310 i310Var) {
        this.a = i310Var;
    }

    public final c8c0 a(r2q0 r2q0Var, Map map) {
        if (y7y0.G(map)) {
            return c8c0.f;
        }
        if (!y7y0.L(map) || !y7y0.F(map)) {
            if (y7y0.L(map) && !y7y0.F(map)) {
                return c8c0.c;
            }
            if (r2q0Var != r2q0.d) {
                this.a.a.getClass();
                if (rh11.c(map)) {
                    return c8c0.e;
                }
                return r2q0Var == r2q0.c ? c8c0.a : c8c0.d;
            }
        }
        return c8c0.b;
    }
}
