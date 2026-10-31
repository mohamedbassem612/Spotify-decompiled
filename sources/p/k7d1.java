package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k7d1 extends e711 {
    public static final /* synthetic */ int h1 = 0;
    public final Observable U0;
    public final txo V0;
    public final u601 W0;
    public final llm X0;
    public final ConstraintLayout Y0;
    public final ViewGroup Z0;
    public final hrr0 a1;
    public c6d1 b1;
    public final b6d1 c1;
    public final hrr0 d1;
    public final idd1 e1;
    public final idd1 f1;
    public final AdsOverlayControlsLayout g1;

    public k7d1(ViewGroup viewGroup, Observable observable, txo txoVar, u601 u601Var, wx8 wx8Var) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        eqq.t(-1, -1, constraintLayout);
        super(constraintLayout);
        this.U0 = observable;
        this.V0 = txoVar;
        this.W0 = u601Var;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        j0d1 j0d1VarB = guo1.B();
        bs50Var.getClass();
        this.X0 = smo1.e(flo1.l(bs50Var, j0d1VarB));
        this.Y0 = constraintLayout;
        ViewGroup viewGroupP = mgo1.p(viewGroup);
        this.Z0 = viewGroupP;
        this.a1 = v8r.q((Object) null);
        this.c1 = new b6d1(new k7b1(1, wx8Var, ux8.class, "skipTrack", "skipTrack(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 8));
        this.d1 = v8r.q((Object) null);
        this.e1 = new idd1(new j7d1(this, (byte) 0));
        this.f1 = new idd1(new j7d1(this, (byte) 1));
        this.g1 = (AdsOverlayControlsLayout) b8k1.n(viewGroupP, 2131430262);
    }

    public final void E(int i, Object obj) {
        llm llmVar = this.X0;
        op71.q(llmVar.a, (CancellationException) null);
        fn31.T(llmVar, (o8n) null, 0, new xba1(this, (lnm) null, (byte) 19), 3);
        ViewGroup viewGroup = this.Z0;
        View viewN = b8k1.n(viewGroup, 2131427919);
        View viewN2 = b8k1.n(viewGroup, 2131427918);
        idd1 idd1Var = this.e1;
        ComposeView composeView = (ComposeView) idd1Var.getValue();
        boolean z = this.W0.getValue() instanceof ck7;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        int dimensionPixelSize = composeView.getResources().getDimensionPixelSize(2131167109);
        int dimensionPixelSize2 = composeView.getResources().getDimensionPixelSize(2131167110);
        int dimensionPixelSize3 = composeView.getResources().getDimensionPixelSize(2131167108);
        int top = (viewN2.getTop() - viewN.getBottom()) - (dimensionPixelSize2 + dimensionPixelSize3);
        int i2 = width - (dimensionPixelSize * 2);
        int bottom = (z ? viewN.getBottom() : viewN.getBottom()) + dimensionPixelSize2;
        boolean z2 = width > height;
        boolean z3 = ((double) i2) > ((double) width) * 0.4d;
        if (z2 || z3) {
            qhl qhlVar = (qhl) composeView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) qhlVar).height = top;
            ((ViewGroup.MarginLayoutParams) qhlVar).width = i2;
            qhlVar.setMargins(dimensionPixelSize, bottom, dimensionPixelSize, dimensionPixelSize3);
            composeView.setLayoutParams(qhlVar);
        }
        Flowable<nwq0> overlayState = this.g1.getOverlayState();
        vbm[] vbmVarArr = q601.a;
        l4p1.u(llmVar, new fu20(new kge(overlayState), new kwb1(this, (lnm) null, (byte) 4), (byte) 1));
        ((ComposeView) idd1Var.getValue()).setOnClickListener(d37.Z);
    }

    public final void H() {
        op71.q(this.X0.a, (CancellationException) null);
    }

    public final void I() {
        c6d1 c6d1Var = this.b1;
        if (c6d1Var != null) {
            this.Y0.setBackgroundResource(c6d1Var.a.a);
        }
    }
}
