package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vy00 implements hsw {
    public final xgp a;
    public final buc1 b;
    public final jge c;
    public final ezc d;
    public final dt71 e = mgo1.e(0, 1, 0, 5);
    public final boolean f;
    public final yd91 g;

    public vy00(c8c0 c8c0Var, koc0 koc0Var, bct bctVar, xgp xgpVar, buc1 buc1Var) {
        this.a = xgpVar;
        this.b = buc1Var;
        roc0 roc0Var = (roc0) koc0Var;
        boolean z = true;
        this.c = hu20.e(rqt0.u(new x010(new x010(new x72(roc0Var.d(), (byte) 20), yoi1.g(buc1Var.c.a(true)), new dwf0(buc1Var, null, (byte) 29), (byte) 1), buc1Var.h, new irp0(3, null, (byte) 20), (byte) 1)), new auc1(buc1Var, null));
        this.d = yoi1.g(Observable.combineLatest(roc0Var.e(), yoi1.i(new vvu(d3p1.F(bctVar.b, lvx.m(), rih1.a), (byte) 18), o6x.a), new nfb(this, (byte) 10)));
        if (!zro1.v(c8c0Var) && c8c0Var != c8c0.e) {
            z = false;
        }
        this.f = z;
        this.g = new yd91(3, new t3x(this, bctVar, (byte) 26));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.g;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.d;
    }

    @Override // p.hsw
    public final sen0 j() {
        return this.e;
    }
}
