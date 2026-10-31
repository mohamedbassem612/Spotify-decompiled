package p;

import android.app.Activity;
import android.app.Application;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ro9 {
    public final Application a;
    public final e831 b;
    public final p8q c;
    public final e3h1 d;
    public ComposeView e;
    public Activity f;
    public tm g;
    public final si0 h = new si0(this, (byte) 1);
    public final hrr0 i;
    public final hrr0 j;
    public View k;
    public qo9 l;
    public z11 m;
    public war0 n;
    public final hrr0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final err0 f129p;
    public final err0 q;
    public final mdt r;

    public ro9(Application application, e831 e831Var, p8q p8qVar, i8h1 i8h1Var, l6h1 l6h1Var) {
        this.a = application;
        this.b = e831Var;
        this.c = p8qVar;
        this.d = new e3h1(l6h1Var, (n7h1) null, i8h1Var);
        Boolean bool = Boolean.FALSE;
        this.i = v8r.q(bool);
        this.j = v8r.q((Object) null);
        this.o = v8r.q(bool);
        this.f129p = new err0(0);
        this.q = new err0(0);
        this.r = yv91.a(new vv8(this, (byte) 4));
    }

    public final void a(int i, j2i j2iVar, b0k b0kVar) {
        b0k b0kVar2;
        float fE;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1653211387);
        int i2 = (b0kVar3.i(this) ? 32 : 16) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = b0kVar3.i(this);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new kk(this, (lnm) null, (byte) 20);
                b0kVar3.s0(objT);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT);
            long jC = jhc1.c(dsa0.m(b0kVar3, 2131166811), dsa0.m(b0kVar3, 2131166809));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            int iIntValue = ((Number) this.r.getValue()).intValue();
            kiv kivVar = t4k.n;
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).g;
            u85 u85Var2 = lhc.g(b0kVar3).b;
            b0kVar3.i0(401772962);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            float fM0 = watVar.M0(Math.max(u85Var.e().a, u85Var2.e().a)) + 8.0f;
            float fM1 = watVar.M0(Math.max(u85Var.e().c, u85Var2.e().c)) + 8.0f;
            float fM2 = watVar.M0(Math.max(this.q.s(), Math.max(u85Var.e().b, u85Var2.e().b))) + 8.0f;
            p3v p3vVar = new p3v(watVar.M0(Math.max(u85Var.e().d, u85Var2.e().d)) + 8.0f);
            if (iIntValue > 0) {
                b0kVar3.i0(-1354401128);
                b0kVar3.r(false);
                fE = watVar.M0(iIntValue) + 8.0f;
            } else {
                fE = z5c.e(b0kVar3, -1354399483, 2131166810, b0kVar3, false);
            }
            tzq0 tzq0Var = new tzq0(fM0, fM2, fM1, pap1.y(p3vVar, new p3v(fE)).a);
            b0kVar3.r(false);
            f8n f8nVar = (f8n) this.j.getValue();
            if (f8nVar == null) {
                b0kVar3.i0(401792112);
                f8nVar = ((flb0) b0kVar3.k(kivVar)) == flb0.b ? f8n.BottomLeft : f8n.BottomRight;
            } else {
                b0kVar3.i0(401791616);
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            w2g0.c(u291.d(nim0.a, 1.0f), (tl3) null, apo.r(2044142939, new oo9(jC, tzq0Var, this, f8nVar, j2iVar, (byte) 0), b0kVar3), b0kVar2, 3072, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(this, j2iVar, i, (byte) 5);
        }
    }

    public final void b() {
        tm tmVar;
        c();
        bbr0 bbr0Var = this.f;
        if (bbr0Var == null || (tmVar = this.g) == null) {
            return;
        }
        f();
        bbr0 bbr0Var2 = bbr0Var instanceof bbr0 ? bbr0Var : null;
        if (bbr0Var2 != null) {
            war0 war0VarB0 = bbr0Var2.b0(f6w0.class);
            this.n = war0VarB0;
            z11 z11Var = new z11(this, (byte) 3);
            this.m = z11Var;
            war0VarB0.d(z11Var);
        }
        wzf0 wzf0VarO = j1e1.o(bbr0Var.getWindow().getDecorView());
        if (wzf0VarO != null) {
            yat yatVarB = z1a1.b(bbr0Var);
            View view = wzf0VarO.a;
            this.k = view;
            qo9 qo9Var = new qo9(this, wzf0VarO, yatVarB, (byte) 0);
            this.l = qo9Var;
            view.addOnLayoutChangeListener(qo9Var);
            erl1 erl1Var = wzf0VarO.b;
            this.q.t(erl1Var.c(yatVarB));
            this.f129p.t(erl1Var.d(yatVarB));
        }
        ComposeView composeView = new ComposeView(bbr0Var, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        composeView.setImportantForAccessibility(1);
        composeView.setContent(new j2i(-802100721, new zt6(composeView, this, tmVar, (byte) 17), true));
        View decorView = bbr0Var.getWindow().getDecorView();
        FrameLayout frameLayout = decorView instanceof FrameLayout ? (FrameLayout) decorView : null;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(composeView);
        this.e = composeView;
    }

    public final void c() {
        View view = this.e;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        this.e = null;
    }

    public final void d() {
        this.a.unregisterActivityLifecycleCallbacks(this.h);
        f();
        c();
        this.i.setValue(Boolean.FALSE);
        this.g = null;
        this.f = null;
    }

    public final void e(iu30 iu30Var) {
        d();
        daq daqVar = this.c.a.a;
        this.g = new tm((rm9) daqVar.Un.get(), (w2k1) daqVar.Sn.get(), iu30Var);
        this.f = this.b.a();
        this.a.registerActivityLifecycleCallbacks(this.h);
        b();
    }

    public final void f() {
        war0 war0Var;
        View view;
        qo9 qo9Var = this.l;
        if (qo9Var != null && (view = this.k) != null) {
            view.removeOnLayoutChangeListener(qo9Var);
        }
        z11 z11Var = this.m;
        if (z11Var != null && (war0Var = this.n) != null) {
            war0Var.c(z11Var);
        }
        this.l = null;
        this.k = null;
        this.m = null;
        this.n = null;
        this.o.setValue(Boolean.FALSE);
        this.q.t(0);
        this.f129p.t(0);
    }
}
