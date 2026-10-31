package p;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nz2 implements m4p0, iac0 {
    public final h72 N0;
    public final u961 O0;
    public final FlowableMap P0;
    public final oj80 Q0;
    public final ev4 R0;
    public final kp5 S0;
    public final uy2 T0;
    public final ynb0 U0;
    public final ynb0 V0;
    public final fbm X;
    public final mr20 X0;
    public final eyh0 Y;
    public final ynb0 Z;
    public u961 Z0;
    public final q2p0 a;
    public ScrollCardsContainer a1;
    public final i8h1 b;
    public pgr b1;
    public final l6h1 c;
    public xab1 c1;
    public final n7h1 d;
    public final xfx e;
    public final cce f;
    public final sp00 g;
    public final v1k h;
    public final v1k i;
    public final FlowableObserveOn t;
    public final tac0 W0 = new tac0(this, true);
    public final es41 Y0 = new es41(0);
    public final idd1 d1 = new idd1(new lz2(this, (byte) 1));
    public final idd1 e1 = new idd1(new lz2(this, (byte) 0));

    public nz2(q2p0 q2p0Var, i8h1 i8h1Var, l6h1 l6h1Var, n7h1 n7h1Var, iz2 iz2Var, xfx xfxVar, cce cceVar, sp00 sp00Var, v1k v1kVar, v1k v1kVar2, FlowableObserveOn flowableObserveOn, fbm fbmVar, eyh0 eyh0Var, ynb0 ynb0Var, h72 h72Var, u961 u961Var, FlowableMap flowableMap, oj80 oj80Var, ev4 ev4Var, kp5 kp5Var, uy2 uy2Var, ynb0 ynb0Var2, ynb0 ynb0Var3) {
        this.a = q2p0Var;
        this.b = i8h1Var;
        this.c = l6h1Var;
        this.d = n7h1Var;
        this.e = xfxVar;
        this.f = cceVar;
        this.g = sp00Var;
        this.h = v1kVar;
        this.i = v1kVar2;
        this.t = flowableObserveOn;
        this.X = fbmVar;
        this.Y = eyh0Var;
        this.Z = ynb0Var;
        this.N0 = h72Var;
        this.O0 = u961Var;
        this.P0 = flowableMap;
        this.Q0 = oj80Var;
        this.R0 = ev4Var;
        this.S0 = kp5Var;
        this.T0 = uy2Var;
        this.U0 = ynb0Var2;
        this.V0 = ynb0Var3;
        this.X0 = rqt0.u(iz2Var.b);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        u9c0 u9c0VarQ = cto1.q(this);
        u961 u961Var = new u961();
        u961Var.a = this.Y0;
        u961Var.b = u9c0VarQ;
        u961Var.c = gio1.b(new gr41(0, 0));
        this.Z0 = u961Var;
        ScrollCardsContainer scrollCardsContainer = new ScrollCardsContainer(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        scrollCardsContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        xhk1.c(scrollCardsContainer, new h3h1(new jz2(this, (byte) 0)));
        this.a1 = scrollCardsContainer;
        ComposeView composeView = new ComposeView(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        rm5 rm5Var = new rm5(new jm1(composeView, (byte) 17), (byte) 13);
        float f = composeView.getResources().getDisplayMetrics().density;
        pgr pgrVar = new pgr(rm5Var, false);
        composeView.addOnLayoutChangeListener(new oz2(rm5Var, pgrVar, f));
        this.b1 = pgrVar;
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        x9p1.p(composeView, this);
        composeView.setViewCompositionStrategy(p5x0.W0);
        jp80 jp80Var = new jp80(composeView);
        i8h1 i8h1Var = this.b;
        xhk1.c(composeView, j6p1.k(j6p1.k(jp80Var, new eq80(new e3h1(this.c, this.d, i8h1Var))), new h3h1(new jz2(this, (byte) 1))));
        composeView.setContent(new j2i(313199227, new xb2(this, (byte) 7), true));
        this.W0.i(w8c0.b);
        return composeView;
    }

    public final void destroy() {
        this.W0.i(w8c0.a);
    }

    public final x8c0 getLifecycle() {
        return this.W0;
    }

    public final void start() {
        this.W0.i(w8c0.e);
        u961 u961Var = this.Z0;
        if (u961Var == null) {
            u890.C("scrollBinder");
            throw null;
        }
        xab1 xab1Var = (xab1) u961Var.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        u961Var.d = fn31.T((u9c0) u961Var.b, (o8n) null, 0, new a03(u961Var, null, (byte) 1), 3);
        i6p0 i6p0Var = (i6p0) this.U0.get();
        j6p0 j6p0Var = this.Z0;
        if (j6p0Var == null) {
            u890.C("scrollBinder");
            throw null;
        }
        ScrollCardsContainer scrollCardsContainer = this.a1;
        if (scrollCardsContainer == null) {
            u890.C("scrollCardsContainer");
            throw null;
        }
        tl7 tl7Var = this.b1;
        if (tl7Var == null) {
            u890.C("attentionTracker");
            throw null;
        }
        ((kyo0) i6p0Var).d(j6p0Var, scrollCardsContainer, tl7Var, ((z4p0) this.e1.getValue()).f, false);
        ScrollCardsContainer scrollCardsContainer2 = this.a1;
        if (scrollCardsContainer2 == null) {
            u890.C("scrollCardsContainer");
            throw null;
        }
        float f = scrollCardsContainer2.getResources().getDisplayMetrics().density;
        xab1 xab1Var2 = this.c1;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.c1 = fn31.T(cto1.q(this), (o8n) null, 0, new mz2(this, f, null, (byte) 0), 3);
        ((tqq0) this.d1.getValue()).a();
    }

    public final void stop() {
        this.W0.i(w8c0.c);
        ((tqq0) this.d1.getValue()).b();
        xab1 xab1Var = this.c1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        ((kyo0) ((i6p0) this.U0.get())).e();
        u961 u961Var = this.Z0;
        if (u961Var == null) {
            u890.C("scrollBinder");
            throw null;
        }
        xab1 xab1Var2 = (xab1) u961Var.d;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        u961Var.d = null;
    }
}
