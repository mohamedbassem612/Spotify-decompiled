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
public final class auk extends zf30 implements lir0 {
    public final lpd F1;
    public kg0 G1;
    public juk H1;
    public i8h1 I1;
    public r1m0 J1;
    public mir0 K1;
    public fmy0 L1;
    public zwz0 M1;
    public iuk N1;

    public auk(lpd lpdVar) {
        this.F1 = lpdVar;
    }

    @Override // p.lir0
    public final mir0 c() {
        mir0 mir0Var = this.K1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        fmy0 fmy0Var = this.L1;
        if (fmy0Var == null) {
            u890.C("psesApi");
            throw null;
        }
        zwz0 zwz0Var = this.M1;
        if (zwz0Var == null) {
            u890.C("reachabilityMonitor");
            throw null;
        }
        juk jukVar = this.H1;
        if (jukVar != null) {
            this.N1 = new hck1(this, new euk(fmy0Var, zwz0Var, jukVar)).a(iuk.class);
        } else {
            u890.C("configurationLoadingTracking");
            throw null;
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(apo.j(546645603, new ztk(this, (byte) 1), true));
        return composeView;
    }
}
