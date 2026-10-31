package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zx21 {
    public ln21 a;
    public bjy0 b;
    public String d;
    public ms50 e;
    public a6a1 h;
    public ry21 i;
    public ry21 j;
    public ry21 k;
    public long l;
    public long m;
    public i25 n;
    public int c = -1;
    public uz21 g = uz21.a;
    public a6g1 o = a6g1.u0;
    public t360 f = new t360();

    public static void b(String str, ry21 ry21Var) {
        if (ry21Var != null) {
            if (ry21Var.i != null) {
                hhg1.f(str.concat(".networkResponse != null"));
            } else if (ry21Var.t != null) {
                hhg1.f(str.concat(".cacheResponse != null"));
            } else {
                if (ry21Var.X == null) {
                    return;
                }
                hhg1.f(str.concat(".priorResponse != null"));
            }
        }
    }

    public final ry21 a() {
        int i = this.c;
        if (i < 0) {
            bhn0.z(this.c, "code < 0: ");
            return null;
        }
        ln21 ln21Var = this.a;
        if (ln21Var == null) {
            eg.m("request == null");
            return null;
        }
        bjy0 bjy0Var = this.b;
        if (bjy0Var == null) {
            eg.m("protocol == null");
            return null;
        }
        String str = this.d;
        if (str == null) {
            eg.m("message == null");
            return null;
        }
        ms50 ms50Var = this.e;
        t360 t360Var = this.f;
        t360Var.getClass();
        return new ry21(ln21Var, bjy0Var, str, i, ms50Var, m5n1.g(t360Var), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }
}
