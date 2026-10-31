package p;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class npr0 extends fho1 {
    public final Method d;
    public final int e;
    public final t2n f;

    public npr0(Method method, int i, t2n t2nVar) {
        this.d = method;
        this.e = i;
        this.f = t2nVar;
    }

    public final void l(un21 un21Var, Object obj) {
        int i = this.e;
        Method method = this.d;
        if (obj == null) {
            throw m5n1.O(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            un21Var.k = (tn21) this.f.g(obj);
        } catch (IOException e) {
            throw m5n1.P(method, e, i, cy30.m("Unable to convert ", obj, " to RequestBody"), new Object[0]);
        }
    }
}
