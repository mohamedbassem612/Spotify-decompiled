package p;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sjd extends e711 implements wes0 {
    public static final /* synthetic */ int j1 = 0;
    public final l7m0 U0;
    public final gw70 V0;
    public final ii9 W0;
    public final ne X0;
    public final iac0 Y0;
    public final g26 Z0;
    public final mr20 a1;
    public final y3o0 b1;
    public final ImageView c1;
    public final idd1 d1;
    public final View e1;
    public final View f1;
    public final rjd g1;
    public xab1 h1;
    public iac0 i1;

    /* JADX WARN: Illegal instructions before constructor call */
    public sjd(l7m0 l7m0Var, gw70 gw70Var, ii9 ii9Var, ne neVar, iac0 iac0Var, g26 g26Var, ViewGroup viewGroup, mr20 mr20Var, y3o0 y3o0Var) {
        View viewF = e711.F(2131624309, viewGroup);
        super(viewF);
        this.U0 = l7m0Var;
        this.V0 = gw70Var;
        this.W0 = ii9Var;
        this.X0 = neVar;
        this.Y0 = iac0Var;
        this.Z0 = g26Var;
        this.a1 = mr20Var;
        this.b1 = y3o0Var;
        this.c1 = (ImageView) viewF.findViewById(2131429612);
        this.d1 = new idd1(new ptb(this, (byte) 14));
        this.e1 = viewF.findViewById(2131430319);
        this.f1 = viewF.findViewById(2131429987);
        this.g1 = new rjd(neVar, (byte) 0);
        if (g26Var.j()) {
            return;
        }
        J(iac0Var);
    }

    public final void E(int i, Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        ikd ikdVarE = this.U0.e(contextTrack);
        String strR = (String) contextTrack.metadata().get("canvas.url");
        if (strR == null) {
            strR = l4o1.r(contextTrack);
        }
        ColorDrawable colorDrawable = this.Z0.k() ? (ColorDrawable) this.d1.getValue() : null;
        byte b = 1;
        ImageView imageView = this.c1;
        if (strR != null) {
            ikdVarE.getClass();
            this.W0.a(ikdVarE, "downloading", (String) null, (String) null);
            ((PublishSubject) this.X0.c).onNext(new xjd(ikdVarE.a, false));
            ixg ixgVarF = this.V0.f(strR);
            if (colorDrawable != null) {
                ixgVarF.m(colorDrawable);
            } else {
                ixgVarF.l(2131231274);
            }
            ixgVarF.k(imageView, new cfd(this, ikdVarE, b));
        } else if (colorDrawable != null) {
            imageView.setImageDrawable(colorDrawable);
        } else {
            imageView.setImageResource(2131231274);
        }
        c();
        this.b1.invoke(new kdn(true, contextTrack.uri()));
    }

    public final void G() {
        if (this.Z0.j() && this.i1 == null) {
            iac0 iac0VarH = x9p1.h(((w611) this).a);
            if (iac0VarH == null) {
                n57.e("Carousel holder attached without a view-tree LifecycleOwner");
                iac0VarH = this.Y0;
            }
            if (iac0VarH.getLifecycle().b() != w8c0.a) {
                J(iac0VarH);
            }
        }
    }

    public final void H() {
        this.f1.animate().cancel();
    }

    public final void I() {
        View view = this.f1;
        view.animate().cancel();
        view.setAlpha(0.0f);
        view.setVisibility(8);
    }

    public final void J(iac0 iac0Var) {
        this.i1 = iac0Var;
        if (this.Z0.f() && this.a1 != null) {
            xab1 xab1Var = this.h1;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.h1 = fn31.T(zso1.H(iac0Var.getLifecycle()), (o8n) null, 0, new vk6(this, (lnm) null, (byte) 23), 3);
        }
        iac0Var.getLifecycle().a(this.g1);
    }

    public final void c() {
        ImageView imageView = this.c1;
        int visibility = imageView.getVisibility();
        View view = this.e1;
        if (visibility == 0) {
            view.setVisibility(4);
        } else {
            xap1.p(view, imageView);
        }
    }

    public final void d() {
        this.c1.setVisibility(4);
        this.e1.setVisibility(0);
    }
}
