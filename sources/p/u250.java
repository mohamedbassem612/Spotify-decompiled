package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u250 extends t2u implements lir0 {
    public final nay V1;
    public x250 W1;
    public l7m0 X1;
    public sh0 Y1;
    public kg0 Z1;
    public g1f0 a2;
    public oql b2;
    public r5o c2;
    public wnh1 d2;
    public qhe0 e2;
    public mir0 f2;
    public g7h1 g2;
    public View h2;
    public final CompositeDisposable i2 = new CompositeDisposable();
    public final hrr0 j2 = xto.t((Object) null);

    public u250(nay nayVar) {
        this.V1 = nayVar;
    }

    public final void D0() {
        wnh1 wnh1Var = this.d2;
        if (wnh1Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        wnh1.H(wnh1Var);
        x250 x250Var = this.W1;
        if (x250Var == null) {
            u890.C("viewBinderListener");
            throw null;
        }
        x250Var.b();
        this.i2.g();
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        wnh1 wnh1Var = this.d2;
        if (wnh1Var != null) {
            wnh1Var.F();
        } else {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
    }

    public final void G0() {
        super.G0();
        wnh1 wnh1Var = this.d2;
        if (wnh1Var != null) {
            wnh1Var.G();
        } else {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        this.h2 = view.findViewById(2131429850);
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(apo.j(-1688418410, new rr10(this, (byte) 28), true));
        ((ViewGroup) view).addView(composeView);
        g1f0 g1f0Var = this.a2;
        if (g1f0Var == null) {
            u890.C("remoteProperties");
            throw null;
        }
        if (g1f0Var.u()) {
            c921.y(cto1.q(this), (o8n) null, 0, new j020(this, (lnm) null, (byte) 18), 3);
            return;
        }
        l7m0 l7m0Var = this.X1;
        if (l7m0Var == null) {
            u890.C("googleSignInApi");
            throw null;
        }
        pn40 pn40Var = new pn40(l7m0Var, (byte) 1);
        sh0 sh0Var = this.Y1;
        if (sh0Var == null) {
            u890.C("activityResultRegistry");
            throw null;
        }
        pf30 pf30VarM0 = M0(pn40Var, new ifl1(sh0Var, (byte) 16), new cj8(this, (byte) 3));
        if (bundle == null) {
            l7m0 l7m0Var2 = this.X1;
            if (l7m0Var2 == null) {
                u890.C("googleSignInApi");
                throw null;
            }
            this.i2.b(new CompletableFromAction(new f72(l7m0Var2, (byte) 23)).subscribe((Action) new bm0(this, pf30VarM0, (byte) 29)));
        }
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        mir0 mir0Var = this.f2;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final r5o i1() {
        r5o r5oVar = this.c2;
        if (r5oVar != null) {
            return r5oVar;
        }
        u890.C("googleLoginTracker");
        throw null;
    }

    public final kg0 j1() {
        kg0 kg0Var = this.Z1;
        if (kg0Var != null) {
            return kg0Var;
        }
        u890.C("navigator");
        throw null;
    }

    public final void k1() {
        Bundle bundle = ((zf30) this).f;
        Serializable serializable = bundle != null ? bundle.getSerializable("ARG_INTERACTION_LOGGING_RESULT") : null;
        tv80 tv80Var = serializable instanceof tv80 ? (tv80) serializable : null;
        g7h1 g7h1Var = this.g2;
        if (g7h1Var == null) {
            u890.C("externalActivityFlowTracker");
            throw null;
        }
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        g7h1.b(g7h1Var, yon1.A1(), tv80Var, 2);
    }

    public final void v0(Context context) {
        super.v0(context);
        this.V1.f(this);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131625053, viewGroup, false);
    }
}
