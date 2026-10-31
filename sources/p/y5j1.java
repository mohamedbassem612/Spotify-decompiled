package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y5j1 extends e711 implements xyd, wes0 {
    public final Observable U0;
    public final w2k1 V0;
    public final gw70 W0;
    public final Scheduler X0;
    public final zm4 Y0;
    public final ViewGroup Z0;
    public final iac0 a1;
    public final VideoSurfaceView b1;
    public final View c1;
    public final ImageView d1;
    public final View e1;
    public final rku f1;
    public final rjd g1;
    public iac0 h1;

    /* JADX WARN: Illegal instructions before constructor call */
    public y5j1(Observable observable, w2k1 w2k1Var, gw70 gw70Var, Scheduler scheduler, zm4 zm4Var, ViewGroup viewGroup, iac0 iac0Var) {
        View viewF = e711.F(2131626300, viewGroup);
        super(viewF);
        this.U0 = observable;
        this.V0 = w2k1Var;
        this.W0 = gw70Var;
        this.X0 = scheduler;
        this.Y0 = zm4Var;
        this.Z0 = viewGroup;
        this.a1 = iac0Var;
        VideoSurfaceView videoSurfaceViewFindViewById = viewF.findViewById(2131431606);
        videoSurfaceViewFindViewById.setPriority(y2k1.c);
        videoSurfaceViewFindViewById.setConfiguration(dlm.g);
        this.b1 = videoSurfaceViewFindViewById;
        this.c1 = viewF.findViewById(2131428203);
        this.d1 = (ImageView) viewF.findViewById(2131429612);
        this.e1 = viewF.findViewById(2131430319);
        this.f1 = new rku();
        rjd rjdVar = new rjd(this, (byte) 8);
        this.g1 = rjdVar;
        if (zm4Var.f()) {
            return;
        }
        this.h1 = iac0Var;
        iac0Var.getLifecycle().a(rjdVar);
    }

    public final void E(int i, Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        String strR = l4o1.r(contextTrack);
        ImageView imageView = this.d1;
        if (strR == null) {
            imageView.setImageResource(2131233988);
        } else {
            ixg ixgVarF = this.W0.f(strR);
            ixgVarF.l(2131233988);
            ixgVarF.k(imageView, (ird1) null);
        }
        boolean zS = nhc1.S((String) contextTrack.metadata().get("ad.background_scale_type"), "fill", true);
        ViewGroup viewGroup = this.Z0;
        boolean z = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels > viewGroup.getContext().getResources().getDisplayMetrics().heightPixels;
        boolean zE = this.Y0.e();
        b3k1 b3k1Var = b3k1.b;
        if ((!zE || !z) && zS) {
            b3k1Var = b3k1.c;
        }
        VideoSurfaceView videoSurfaceView = this.b1;
        videoSurfaceView.setScaleType(b3k1Var);
        videoSurfaceView.setPlayablePredicate(new bih1(contextTrack, this, (byte) 7));
        c();
    }

    public final void G() {
        boolean zF = this.Y0.f();
        View view = ((w611) this).a;
        if (zF && this.h1 == null) {
            iac0 iac0VarH = x9p1.h(view);
            if (iac0VarH == null) {
                n57.e("Carousel holder attached without a view-tree LifecycleOwner");
                iac0VarH = this.a1;
            }
            if (iac0VarH.getLifecycle().b() != w8c0.a) {
                this.h1 = iac0VarH;
                iac0VarH.getLifecycle().a(this.g1);
            }
        }
        this.V0.a(this.b1);
        ((yyd) view.getTag(2131430298)).d = this;
    }

    public final void H() {
        VideoSurfaceView videoSurfaceView = this.b1;
        videoSurfaceView.setVideoSurfaceCallback((s2k1) null);
        this.V0.f(videoSurfaceView);
        ((yyd) ((w611) this).a.getTag(2131430298)).d = null;
    }

    public final void I() {
        VideoSurfaceView videoSurfaceView = this.b1;
        videoSurfaceView.setVideoSurfaceCallback((s2k1) null);
        this.V0.f(videoSurfaceView);
        ((yyd) ((w611) this).a.getTag(2131430298)).d = null;
    }

    public final void c() {
        View view = this.c1;
        int visibility = view.getVisibility();
        View view2 = this.e1;
        if (visibility == 0) {
            view2.setVisibility(4);
        } else {
            xap1.p(view2, view);
        }
    }

    public final void d() {
        this.c1.setVisibility(4);
        this.e1.setVisibility(0);
    }

    public final void f() {
        VideoSurfaceView videoSurfaceView = this.b1;
        ezb1 ezb1Var = videoSurfaceView.T0;
        if (ezb1Var != null) {
            ezb1Var.j(videoSurfaceView);
        }
    }
}
