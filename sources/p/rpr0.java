package p;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rpr0 extends fho1 {
    public final /* synthetic */ byte d;
    public final Method e;
    public final int f;

    public /* synthetic */ rpr0(Method method, int i, byte b) {
        this.d = b;
        this.e = method;
        this.f = i;
    }

    public final void l(un21 un21Var, Object obj) {
        byte b = this.d;
        int i = this.f;
        Method method = this.e;
        switch (b) {
            case 0:
                v360 v360Var = (v360) obj;
                if (v360Var == null) {
                    throw m5n1.O(method, i, "Headers parameter must not be null.", new Object[0]);
                }
                t360 t360Var = un21Var.f;
                t360Var.getClass();
                int size = v360Var.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m5n1.f(t360Var, m5n1.h(v360Var, i2), m5n1.j(v360Var, i2));
                }
                return;
            default:
                if (obj == null) {
                    throw m5n1.O(method, i, "@Url parameter is null.", new Object[0]);
                }
                un21Var.c = obj.toString();
                return;
        }
    }
}
