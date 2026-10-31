package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class epn0 extends zf30 {
    public final m6k0 F1;
    public gpn0 G1;
    public rok0 H1;
    public wnh1 I1;
    public Disposable J1;

    public epn0(m6k0 m6k0Var) {
        this.F1 = m6k0Var;
    }

    public final void D0() {
        wnh1 wnh1Var = this.I1;
        if (wnh1Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        wnh1.H(wnh1Var);
        ((zf30) this).h1 = true;
        Y0().o();
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        wnh1 wnh1Var = this.I1;
        if (wnh1Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        wnh1Var.F();
        if (Y0().j()) {
            Y0().u();
            Z0().c();
        }
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        wnh1 wnh1Var = this.I1;
        if (wnh1Var != null) {
            wnh1Var.G();
        } else {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        this.J1 = Y0().p().subscribe((Consumer) new lrj0(this, (byte) 10));
        if (bundle == null) {
            Y0().l();
        }
    }

    public final rok0 Y0() {
        rok0 rok0Var = this.H1;
        if (rok0Var != null) {
            return rok0Var;
        }
        u890.C("naverLoginApi");
        throw null;
    }

    public final gpn0 Z0() {
        gpn0 gpn0Var = this.G1;
        if (gpn0Var != null) {
            return gpn0Var;
        }
        u890.C("presenter");
        throw null;
    }

    public final void a1(zpn1 zpn1Var) {
        if (zpn1Var instanceof ipn0) {
            Z0().b(((ipn0) zpn1Var).z());
        } else if (!(zpn1Var instanceof hpn0)) {
            eg.o();
        } else {
            hpn0 hpn0Var = (hpn0) zpn1Var;
            Z0().a(hpn0Var.z(), hpn0Var.A());
        }
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(apo.j(1452435776, new fhk0(this, (byte) 17), true));
        return composeView;
    }

    public final void z0() {
        Disposable disposable = this.J1;
        if (disposable != null) {
            disposable.dispose();
        }
        this.J1 = null;
        ((zf30) this).h1 = true;
    }
}
