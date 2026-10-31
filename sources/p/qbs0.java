package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qbs0 extends zf30 {
    public final pjq0 F1;
    public uas0 J1;
    public pf30 K1;
    public q8n M1;
    public ynb0 O1;
    public x2b1 P1;
    public final bck1 U1;
    public ynb0 V1;
    public xcs0 W1;
    public nqh X1;
    public g341 Y1;
    public final PublishSubject G1 = new PublishSubject();
    public final PublishSubject H1 = new PublishSubject();
    public final PublishSubject I1 = new PublishSubject();
    public final vku L1 = new vku();
    public final idd1 N1 = new idd1(new nbs0(this, (byte) 0));
    public final hrr0 Q1 = xto.t((Object) null);
    public final dt71 R1 = mgo1.e(0, 1, 0, 5);
    public final dt71 S1 = mgo1.e(0, 1, 0, 5);
    public final dzp0 T1 = new dzp0((byte) 4);

    public qbs0(pjq0 pjq0Var) {
        this.F1 = pjq0Var;
        nbs0 nbs0Var = new nbs0(this, (byte) 5);
        nbs0 nbs0Var2 = new nbs0(this, (byte) 6);
        znb0 znb0VarS = dm5.S(3, new jqb0(nbs0Var, (byte) 9));
        this.U1 = ebp1.j(this, rc11.a.b(MobiusLoopViewModel.class), new b9o(znb0VarS, (byte) 9), new g22(znb0VarS, (byte) 10), nbs0Var2);
    }

    public final void A0() {
        dzp0 dzp0Var = this.T1;
        hrr0 hrr0Var = (hrr0) dzp0Var.b;
        gpv0 gpv0Var = (gpv0) hrr0Var.getValue();
        if (gpv0Var != null) {
            WebView webViewB = gpv0Var.b();
            ViewParent parent = webViewB.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webViewB);
            }
            webViewB.destroy();
        }
        hrr0Var.setValue((Object) null);
        dzp0Var.d = null;
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        Z0().U(d200.a);
    }

    public final void I0(View view, Bundle bundle) {
        Z0().c.a(this, new pbs0(this, (byte) 0), new pbs0(this, (byte) 1));
        Z0().b.f(n0(), new qpj0(this, (byte) 6));
    }

    public final uas0 Y0() {
        uas0 uas0Var = this.J1;
        if (uas0Var != null) {
            return uas0Var;
        }
        u890.C("args");
        throw null;
    }

    public final MobiusLoopViewModel Z0() {
        return (MobiusLoopViewModel) this.U1.getValue();
    }

    public final void a1(ygw ygwVar, String str) {
        Uri uri = Uri.parse(str == null ? ygwVar.b() : str);
        g341 g341Var = this.Y1;
        if (g341Var != null) {
            this.L1.a(g341Var.a().flatMap(new e341(g341Var, Uri.parse(ygwVar.b()), (byte) 0)).onErrorReturn(new e810(uri, (byte) 1)).subscribe(new qg7(this, str, ygwVar, (byte) 19), new w090(this, ygwVar, (byte) 26)));
        } else {
            u890.C("rxWebToken");
            throw null;
        }
    }

    public final void b1(String str, Intent intent) {
        String strJ;
        Context contextH0;
        try {
            Object objV = Z0().V();
            ccs0 ccs0Var = objV instanceof ccs0 ? (ccs0) objV : null;
            if (ccs0Var != null && (strJ = ccs0Var.j()) != null && tas0.c(strJ) && (contextH0 = h0()) != null) {
                Z0().U(new q200(Y0().Z(), tas0.d(contextH0, strJ, intent), tas0.b(str, strJ)));
            }
        } catch (Exception e) {
            Logger.l(e, "Failed to track payment app-switch attempt", new Object[0]);
        }
    }

    public final void c1(fiw fiwVar) {
        if (fiwVar instanceof bhw) {
            bhw bhwVar = (bhw) fiwVar;
            this.H1.onNext(new rpw(bhwVar.q(), bhwVar.b()));
            return;
        }
        if (fiwVar instanceof dhw) {
            sap1.m(this, "PAYMENT_FRAGMENT_RESULT_KEY", jcs0.b.a());
            return;
        }
        boolean z = fiwVar instanceof fhw;
        rih1 rih1Var = rih1.a;
        if (z) {
            this.I1.onNext(rih1Var);
            return;
        }
        if (fiwVar instanceof ciw) {
            sap1.m(this, "PAYMENT_FRAGMENT_RESULT_KEY", jcs0.a.a());
            return;
        }
        if (fiwVar instanceof zgw) {
            String strQ = ((zgw) fiwVar).q();
            x2b1 x2b1Var = this.P1;
            if (x2b1Var == null) {
                Z0().U(new i000(strQ, new IllegalStateException("onBeforeStartPayment callback has not been set")));
                return;
            } else {
                this.L1.a(((Single) x2b1Var.invoke()).timeout(3L, TimeUnit.MINUTES).subscribe(new mbs0(this, strQ, (byte) 0), new mbs0(this, strQ, (byte) 1)));
                return;
            }
        }
        if (fiwVar instanceof uhw) {
            this.R1.a(rih1Var);
            return;
        }
        if (fiwVar instanceof vhw) {
            this.S1.a(rih1Var);
            return;
        }
        if (fiwVar instanceof lhw) {
            this.G1.onNext(((lhw) fiwVar).b());
            return;
        }
        if (fiwVar instanceof ghw) {
            ghw ghwVar = (ghw) fiwVar;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(ghwVar.c()));
            b1(ghwVar.c(), intent);
            try {
                pf30 pf30Var = this.K1;
                if (pf30Var != null) {
                    pf30Var.a(intent);
                    return;
                } else {
                    u890.C("launcher");
                    throw null;
                }
            } catch (Exception e) {
                Z0().U(new lzz(e, ghwVar.q(), ghwVar.b()));
                return;
            }
        }
        if (!(fiwVar instanceof rhw)) {
            if (fiwVar instanceof ygw) {
                a1((ygw) fiwVar, null);
                return;
            } else if (fiwVar instanceof whw) {
                c921.y((c9n) this.N1.getValue(), (o8n) null, 0, new cto0(this, (whw) fiwVar, (lnm) null, (byte) 26), 3);
                return;
            } else {
                eg.o();
                return;
            }
        }
        rhw rhwVar = (rhw) fiwVar;
        if (rhwVar.b() != null && !mb4.d(P0())) {
            a1(new ygw(0, rhwVar.q(), rhwVar.b()), rhwVar.c());
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.VIEW");
        intent2.setData(Uri.parse(rhwVar.c()));
        b1(rhwVar.c(), intent2);
        try {
            pf30 pf30Var2 = this.K1;
            if (pf30Var2 != null) {
                pf30Var2.a(intent2);
            } else {
                u890.C("launcher");
                throw null;
            }
        } catch (Exception e2) {
            Z0().U(new x300(rhwVar.q(), e2));
        }
    }

    public final void v0(Context context) {
        Object objT = jhc1.t(O0(), "ARGS_KEY", uas0.class);
        if (objT == null) {
            hhg1.n("Required value was null.");
            return;
        }
        this.J1 = (uas0) objT;
        this.F1.f(this);
        if (((ecs0) Z0().V()).q().length() == 0) {
            Z0().U(new q500(Y0()));
            Z0().U(new t500(Y0().b()));
        }
        this.K1 = a0(new xi8(this, (byte) 2), new e1r0((byte) 5));
        xcs0 xcs0Var = this.W1;
        if (xcs0Var == null) {
            u890.C("paymentSessionStorage");
            throw null;
        }
        xcs0Var.e(Y0().b(), Y0().g());
        xcs0 xcs0Var2 = this.W1;
        if (xcs0Var2 == null) {
            u890.C("paymentSessionStorage");
            throw null;
        }
        xcs0Var2.c(Y0().b(), Y0().a());
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(apo.j(248626577, new jyo0(this, composeView, (byte) 27), true));
        Context contextP0 = P0();
        dzp0 dzp0Var = this.T1;
        dzp0Var.getClass();
        z6b z6bVar = new z6b(contextP0, (byte) 1);
        z6bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        z6bVar.setAlpha(0.0f);
        z6bVar.setClickable(false);
        z6bVar.setFocusable(false);
        z6bVar.setImportantForAccessibility(4);
        dzp0Var.d = z6bVar;
        hrr0 hrr0Var = (hrr0) dzp0Var.b;
        gpv0 gpv0Var = (gpv0) hrr0Var.getValue();
        if (gpv0Var != null) {
            if (gpv0Var.a()) {
                gpv0Var.b().destroy();
                hrr0Var.setValue((Object) null);
            } else {
                ViewParent parent = gpv0Var.b().getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(gpv0Var.b());
                }
                z6bVar.addView(gpv0Var.b(), new FrameLayout.LayoutParams(-1, -1));
            }
        }
        FrameLayout frameLayout = new FrameLayout(P0());
        frameLayout.addView(z6bVar);
        frameLayout.addView(composeView);
        return frameLayout;
    }

    public final void y0() {
        ((zf30) this).h1 = true;
        this.L1.c();
    }

    public final void z0() {
        this.T1.d = null;
        ((zf30) this).h1 = true;
    }
}
