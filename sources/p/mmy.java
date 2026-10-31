package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mmy extends ConstraintLayout implements tlv {
    public final lqr T0;
    public iu30 U0;
    public final q4u V0;

    public mmy(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(2131624592, this);
        lqr lqrVar = new lqr(this, (byte) 27);
        getRootView().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.T0 = lqrVar;
        this.V0 = nln.w(new q4u[]{nln.x(imy.b, nln.v(new gcy(this, (byte) 18))), nln.x(jmy.b, nln.v(new kmy(this))), nln.x(lmy.b, nln.v(new gcy(this, (byte) 19)))});
    }

    @Override // p.mi90
    public final void f(Object obj) {
        this.V0.a((yly) obj);
    }

    @Override // p.mi90
    public final void n(iu30 iu30Var) {
        iu30 iu30Var2;
        this.U0 = iu30Var;
        lqr lqrVar = this.T0;
        lqrVar.f().n(new v2y(iu30Var, (byte) 11));
        View viewH = lqrVar.h();
        PreviewOverlayView previewOverlayView = viewH instanceof PreviewOverlayView ? (PreviewOverlayView) viewH : null;
        if (previewOverlayView == null || (iu30Var2 = this.U0) == null) {
            return;
        }
        previewOverlayView.n(new w3w(iu30Var2, this, (byte) 21));
    }

    public final void setViewContext(f47 f47Var) {
        this.T0.f().setViewContext(f47Var);
    }
}
