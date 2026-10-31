package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class un91 extends v4n {
    public final hq81 b2;
    public igx c2;
    public lzn0 d2;
    public vqq e2;
    public wn91 f2;
    public vkg g2;
    public final idd1 h2 = new idd1(new fe81(this, (byte) 20));

    public un91(hq81 hq81Var) {
        this.b2 = hq81Var;
    }

    public final void A0() {
        vkg vkgVar = this.g2;
        if (vkgVar != null) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            vkgVar.h(yon1.p5(), nik1.K4.a());
        }
        this.g2 = null;
        super/*p.t2u*/.A0();
    }

    public final void I0(View view, Bundle bundle) {
        super/*p.haa*/.I0(view, bundle);
        vkg vkgVar = this.g2;
        if (vkgVar != null) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            vkgVar.U(yon1.p5(), nik1.K4.a());
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(2131430404);
        igx igxVar = this.c2;
        if (igxVar == null) {
            u890.C("playModePickerFactory");
            throw null;
        }
        qzh qzhVarA = igxVar.a((l0i) null);
        String strL0 = l0(2131959813);
        j4b1 j4b1Var = j4b1.AD;
        qzhVarA.f(new znt0(strL0, new ynt0()));
        qzhVarA.n(new tn91(this, (byte) 0));
        qzhVarA.getView().setId(2131430405);
        linearLayout.addView(qzhVarA.getView());
        igx igxVar2 = this.c2;
        if (igxVar2 == null) {
            u890.C("playModePickerFactory");
            throw null;
        }
        qzh qzhVarA2 = igxVar2.a((l0i) null);
        qzhVarA2.f(new znt0(l0(2131959818), l0(2131959814), new xnt0(), true));
        qzhVarA2.n(new tn91(this, (byte) 1));
        qzhVarA2.getView().setId(2131430406);
        linearLayout.addView(qzhVarA2.getView());
        ((vn91) this.h2.getValue()).b();
    }

    public final void k1(t4n t4nVar) {
        t4nVar.setOnShowListener(new kx1(this, t4nVar, (byte) 1));
    }

    public final void l1() {
        ((vn91) this.h2.getValue()).a();
        wn91 wn91Var = this.f2;
        if (wn91Var != null) {
            wn91Var.b().invoke();
        }
    }

    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(2131625401, viewGroup, false);
    }

    public final void p1(rn91 rn91Var) {
        tv80 tv80VarC;
        int iOrdinal = rn91Var.ordinal();
        idd1 idd1Var = this.h2;
        if (iOrdinal == 0) {
            tv80VarC = ((vn91) idd1Var.getValue()).c();
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            tv80VarC = ((vn91) idd1Var.getValue()).d();
        }
        wn91 wn91Var = this.f2;
        if (wn91Var != null) {
            wn91Var.a().invoke(rn91Var, tv80VarC);
        }
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(Context context) {
        this.b2.f(this);
        this.g2 = context instanceof vkg ? (vkg) context : null;
        super/*p.t2u*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        if (bundle != null) {
            dismiss();
        }
        super/*p.t2u*/.w0(bundle);
    }
}
