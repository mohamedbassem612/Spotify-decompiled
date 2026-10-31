package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ty51 extends x7e0 {
    public final d0r d;
    public final tag1 e;
    public final c061 f;
    public final boolean g;
    public final llm h;
    public k8g1 i = new k8g1();

    public ty51(d0r d0rVar, tag1 tag1Var, c061 c061Var, boolean z, q8n q8nVar) {
        this.d = d0rVar;
        this.e = tag1Var;
        this.f = c061Var;
        this.g = z;
        this.h = i3a.k(q8nVar);
    }

    public final void e() {
        if (this.i.a.length() > 0) {
            i();
            return;
        }
        j();
        fn31.T(this.h, (o8n) null, 0, new w621(this, (lnm) null, (byte) 3), 3);
    }

    public final void f() {
        smo1.p(this.h, (CancellationException) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(onm onmVar) {
        py51 py51Var;
        if (onmVar instanceof py51) {
            py51Var = (py51) onmVar;
            int i = py51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                py51Var.c = i - Integer.MIN_VALUE;
            } else {
                py51Var = new py51(this, onmVar);
            }
        } else {
            py51Var = new py51(this, onmVar);
        }
        Object objI = py51Var.a;
        int i2 = py51Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            cly0 cly0Var = new cly0(d3p1.F(this.d, w3p1.o(new l4r(pwc0.w, 1, wu51.t, new j4r(wu51.Y), wu51.X), wu51.Z), new ga01(10, this.f.a, (String) null, false)), (byte) 8);
            py51Var.c = 1;
            objI = b5p1.i(cly0Var, py51Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        i1r i1rVar = (k1r) objI;
        if (i1rVar instanceof i1r) {
            return (k8g1) i1rVar.a;
        }
        if (i1rVar instanceof h1r) {
            eg.m(((h1r) i1rVar).a.getMessage());
            return null;
        }
        hhg1.o(i1rVar, "Unexpected DataResult state: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(onm onmVar) {
        sy51 sy51Var;
        if (onmVar instanceof sy51) {
            sy51Var = (sy51) onmVar;
            int i = sy51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sy51Var.c = i - Integer.MIN_VALUE;
            } else {
                sy51Var = new sy51(this, onmVar);
            }
        } else {
            sy51Var = new sy51(this, onmVar);
        }
        Object objI = sy51Var.a;
        int i2 = sy51Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            o3r o3rVarO = w3p1.o(new l4r(pwc0.w, 1, wu51.N0, new j4r(wu51.P0), wu51.O0), wu51.Q0);
            tf2 tf2Var = new tf2(hu20.e(new zo51(this.e.b(this.f.a), this, (byte) 2), new c6e0((lnm) null, this, o3rVarO, (byte) 21)), (byte) 25);
            sy51Var.c = 1;
            objI = b5p1.i(tf2Var, sy51Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        i1r i1rVar = (k1r) objI;
        if (i1rVar instanceof i1r) {
            return (k8g1) i1rVar.a;
        }
        if (i1rVar instanceof h1r) {
            eg.m(((h1r) i1rVar).a.getMessage());
            return null;
        }
        hhg1.o(i1rVar, "Unexpected DataResult state: ");
        return null;
    }
}
