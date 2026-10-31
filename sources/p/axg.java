package p;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class axg implements yy70 {
    public final nq80 a;
    public final ird1 b;
    public final Map c;
    public final String d;

    public axg(nq80 nq80Var, ird1 ird1Var, Map map, String str) {
        this.a = nq80Var;
        this.b = ird1Var;
        this.c = map;
        this.d = str;
    }

    public final void a(zy70 zy70Var, tsc1 tsc1Var) {
        nq80 nq80Var = this.a;
        if (nq80Var != null) {
            nq80Var.k(this.d, zy70Var.b.toString(), tsc1Var);
        }
        ird1 ird1Var = this.b;
        if (ird1Var != null) {
            ird1Var.onSuccess();
        }
    }

    public final void b() {
        nq80 nq80Var = this.a;
        if (nq80Var != null) {
            nq80Var.j(this.d, this.c);
        }
    }

    public final void c(zy70 zy70Var, viz vizVar) {
        nq80 nq80Var = this.a;
        if (nq80Var != null) {
            nq80Var.i(this.d, zy70Var.b.toString(), vizVar);
        }
        ird1 ird1Var = this.b;
        if (ird1Var != null) {
            ird1Var.o(new Exception(vizVar.c));
        }
    }

    public final void d(zy70 zy70Var) {
        if (this.a != null) {
            zy70Var.b.toString();
        }
        ird1 ird1Var = this.b;
        if (ird1Var != null) {
            ird1Var.o(new CancellationException());
        }
    }
}
