package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class obz0 extends z511 implements mbz0 {
    public e611 N0;
    public boolean O0;
    public final bdz0 P0;
    public final zl7 Q0;
    public List Y;
    public RecyclerView Z;
    public final xfx d;
    public final eh4 e;
    public final gtc1 f;
    public final bno g;
    public final fn90 t;
    public iu30 h = v9z0.f;
    public Function0 i = h0x0.Y0;
    public ArrayList X = new ArrayList();

    public obz0(Resources resources, xfx xfxVar, eh4 eh4Var, gtc1 gtc1Var, bno bnoVar, ykq ykqVar) {
        this.d = xfxVar;
        this.e = eh4Var;
        this.f = gtc1Var;
        this.g = bnoVar;
        this.t = new fn90(new jcz0(resources, this));
        bdz0 bdz0Var = yoo1.w(eh4Var) ? (bdz0) ykqVar.get() : null;
        this.P0 = bdz0Var;
        this.Q0 = bdz0Var != null ? new zl7(bdz0Var, (byte) 14) : null;
    }

    public static void F(ArrayList arrayList, int i, iu30 iu30Var) {
        Object objT0 = o7h.t0(i, arrayList);
        ivf1 ivf1Var = objT0 instanceof ivf1 ? (ivf1) objT0 : null;
        hjf1 hjf1Var = ivf1Var != null ? ivf1Var.a : null;
        if (hjf1Var != null) {
            iu30Var.invoke(hjf1Var);
        }
    }

    public final ArrayList A() {
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ivf1) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ivf1) it.next()).a);
        }
        return arrayList3;
    }

    public final boolean B(int i, int i2) {
        if (i >= 0 && i < this.X.size() && i2 >= 0 && i2 < this.X.size()) {
            if (this.X.get(i2) instanceof ivf1) {
                return true;
            }
            List listSubList = this.X.subList(0, i2);
            if (!(listSubList instanceof Collection) || !listSubList.isEmpty()) {
                Iterator it = listSubList.iterator();
                while (it.hasNext()) {
                    if (((caz0) it.next()) instanceof ivf1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void C(ve veVar, int i) {
        if (veVar.equals(qe.a)) {
            F(this.X, i, new nbz0(this, (byte) 1));
            return;
        }
        if (veVar.equals(te.a)) {
            F(this.X, i, new nbz0(this, (byte) 0));
            return;
        }
        if (veVar.equals(ue.a)) {
            F(this.X, i, new ym(this, i, (byte) 21));
            return;
        }
        if (veVar.equals(re.a)) {
            int i2 = i + 1;
            D(i, i2);
            E(i, i2);
        } else {
            if (!veVar.equals(se.a)) {
                eg.o();
                return;
            }
            int i3 = i - 1;
            D(i, i3);
            E(i, i3);
        }
    }

    public final void D(int i, int i2) {
        if (i == i2 || !B(i, i2)) {
            return;
        }
        if (this.Y == null) {
            this.Y = o7h.l1(this.X);
        }
        ArrayList arrayList = this.X;
        arrayList.add(i2, arrayList.remove(i));
        j(i, i2);
    }

    public final void E(int i, int i2) {
        Object next;
        List list = this.Y;
        this.Y = null;
        if (i == i2 || !B(i, i2)) {
            return;
        }
        ArrayList arrayList = this.X;
        j3y0 j3y0Var = new j3y0(list, this, (byte) 8);
        Iterator it = arrayList.subList(i2, arrayList.size()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((caz0) next) instanceof ivf1));
        ivf1 ivf1Var = next instanceof ivf1 ? (ivf1) next : null;
        hjf1 hjf1Var = ivf1Var != null ? ivf1Var.a : null;
        if (hjf1Var != null) {
            j3y0Var.invoke(hjf1Var);
        }
    }

    public final int e() {
        return this.X.size();
    }

    public final int g(int i) {
        caz0 caz0Var = (caz0) this.X.get(i);
        if (caz0Var instanceof ivf1) {
            return 2;
        }
        if (caz0Var instanceof vg51) {
            return 1;
        }
        if (caz0Var instanceof sq41) {
            return 0;
        }
        eg.o();
        return 0;
    }

    public final void m(RecyclerView recyclerView) {
        this.Z = recyclerView;
        this.N0 = recyclerView.getItemAnimator();
        this.t.i(recyclerView);
        zl7 zl7Var = this.Q0;
        if (zl7Var != null) {
            recyclerView.m(zl7Var);
        }
    }

    public final void n(int i, w611 w611Var) {
        jbz0 jbz0Var;
        daz0 daz0Var = (daz0) w611Var;
        caz0 caz0Var = (caz0) this.X.get(i);
        boolean z = daz0Var instanceof n2g1;
        fn90 fn90Var = this.t;
        if (z) {
            ivf1 ivf1Var = caz0Var instanceof ivf1 ? (ivf1) caz0Var : null;
            if (ivf1Var != null) {
                hjf1 hjf1Var = ivf1Var.a;
                n2g1 n2g1Var = (n2g1) daz0Var;
                iu30 iu30Var = this.h;
                nsm0 nsm0Var = new nsm0(2, this, obz0.class, "onAccessibilityAction", "onAccessibilityAction(Lcom/spotify/nowplayingqueue/bottomsheet/view/adapter/AccessibilityAction;I)V", 0, (byte) 14);
                yhf1 yhf1VarN = ljo1.n(hjf1Var);
                int i2 = yhf1VarN.a;
                int i3 = yhf1VarN.b;
                int i4 = yhf1VarN.c;
                n2g1Var.W0 = i2;
                n2g1Var.V0 = i3;
                n2g1Var.X0 = i4;
                fws fwsVar = n2g1Var.U0;
                fwsVar.f(d9y0.x(hjf1Var, 1));
                fwsVar.n(new tjf0((Object) n2g1Var, (Object) hjf1Var, (Object) iu30Var, (Object) fn90Var, (Object) nsm0Var, (byte) 29));
                return;
            }
            return;
        }
        if (!(daz0Var instanceof dzf1)) {
            if (!(daz0Var instanceof gh51)) {
                if (daz0Var instanceof tq41) {
                    return;
                }
                eg.o();
                return;
            }
            lbz0 lbz0Var = ((gh51) daz0Var).U0;
            Context context = lbz0Var.getView().getContext();
            int iC = l1d.C(((vg51) caz0Var).a);
            if (iC == 0) {
                jbz0Var = new jbz0(context.getString(2131963222));
            } else if (iC == 1) {
                jbz0Var = new jbz0(context.getString(2131963223));
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                jbz0Var = new jbz0(2131232592, context.getString(2131963241), false);
            }
            lbz0Var.f(jbz0Var);
            return;
        }
        ivf1 ivf1Var2 = caz0Var instanceof ivf1 ? (ivf1) caz0Var : null;
        if (ivf1Var2 != null) {
            hjf1 hjf1Var2 = ivf1Var2.a;
            dzf1 dzf1Var = (dzf1) daz0Var;
            dtw dtwVar = dzf1Var.U0;
            iu30 iu30Var2 = this.h;
            nsm0 nsm0Var2 = new nsm0(2, this, obz0.class, "onAccessibilityAction", "onAccessibilityAction(Lcom/spotify/nowplayingqueue/bottomsheet/view/adapter/AccessibilityAction;I)V", 0, (byte) 15);
            yhf1 yhf1VarN2 = ljo1.n(hjf1Var2);
            int i5 = yhf1VarN2.a;
            int i6 = yhf1VarN2.b;
            int i7 = yhf1VarN2.c;
            dzf1Var.X0 = i5;
            dzf1Var.W0 = i6;
            dzf1Var.Y0 = i7;
            Object objInvoke = dzf1Var.V0.invoke(hjf1Var2, new tjf0((Object) dzf1Var, (Object) hjf1Var2, (Object) fn90Var, (Object) iu30Var2, (Object) nsm0Var2, (byte) 28));
            joa0 joa0Var = new joa0(hjf1Var2.a);
            tka0 tka0Var = dtw.C;
            dtwVar.k(objInvoke, joa0Var, (vu30) null);
            xhk1.d(dtwVar.w, new fom(hjf1Var2, (byte) 2));
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        if (i != 2) {
            if (i == 1) {
                return new gh51(new lbz0(viewGroup.getContext()));
            }
            if (i == 0) {
                View view = new View(viewGroup.getContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
                return new tq41(view);
            }
            View view2 = new View(viewGroup.getContext());
            view2.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
            return new tq41(view2);
        }
        eh4 eh4Var = this.e;
        if (yoo1.w(eh4Var)) {
            int i2 = lxf1.a1;
            bno bnoVar = this.g;
            kox0 kox0Var = new kox0(bnoVar.a, bnoVar.b, bnoVar.c);
            tka0 tka0Var = dtw.C;
            return new lxf1(mhc.d(viewGroup.getContext(), viewGroup, kox0Var, (drw) null, 24), ggf1.O0);
        }
        if (!eh4Var.i()) {
            wfx wfxVar = this.d.c;
            return new n2g1(new fws(wfxVar.b, wfxVar.a));
        }
        int i3 = dzf1.Z0;
        px6 px6Var = new px6(this.f.a, (byte) 9);
        tka0 tka0Var2 = dtw.C;
        return new dzf1(mhc.d(viewGroup.getContext(), viewGroup, px6Var, (drw) null, 24), ggf1.Q0);
    }

    public final void r(RecyclerView recyclerView) {
        zl7 zl7Var = this.Q0;
        if (zl7Var != null) {
            recyclerView.p0(zl7Var);
        }
        this.Z = null;
        this.N0 = null;
    }
}
