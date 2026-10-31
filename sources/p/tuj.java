package p;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tuj implements anc0 {
    public final pe a;
    public final gw70 b;
    public final wmy c;
    public final koc0 d;
    public final acr e;
    public final q8n f;
    public final q8n g;
    public xab1 h;
    public xab1 i;
    public final ayh j = sap1.a();
    public final toj0 k;
    public final ve01 l;
    public final j1v0 m;
    public final txj n;

    public tuj(yzc0 yzc0Var, pe peVar, gw70 gw70Var, wmy wmyVar, koc0 koc0Var, mpp mppVar, boolean z, qwt0 qwt0Var, r6h1 r6h1Var, acr acrVar, dxy dxyVar, ppp pppVar, q8n q8nVar, ArrayList arrayList, q8n q8nVar2, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        any huzVar;
        this.a = peVar;
        this.b = gw70Var;
        this.c = wmyVar;
        this.d = koc0Var;
        this.e = acrVar;
        this.f = q8nVar;
        this.g = q8nVar2;
        uap uapVar = (uap) pppVar.a.c;
        qpp qppVar = (qpp) uapVar.p.get();
        toj0 toj0Var = new toj0(qppVar, (acr) uapVar.k.get(), yzc0Var, qwt0Var, r6h1Var);
        this.k = toj0Var;
        boolean zIsEmpty = arrayList.isEmpty();
        lnm lnmVar = null;
        mr20 mr20VarU = rqt0.u(new ht20(yzc0Var.j(), new s55(2, (lnm) null, (byte) 26)));
        roc0 roc0Var = (roc0) koc0Var;
        mr20 mr20VarU2 = rqt0.u(new kr41(roc0Var.d(), (byte) 14));
        if (zIsEmpty) {
            z6x z6xVar = z6x.a;
            huzVar = new huz(new m7e0(0, z6xVar, z6xVar, null), (byte) 10);
        } else {
            huzVar = roc0Var.c();
        }
        ve01 ve01VarR = d5p1.r(o4p1.r(h5p1.r(mr20VarU, mr20VarU2, huzVar, rqt0.u((mr20) ((idd1) toj0Var.g).getValue()), new k8y0(5, lnmVar)), q8nVar), smo1.e(q8nVar2), new alb1(0L, Long.MAX_VALUE), 1);
        this.l = ve01VarR;
        any anyVarD = roc0Var.d();
        uap uapVar2 = (uap) mppVar.a.c;
        v9q v9qVar = (v9q) ((zyc0) uapVar2.I).r.get();
        c8o.l(v9qVar);
        q8n q8nVarB = ((zyc0) uapVar2.I).b();
        c8o.l(q8nVarB);
        luk lukVarA = ((zyc0) uapVar2.I).a();
        c8o.l(lukVarA);
        j1v0 j1v0Var = new j1v0(v9qVar, q8nVarB, new oq4(100, lukVarA, false), (wen0) uapVar2.i.get(), wmyVar, z, anyVarD, arrayList, ve01VarR, arrayList2, arrayList3, arrayList4);
        this.m = j1v0Var;
        this.n = new txj(!arrayList.isEmpty(), (l5d0) dxyVar.d, ((xx4) dxyVar.c).b(), wmyVar, j1v0Var, (s061) dxyVar.e, rqt0.u(roc0Var.d()), (tl7) ((kly0) dxyVar.b).get(), r6h1Var, (npp) dxyVar.f, (wen0) dxyVar.g);
    }

    @Override // p.anc0
    public final void a() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    @Override // p.anc0
    public final void b() {
        xab1 xab1Var = this.i;
        lnm lnmVar = null;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = fn31.T(smo1.e(this.f), (o8n) null, 0, new suj(this, lnmVar, (byte) 1), 3);
    }

    @Override // p.anc0
    public final Object h(l8t0 l8t0Var) {
        Object objQ = this.j.Q(l8t0Var);
        return objQ == d9n.a ? objQ : rih1.a;
    }

    @Override // p.anc0
    public final void n() {
        xab1 xab1Var = this.h;
        lnm lnmVar = null;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.h = fn31.T(smo1.e(this.f), (o8n) null, 0, new suj(this, lnmVar, (byte) 0), 3);
        mr20 mr20Var = (mr20) this.m.v.getValue();
        wmy wmyVar = this.c;
        xab1 xab1Var2 = (xab1) wmyVar.e;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        wmyVar.e = fn31.T(smo1.e((q8n) wmyVar.a), (o8n) null, 0, new k53(wmyVar, mr20Var, (lnm) null, (byte) 15), 3);
    }

    @Override // p.anc0
    public final void q() {
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        xab1 xab1Var2 = (xab1) this.c.e;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
    }
}
