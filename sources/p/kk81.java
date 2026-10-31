package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.MobiusLoop;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kk81 extends zf30 implements lir0 {
    public final jf11 F1;
    public zj81 G1;
    public uur0 H1;
    public gw70 I1;
    public mir0 J1;
    public mk81 K1;
    public MobiusLoop.Controller L1;
    public faa0 M1;

    public kk81(jf11 jf11Var) {
        this.F1 = jf11Var;
    }

    public final void D0() {
        uur0 uur0Var = this.H1;
        if (uur0Var == null) {
            u890.C("poller");
            throw null;
        }
        uur0Var.b();
        faa0 faa0Var = this.M1;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.M1 = null;
        Y0().stop();
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        this.M1 = c921.y(cto1.q(this), (o8n) null, 0, new b751(this, (lnm) null, (byte) 22), 3);
        Y0().start();
    }

    public final MobiusLoop.Controller Y0() {
        MobiusLoop.Controller controller = this.L1;
        if (controller != null) {
            return controller;
        }
        u890.C("controller");
        throw null;
    }

    @Override // p.lir0
    public final mir0 c() {
        mir0 mir0Var = this.J1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final void v0(Context context) {
        super.v0(context);
        this.F1.f(this);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        zj81 zj81Var = this.G1;
        if (zj81Var != null) {
            this.L1 = zj81Var.a();
        } else {
            u890.C("controllerFactory");
            throw null;
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x2y x2yVar = new x2y((bhm0) Y0().a());
        Y0().c(x2yVar);
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(apo.j(1342363302, new q081(x2yVar, this, (byte) 7), true));
        return composeView;
    }

    public final void z0() {
        Y0().disconnect();
        ((zf30) this).h1 = true;
    }
}
