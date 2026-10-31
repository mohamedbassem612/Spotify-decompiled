package p;

import android.view.ViewGroup;
import android.widget.Button;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zqh extends z511 {
    public final Function0 N0;
    public final vu30 O0;
    public final vu30 P0;
    public final Function0 Q0;
    public List R0 = z6x.a;
    public final String X;
    public final p68 Y;
    public final Function0 Z;
    public final lan1 d;
    public final zsu0 e;
    public final yfx f;
    public final t4d1 g;
    public final jkp0 h;
    public final ofx i;
    public final ofx t;

    public zqh(lan1 lan1Var, zsu0 zsu0Var, yfx yfxVar, t4d1 t4d1Var, jkp0 jkp0Var, ofx ofxVar, ofx ofxVar2, String str, String str2, p68 p68Var, Function0 function0, Function0 function1, vu30 vu30Var, vu30 vu30Var2, Function0 function2) {
        this.d = lan1Var;
        this.e = zsu0Var;
        this.f = yfxVar;
        this.g = t4d1Var;
        this.h = jkp0Var;
        this.i = ofxVar;
        this.t = ofxVar2;
        this.X = str2;
        this.Y = p68Var;
        this.Z = function0;
        this.N0 = function1;
        this.O0 = vu30Var;
        this.P0 = vu30Var2;
        this.Q0 = function2;
    }

    public final void A(List list) {
        this.R0 = list;
        h();
    }

    public final int e() {
        return this.R0.size();
    }

    public final int g(int i) {
        rcx0 rcx0Var = (rcx0) this.R0.get(i);
        if (rcx0Var instanceof pcx0) {
            return 0;
        }
        if (rcx0Var instanceof qcx0) {
            return 5;
        }
        if (rcx0Var instanceof mcx0) {
            return 1;
        }
        if (rcx0Var instanceof ncx0) {
            return 2;
        }
        if (rcx0Var instanceof ocx0) {
            return 3;
        }
        if (rcx0Var instanceof lcx0) {
            return 4;
        }
        eg.o();
        return 0;
    }

    public final void n(int i, w611 w611Var) {
        yqh yqhVar = (yqh) w611Var;
        rcx0 rcx0Var = (rcx0) this.R0.get(i);
        if (rcx0Var instanceof pcx0) {
            wqh wqhVar = yqhVar instanceof wqh ? (wqh) yqhVar : null;
            if (wqhVar != null) {
                wqhVar.U0.f(new kh51(((pcx0) rcx0Var).a));
                return;
            }
            return;
        }
        if (rcx0Var instanceof qcx0) {
            xqh xqhVar = yqhVar instanceof xqh ? (xqh) yqhVar : null;
            if (xqhVar != null) {
                qcx0 qcx0Var = (qcx0) rcx0Var;
                xqhVar.U0.setText(qcx0Var.a);
                Button button = xqhVar.V0;
                button.setText(qcx0Var.b);
                button.setOnClickListener(new et1(this.N0, (byte) 2));
                return;
            }
            return;
        }
        boolean z = rcx0Var instanceof mcx0;
        String str = this.X;
        if (z) {
            sqh sqhVar = yqhVar instanceof sqh ? (sqh) yqhVar : null;
            if (sqhVar != null) {
                dtw dtwVar = sqhVar.U0;
                mcx0 mcx0Var = (mcx0) rcx0Var;
                gu2 gu2Var = new gu2(this, mcx0Var, i, (byte) 10);
                String str2 = mcx0Var.d;
                asu0 asu0Var = new asu0(str, str2, mcx0Var.a, mcx0Var.e, mcx0Var.c, mcx0Var.f, new qff(gu2Var, (byte) 20));
                joa0 joa0Var = new joa0(str2);
                tka0 tka0Var = dtw.C;
                dtwVar.k(asu0Var, joa0Var, (vu30) null);
                xhk1.d(dtwVar.w, new arh(i, (byte) 0));
                return;
            }
            return;
        }
        if (rcx0Var instanceof ocx0) {
            vqh vqhVar = yqhVar instanceof vqh ? (vqh) yqhVar : null;
            if (vqhVar != null) {
                gk51 gk51Var = new gk51(((ocx0) rcx0Var).a);
                qzh qzhVar = vqhVar.U0;
                qzhVar.f(gk51Var);
                qzhVar.n(new vj0(this.Z, (byte) 21));
                return;
            }
            return;
        }
        if (!(rcx0Var instanceof ncx0)) {
            if (!(rcx0Var instanceof lcx0)) {
                eg.o();
                return;
            }
            rqh rqhVar = yqhVar instanceof rqh ? (rqh) yqhVar : null;
            if (rqhVar != null) {
                lcx0 lcx0Var = (lcx0) rcx0Var;
                qzh qzhVar2 = rqhVar.U0;
                qzhVar2.f(new t7x(lcx0Var.a, lcx0Var.b, lcx0Var.c, lcx0Var.d));
                qzhVar2.n(new vj0(this.Q0, (byte) 20));
                return;
            }
            return;
        }
        tqh tqhVar = yqhVar instanceof tqh ? (tqh) yqhVar : null;
        if (tqhVar != null) {
            dtw dtwVar2 = tqhVar.U0;
            ncx0 ncx0Var = (ncx0) rcx0Var;
            gu2 gu2Var2 = new gu2(this, ncx0Var, i, (byte) 11);
            String str3 = ncx0Var.d;
            ix6 ix6Var = new ix6(str, str3, ncx0Var.a, ncx0Var.e, ncx0Var.c, new qff(gu2Var2, (byte) 21));
            joa0 joa0Var2 = new joa0(str3);
            tka0 tka0Var2 = dtw.C;
            dtwVar2.k(ix6Var, joa0Var2, (vu30) null);
            xhk1.d(dtwVar2.w, new arh(i, (byte) 0));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public final w611 p(int i, ViewGroup viewGroup) throws jgo0 {
        if (i == 0) {
            return new wqh(this.f.a((l0i) null));
        }
        if (i == 5) {
            return new xqh(eqq.l(viewGroup, 2131626107, viewGroup, false));
        }
        if (i == 2) {
            int i2 = tqh.V0;
            dx0 dx0Var = new dx0((zfx) this.g.b);
            tka0 tka0Var = dtw.C;
            return new tqh(mhc.d(viewGroup.getContext(), viewGroup, dx0Var, (drw) null, 24));
        }
        if (i == 1) {
            int i3 = sqh.V0;
            dx0 dx0Var2 = new dx0((zfx) this.h.b, (byte) 0);
            tka0 tka0Var2 = dtw.C;
            return new sqh(mhc.d(viewGroup.getContext(), viewGroup, dx0Var2, (drw) null, 24));
        }
        if (i == 3) {
            return new vqh(this.i.a((l0i) null));
        }
        if (i == 4) {
            return new rqh(this.t.a((l0i) null));
        }
        throw new jgo0("An operation is not implemented: Type doesn't exist!");
    }
}
