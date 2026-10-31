package p;

import android.content.res.Resources;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class npn implements ebr0 {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;
    public Object d;

    public npn(dg30 dg30Var, kly0 kly0Var, ov20 ov20Var) {
        this.b = dg30Var;
        this.c = kly0Var;
        this.d = d5p1.t(rqt0.u(new p3t(((bw20) ov20Var).a, (byte) 23)), cto1.q(dg30Var), ey71.a, Boolean.FALSE);
    }

    public final h0r0 a(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        switch (this.a) {
            case 0:
                mpn mpnVar = (mpn) parcelable;
                lpn lpnVar = (lpn) ((ynb0) this.b).get();
                hmn hmnVar = (hmn) ((ynb0) this.c).get();
                ryj ryjVar = (ryj) ((ynb0) this.d).get();
                lpnVar.getClass();
                hmnVar.getClass();
                ryjVar.getClass();
                ((rih1) obj).getClass();
                k9k k9kVar = new k9k(lpnVar, hmnVar, ryjVar, mpnVar);
                Resources resources = (Resources) lpnVar.a.get();
                c8o.l(resources);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0 p6r0VarG1 = yon1.G1("LIST_CREATIONMENU", "list/creationmenu", 910, "list");
                lik1 lik1Var = nik1.D1;
                lik1Var.getClass();
                vuf0 vuf0Var = new vuf0(lik1Var);
                i8p i8pVar = (i8p) k9kVar.e;
                ix81 ix81VarA = ryjVar.a();
                c8o.l(ix81VarA);
                gw70 gw70VarB = ryjVar.b();
                pe peVarG = us71.g(gw70VarB, ryjVar);
                c8o.l(ryjVar.f());
                return new kpn(resources, p6r0VarG1, vuf0Var, i8pVar, new qyj(ix81VarA, new q3b1(gw70VarB, peVarG)), mpnVar, hmnVar.e(), xqu.a((i8p) k9kVar.f));
            default:
                ayf0 ayf0Var = (ayf0) ((kly0) this.c).get();
                dg30 dg30Var = (dg30) this.b;
                nwp nwpVarA = ayf0Var.a(dg30Var, dg30Var, ((Boolean) ((xe01) this.d).a.getValue()).booleanValue(), q7r0Var);
                ynb0 ynb0VarA = xqu.a(nwpVarA.C);
                ynb0 ynb0VarA2 = xqu.a(nwpVarA.L);
                l9g0 l9g0Var = new l9g0((byte) 15);
                l9g0Var.b = ynb0VarA;
                l9g0Var.c = ynb0VarA2;
                return l9g0Var.c((aqr0) parcelable, q7r0Var, (rih1) obj);
        }
    }

    public /* synthetic */ npn() {
    }
}
