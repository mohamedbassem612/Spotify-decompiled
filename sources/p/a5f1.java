package p;

import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a5f1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public a5f1(View view, h5f1 h5f1Var, mmr0 mmr0Var, Format.Tooltip tooltip, View view2) {
        this.b = view;
        this.d = h5f1Var;
        this.e = mmr0Var;
        this.f = tooltip;
        this.c = view2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i;
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                h5f1 h5f1Var = (h5f1) obj3;
                dg30 dg30Var = h5f1Var.a;
                mmr0 mmr0Var = (mmr0) obj2;
                String requestId = ((MessageResponseToken) mmr0Var.a).getRequestId();
                oh31 oh31Var = new oh31();
                int i2 = z4f1.a[((Format.Tooltip) obj).getTooltipDirection().ordinal()];
                if (i2 == 1) {
                    i = 1;
                } else if (i2 != 2) {
                    i = 3;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            eg.o();
                        } else {
                            i = 4;
                        }
                    }
                } else {
                    i = 2;
                }
                oh31Var.e = i;
                oh31Var.c = new b5f1(mmr0Var, h5f1Var);
                oh31Var.d = new c5f1(mmr0Var, h5f1Var);
                ComposeView composeView = new ComposeView(h5f1Var.a, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setViewCompositionStrategy(p5x0.W0);
                op80 jp80Var = new jp80(new it1(composeView, (byte) 4));
                op80 eq80Var = new eq80(new e3h1(h5f1Var.j, (n7h1) null, h5f1Var.i));
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
                composeView.setContent(new j2i(629604074, new f5f1(mmr0Var, h5f1Var), true));
                oh31Var.h = composeView;
                x4f1.a(h5f1Var.k, t2b.e(dg30Var, requestId, oh31Var), (View) obj4, new d5f1(h5f1Var, (byte) 2), new g5f1(mmr0Var, h5f1Var), 4);
                break;
            default:
                x8j1 x8j1Var = (x8j1) obj4;
                vi11 vi11Var = x8j1Var.d;
                iac0 iac0Var = x8j1Var.e;
                yir yirVar = (yir) obj3;
                vi11Var.T(cto1.q(iac0Var), (VideoSurfaceView) ((h72) yirVar.c).Y, true);
                fn31.T(cto1.q(iac0Var), x8j1Var.a, 0, new z0i1((byte) 2, x8j1Var, (n2o) obj2, this, yirVar, (iu30) obj, (lnm) null), 2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                x8j1 x8j1Var = (x8j1) this.c;
                fn31.T(cto1.q(x8j1Var.e), x8j1Var.a, 0, new w621((n2o) this.e, this, null, (byte) 23), 2);
                break;
        }
    }

    public a5f1(x8j1 x8j1Var, yir yirVar, n2o n2oVar, iu30 iu30Var) {
        this.c = x8j1Var;
        this.d = yirVar;
        this.e = n2oVar;
        this.f = iu30Var;
    }

    private final void a(View view) {
    }
}
