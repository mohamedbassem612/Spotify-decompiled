package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tij1 extends e711 implements xyd, wes0 {
    public static final /* synthetic */ int k1 = 0;
    public final Observable U0;
    public final c3s V0;
    public final w2k1 W0;
    public final gw70 X0;
    public final Scheduler Y0;
    public final boolean Z0;
    public final iac0 a1;
    public final sn4 b1;
    public final VideoSurfaceView c1;
    public final ViewGroup d1;
    public final ImageView e1;
    public final View f1;
    public final rku g1;
    public final dtw h1;
    public final rjd i1;
    public iac0 j1;

    /* JADX WARN: Illegal instructions before constructor call */
    public tij1(Observable observable, c3s c3sVar, w2k1 w2k1Var, gw70 gw70Var, Scheduler scheduler, qlb qlbVar, boolean z, iac0 iac0Var, sn4 sn4Var, ViewGroup viewGroup) {
        View viewF = e711.F(2131626300, viewGroup);
        super(viewF);
        this.U0 = observable;
        this.V0 = c3sVar;
        this.W0 = w2k1Var;
        this.X0 = gw70Var;
        this.Y0 = scheduler;
        this.Z0 = z;
        this.a1 = iac0Var;
        this.b1 = sn4Var;
        VideoSurfaceView videoSurfaceViewFindViewById = viewF.findViewById(2131431606);
        videoSurfaceViewFindViewById.setPriority(y2k1.b);
        videoSurfaceViewFindViewById.setConfiguration(dlm.d);
        this.c1 = videoSurfaceViewFindViewById;
        ViewGroup viewGroup2 = (ViewGroup) viewF.findViewById(2131428203);
        this.d1 = viewGroup2;
        ImageView imageView = (ImageView) viewF.findViewById(2131429612);
        this.e1 = imageView;
        this.f1 = viewF.findViewById(2131430319);
        this.g1 = new rku();
        rjd rjdVar = new rjd(this, (byte) 9);
        this.i1 = rjdVar;
        if (z) {
            qtw qtwVarA = f6o1.A(qlbVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            i3k1 i3k1Var = new i3k1((String) null, 3);
            tka0 tka0Var = dtw.C;
            dtw dtwVarB = mhc.b(viewGroup2.getContext(), viewGroup2, qtwVarA, i3k1Var, (ipb1) null, 112);
            View view = dtwVarB.w;
            k8p1.o(viewGroup2.findViewById(2131431608), view);
            imageView.setVisibility(8);
            view.setVisibility(8);
            this.h1 = dtwVarB;
        }
        if (sn4Var.f()) {
            return;
        }
        this.j1 = iac0Var;
        iac0Var.getLifecycle().a(rjdVar);
    }

    public final void E(int i, Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        String strR = l4o1.r(contextTrack);
        ImageView imageView = this.e1;
        if (strR == null) {
            imageView.setImageResource(2131233988);
        } else {
            ixg ixgVarF = this.X0.f(strR);
            ixgVarF.l(2131233988);
            ixgVarF.k(imageView, (ird1) null);
        }
        dtw dtwVar = this.h1;
        if (dtwVar != null) {
            dtwVar.f(new i3k1(contextTrack.uri(), 2));
        }
        String str = (String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_CONTEXT_URI);
        b3k1 b3k1Var = (str == null || !ihc1.h0(str, "spotify:user:spotify:playlist:37i9dQZF1DWVhx3Jw2ZqKI", false)) ? b3k1.c : b3k1.b;
        VideoSurfaceView videoSurfaceView = this.c1;
        videoSurfaceView.setScaleType(b3k1Var);
        videoSurfaceView.setPlayablePredicate(new ilh1(contextTrack, this, (byte) 9));
        c();
    }

    public final void G() {
        boolean zF = this.b1.f();
        View view = ((w611) this).a;
        if (zF && this.j1 == null) {
            iac0 iac0VarH = x9p1.h(view);
            if (iac0VarH == null) {
                n57.e("Carousel holder attached without a view-tree LifecycleOwner");
                iac0VarH = this.a1;
            }
            if (iac0VarH.getLifecycle().b() != w8c0.a) {
                this.j1 = iac0VarH;
                iac0VarH.getLifecycle().a(this.i1);
            }
        }
        this.W0.a(this.c1);
        ((yyd) view.getTag(2131430298)).d = this;
    }

    public final void H() {
        VideoSurfaceView videoSurfaceView = this.c1;
        videoSurfaceView.setVideoSurfaceCallback((s2k1) null);
        this.W0.f(videoSurfaceView);
        ((yyd) ((w611) this).a.getTag(2131430298)).d = null;
    }

    public final void I() {
        VideoSurfaceView videoSurfaceView = this.c1;
        videoSurfaceView.setVideoSurfaceCallback((s2k1) null);
        this.W0.f(videoSurfaceView);
        ((yyd) ((w611) this).a.getTag(2131430298)).d = null;
    }

    public final void c() {
        ViewGroup viewGroup = this.d1;
        int visibility = viewGroup.getVisibility();
        View view = this.f1;
        if (visibility == 0) {
            view.setVisibility(4);
        } else {
            xap1.p(view, viewGroup);
        }
    }

    public final void d() {
        this.d1.setVisibility(4);
        this.f1.setVisibility(0);
    }

    public final void f() {
        VideoSurfaceView videoSurfaceView = this.c1;
        ezb1 ezb1Var = videoSurfaceView.T0;
        if (ezb1Var != null) {
            ezb1Var.j(videoSurfaceView);
        }
    }
}
