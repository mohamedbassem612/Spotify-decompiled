package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class air0 implements iac0, qe41, sck1, ihr0 {
    public yhk1 X;
    public boolean Y;
    public final LinkedList Z;
    public final dcr0 a;
    public final phi0 b;
    public final tac0 c;
    public final jhl d;
    public final nt21 e;
    public final llm f;
    public final ve01 g;
    public final xe01 h;
    public final mr20 i;
    public final ohr0 t;

    public air0(dcr0 dcr0Var, phi0 phi0Var, mr20 mr20Var, Context context, ViewGroup viewGroup, Bundle bundle, x8c0 x8c0Var) {
        wao0 wao0Var;
        Bundle bundle2;
        this.a = dcr0Var;
        this.b = phi0Var;
        tac0 tac0Var = new tac0(this, true);
        this.c = tac0Var;
        jhl jhlVarP = ha71.p(tac0Var, x8c0Var == null ? dcr0Var.f.getLifecycle() : x8c0Var);
        this.d = jhlVarP;
        nt21 nt21VarO = obg1.o(this);
        this.e = nt21VarO;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(ha71.A(j0d1VarB, pyf0.a.f));
        this.f = llmVarE;
        mr20 mr20VarU = rqt0.u(mr20Var);
        sua suaVar = ey71.a;
        ve01 ve01VarR = d5p1.r(mr20VarU, llmVarE, suaVar, 1);
        this.g = ve01VarR;
        xe01 xe01VarT = d5p1.t(h5p1.t(rqt0.u(new h6a(ve01VarR, (byte) 8)), rqt0.u(new xr0(d5p1.h(jhlVarP.c.j), (byte) 25)), new cre0(3, null, (byte) 1)), llmVarE, suaVar, h6r0.a);
        this.h = xe01VarT;
        this.i = rqt0.u(new h6a(new x6a(xe01VarT, (byte) 1), (byte) 9));
        wao0 wao0Var2 = new wao0(this);
        mr20 mr20VarU2 = rqt0.u(new k6e0(new xr0(xe01VarT, (byte) 26), (byte) 18));
        if (bundle != null) {
            bundle2 = bundle.getBundle("contentrenderer");
            wao0Var = wao0Var2;
        } else {
            wao0Var = wao0Var2;
            bundle2 = null;
        }
        ohr0 ohr0Var = new ohr0(phi0Var, dcr0Var, wao0Var, jhlVarP, this, mr20VarU2, ve01VarR, bundle2);
        this.t = ohr0Var;
        c921.y(llmVarE, (o8n) null, 0, new vse0(this, (lnm) null, (byte) 7), 3);
        c921.y(llmVarE, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 14), 3);
        nt21VarO.m();
        nt21VarO.n(bundle);
        tac0Var.i(w8c0.c);
        a6o1.k(this);
        dcr0Var.b().a(new m7r0(viewGroup));
        jup0.k(dcr0Var.c().a().b0(jfe1.class).a());
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        j4m j4mVar = ohr0Var.Z;
        j4mVar.b(context, viewGroup, layoutInflaterFrom, jhlVarP);
        dcr0Var.i.k().getState().f(this, new xjr(this, (byte) 5));
        dcr0Var.b().a(new l7r0(c()));
        tac0Var.i(w8c0.e);
        this.Z = new LinkedList();
        j4mVar.e().f(dcr0Var, new rhr0(this));
    }

    public final void a() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        boolean zIsChangingConfigurations = ((Activity) this.b.j().invoke()).isChangingConfigurations();
        dcr0 dcr0Var = this.a;
        if (!zIsChangingConfigurations) {
            dcr0Var.b().a(new k7r0(false));
        }
        ohr0 ohr0Var = this.t;
        ohr0Var.t.b();
        ohr0Var.X.b();
        smo1.q(ohr0Var.i);
        ohr0Var.Z.d();
        dcr0Var.b().a(n7r0.c);
        this.c.i(w8c0.a);
        jhl jhlVar = this.d;
        x8c0 x8c0Var = jhlVar.a;
        ek2 ek2Var = jhlVar.d;
        x8c0Var.d(ek2Var);
        jhlVar.b.d(ek2Var);
        yhk1 yhk1Var = this.X;
        if (yhk1Var == null) {
            yhk1Var = null;
        }
        if (yhk1Var != null) {
            yhk1Var.a = null;
            yhk1Var.b = null;
            WeakReference weakReference = yhk1Var.c;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
        this.X = null;
        smo1.q(this.f);
    }

    @Override // p.ihr0
    public final boolean b(ehr0 ehr0Var) {
        return this.t.b(ehr0Var);
    }

    public final View c() {
        yhk1 yhk1Var;
        yhk1 yhk1Var2 = this.X;
        if (yhk1Var2 != null || this.Y) {
            return yhk1Var2;
        }
        View viewA = this.t.Z.a();
        if (viewA != null) {
            yhk1Var = new yhk1(viewA.getContext());
            q7r0 q7r0Var = this.a.d().h;
            jhl jhlVar = this.d;
            yhk1Var.a = jhlVar;
            yhk1Var.b = this;
            WeakReference weakReference = yhk1Var.c;
            if (weakReference != null) {
                weakReference.clear();
            }
            WeakReference weakReference2 = new WeakReference(q7r0Var);
            yhk1Var.c = weakReference2;
            x9p1.p(yhk1Var, jhlVar);
            hm5.J(yhk1Var, this);
            hap1.s(yhk1Var, weakReference2);
            yhk1Var.addView(viewA, new FrameLayout.LayoutParams(-1, -1));
        } else {
            yhk1Var = null;
        }
        this.X = yhk1Var;
        return yhk1Var;
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        Bundle bundleSerialize = this.t.Z.serialize();
        if (bundleSerialize != null) {
            bundle.putBundle("contentrenderer", bundleSerialize);
        }
        this.e.o(bundle);
        return bundle;
    }

    public final x8c0 getLifecycle() {
        return this.c;
    }

    public final rck1 o() {
        return this.a.d;
    }

    public final oe41 p() {
        return this.e.j();
    }

    public /* synthetic */ air0(dcr0 dcr0Var, phi0 phi0Var, mr20 mr20Var, mr20 mr20Var2, Context context, ViewGroup viewGroup, Bundle bundle, x8c0 x8c0Var, int i) {
        this(dcr0Var, phi0Var, (i & 8) != 0 ? new lt0(mr20Var, (byte) 5) : mr20Var2, context, viewGroup, bundle, (i & 128) != 0 ? null : x8c0Var);
    }
}
