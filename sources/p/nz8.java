package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nz8 {
    public jin a;
    public List b;
    public List c;
    public Boolean d;
    public kin e;
    public List f;
    public int g;
    public byte h;

    public final oz8 a() {
        jin jinVar;
        if (this.h == 1 && (jinVar = this.a) != null) {
            return new oz8(jinVar, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public final void b(List list) {
        this.f = list;
    }

    public final void c(Boolean bool) {
        this.d = bool;
    }

    public final void d(kin kinVar) {
        this.e = kinVar;
    }

    public final void e(List list) {
        this.b = list;
    }

    public final void f(pz8 pz8Var) {
        this.a = pz8Var;
    }

    public final void g(List list) {
        this.c = list;
    }

    public final void h(int i) {
        this.g = i;
        this.h = (byte) (this.h | 1);
    }
}
