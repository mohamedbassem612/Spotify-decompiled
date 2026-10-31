package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uj81 extends zf30 implements lir0 {
    public final jf11 F1;
    public gw70 G1;
    public cd71 H1;
    public kg0 I1;
    public a1g J1;
    public uur0 K1;
    public mir0 L1;
    public z710 M1;
    public wj81 N1;
    public faa0 O1;

    public uj81(jf11 jf11Var) {
        this.F1 = jf11Var;
    }

    public final void D0() {
        uur0 uur0Var = this.K1;
        if (uur0Var == null) {
            u890.C("poller");
            throw null;
        }
        uur0Var.b();
        faa0 faa0Var = this.O1;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.O1 = null;
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        a1g a1gVar = this.J1;
        if (a1gVar == null) {
            u890.C("sessionManager");
            throw null;
        }
        if (a1gVar.b() != null) {
            this.O1 = c921.y(cto1.q(this), (o8n) null, 0, new b751(this, (lnm) null, (byte) 21), 3);
            return;
        }
        kg0 kg0Var = this.I1;
        if (kg0Var != null) {
            kg0Var.d(zjt.a, true);
        } else {
            u890.C("zeroNavigator");
            throw null;
        }
    }

    @Override // p.lir0
    public final mir0 c() {
        mir0 mir0Var = this.L1;
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

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(apo.j(1576883235, new tj81(this, (byte) 2), true));
        return composeView;
    }
}
