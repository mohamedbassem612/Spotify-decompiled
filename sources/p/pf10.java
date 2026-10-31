package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pf10 extends zf30 {
    public final nay F1;
    public sf10 G1;
    public kp00 H1;
    public t7y I1;
    public kg0 J1;
    public wnh1 K1;
    public g7h1 L1;
    public View M1;
    public final hrr0 N1 = xto.t((Object) null);

    public pf10(nay nayVar) {
        this.F1 = nayVar;
    }

    public final void D0() {
        wnh1 wnh1Var = this.K1;
        if (wnh1Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        wnh1.H(wnh1Var);
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        wnh1 wnh1Var = this.K1;
        if (wnh1Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        wnh1Var.F();
        if (((zf30) this).f != null ? O0().getBoolean("popOnReturn") : false) {
            kg0 kg0Var = this.J1;
            if (kg0Var != null) {
                kg0Var.a(true);
            } else {
                u890.C("zeroNavigator");
                throw null;
            }
        }
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        wnh1 wnh1Var = this.K1;
        if (wnh1Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        wnh1Var.G();
        sf10 sf10Var = this.G1;
        if (sf10Var != null) {
            sf10Var.b(this);
        } else {
            u890.C("presenter");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(apo.j(2124425132, new hzw(this, (byte) 23), true));
        ((ViewGroup) view).addView(composeView);
        t7y t7yVar = this.I1;
        if (t7yVar == null) {
            u890.C("facebookSdkWrapper");
            throw null;
        }
        sf10 sf10Var = this.G1;
        if (sf10Var == null) {
            u890.C("presenter");
            throw null;
        }
        t7yVar.u(sf10Var);
        if (bundle == null) {
            if (((zf30) this).f != null ? O0().getBoolean("popOnReturn") : false) {
                return;
            }
            Y0();
            t7y t7yVar2 = this.I1;
            if (t7yVar2 != null) {
                t7yVar2.s(this);
            } else {
                u890.C("facebookSdkWrapper");
                throw null;
            }
        }
    }

    public final void Y0() {
        Bundle bundle = ((zf30) this).f;
        Serializable serializable = bundle != null ? bundle.getSerializable("ARG_INTERACTION_LOGGING_RESULT") : null;
        tv80 tv80Var = serializable instanceof tv80 ? (tv80) serializable : null;
        g7h1 g7h1Var = this.L1;
        if (g7h1Var == null) {
            u890.C("externalActivityFlowTracker");
            throw null;
        }
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        g7h1.b(g7h1Var, yon1.z1(), tv80Var, 2);
    }

    public final void Z0() {
        if (f0() == null || !q0()) {
            return;
        }
        this.N1.setValue(new j0f0(l0(2131955886), l0(2131955885), (hux) null, new h0f0(l0(R.string.ok), new of10(this, (byte) 4)), (h0f0) null, (i3u) null, new of10(this, (byte) 5), new of10(this, (byte) 6), 52));
    }

    public final void u0(int i, int i2, Intent intent) {
        super.u0(i, i2, intent);
        t7y t7yVar = this.I1;
        if (t7yVar != null) {
            t7yVar.q(i, i2, intent);
        } else {
            u890.C("facebookSdkWrapper");
            throw null;
        }
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131624633, viewGroup, false);
        this.M1 = viewInflate.findViewById(2131429850);
        return viewInflate;
    }
}
