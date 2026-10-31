package com.spotify.allboarding.allboardingimpl.presentation.carousel;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.android.MobiusLoopViewModel;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azd;
import p.bck1;
import p.d6d1;
import p.dm5;
import p.e3h1;
import p.edr0;
import p.en3;
import p.eq80;
import p.es3;
import p.esm0;
import p.fe41;
import p.fz3;
import p.g22;
import p.gw70;
import p.i8h1;
import p.jik1;
import p.jp80;
import p.ka;
import p.l6h1;
import p.lik1;
import p.lyd;
import p.msm0;
import p.n6r0;
import p.n7h1;
import p.o6r0;
import p.op80;
import p.p6r0;
import p.pap1;
import p.po41;
import p.q6x;
import p.qdd1;
import p.qm3;
import p.r1e;
import p.rc11;
import p.ts3;
import p.u890;
import p.utm0;
import p.w1e;
import p.wch;
import p.xhk1;
import p.xrc;
import p.ydb;
import p.yg30;
import p.yon1;
import p.zau0;
import p.zf30;
import p.zlv;
import p.znb0;
import p.zo41;
import p.zyd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/presentation/carousel/CarouselFragment;", "Lp/zf30;", "Lp/o6r0;", "Lp/jik1;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CarouselFragment extends zf30 implements o6r0, jik1 {
    public final yg30 F1;
    public gw70 G1;
    public en3 H1;
    public msm0 I1;
    public w1e J1;
    public boolean K1;
    public i8h1 L1;
    public l6h1 M1;
    public edr0 N1;
    public final bck1 O1;
    public ComposeView P1;
    public utm0 Q1;
    public zau0 R1;
    public final lik1 S1;

    public CarouselFragment(yg30 yg30Var) {
        this.F1 = yg30Var;
        azd azdVar = new azd(this, (byte) 2);
        znb0 znb0VarS = dm5.S(3, new ka(new ka(this, (byte) 9), (byte) 10));
        this.O1 = new bck1(rc11.a.b(r1e.class), new g22(znb0VarS, (byte) 2), azdVar, new g22(znb0VarS, (byte) 3));
        this.S1 = ts3.CAROUSEL.b;
    }

    public final void D0() {
        utm0 utm0Var;
        ((zf30) this).h1 = true;
        r1e r1eVarY0 = Y0();
        r1eVarY0.g.b(r1eVarY0.V(), "VIEW_STATE");
        zau0 zau0Var = this.R1;
        if (zau0Var == null || (utm0Var = this.Q1) == null) {
            return;
        }
        utm0Var.b(zau0Var);
    }

    public final void E0() {
        utm0 utm0Var;
        ((zf30) this).h1 = true;
        zau0 zau0Var = this.R1;
        if (zau0Var == null || (utm0Var = this.Q1) == null) {
            return;
        }
        utm0Var.a(zau0Var);
    }

    public final void I0(View view, Bundle bundle) {
        ((MobiusLoopViewModel) Y0()).c.c(this, new es3(this, (byte) 2));
        ((MobiusLoopViewModel) Y0()).b.f(n0(), new zyd(this, (byte) 0));
        ((fe41) pap1.w(this).h(2131427916).X.getValue()).a("skipDialogResult").f(this, new zyd(this, (byte) 1));
    }

    public final r1e Y0() {
        return (r1e) this.O1.getValue();
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("ALLBOARDING_CAROUSEL", "allboarding/carousel", 143, qm3.b);
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getS1() {
        return this.S1;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        msm0 msm0Var = this.I1;
        if (msm0Var == null) {
            u890.C("multiPlayerFactory");
            throw null;
        }
        utm0 utm0VarB = msm0Var.a(new fz3((byte) 0)).b(new esm0((String) null, xrc.X), 5);
        this.Q1 = utm0VarB;
        this.R1 = utm0VarB.c(false);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        utm0 utm0Var;
        super.x0(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            en3 en3Var = this.H1;
            if (en3Var == null) {
                u890.C("screenProvider");
                throw null;
            }
            zo41 zo41Var = en3Var.a;
            if (zo41Var instanceof po41) {
                Y0().U(new lyd((po41) zo41Var));
            }
        }
        zau0 zau0Var = this.R1;
        if (zau0Var != null && (utm0Var = this.Q1) != null) {
            utm0Var.a(zau0Var);
        }
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(N0(), qdd1Var, qdd1Var);
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.P1 = composeView;
        if (this.K1) {
            op80 jp80Var = new jp80(composeView);
            i8h1 i8h1Var = this.L1;
            if (i8h1Var == null) {
                u890.C("ubiLogger");
                throw null;
            }
            l6h1 l6h1Var = this.M1;
            if (l6h1Var == null) {
                u890.C("ubiDwellTimeLogger");
                throw null;
            }
            op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
            op80 wchVar = q6x.b;
            if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                jp80Var = wchVar;
            } else if (jp80Var.equals(wchVar)) {
                jp80Var = eq80Var;
            } else if (!eq80Var.equals(wchVar)) {
                wchVar = new wch(jp80Var, eq80Var);
                jp80Var = wchVar;
            }
            xhk1.c(composeView, jp80Var);
        }
        N0().J().a(n0(), new ydb(this, (byte) 3));
        ComposeView composeView2 = this.P1;
        if (composeView2 != null) {
            return composeView2;
        }
        u890.C("composeView");
        throw null;
    }

    public final void y0() {
        ((zf30) this).h1 = true;
        this.Q1 = null;
        this.R1 = null;
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        utm0 utm0Var = this.Q1;
        if (utm0Var != null) {
            utm0Var.d();
        }
    }
}
