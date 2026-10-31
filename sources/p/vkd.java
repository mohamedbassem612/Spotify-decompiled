package p;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vkd extends e711 implements wes0 {
    public static final /* synthetic */ int z1 = 0;
    public final v290 U0;
    public final l7m0 V0;
    public final kma W0;
    public final woa X0;
    public final ii9 Y0;
    public final ne Z0;
    public final gw70 a1;
    public final i6b b1;
    public final iac0 c1;
    public final g26 d1;
    public final mr20 e1;
    public final y3o0 f1;
    public final Set g1;
    public final VideoSurfaceView h1;
    public final View i1;
    public final ImageView j1;
    public final View k1;
    public uoa l1;
    public boolean m1;
    public final rkd n1;
    public ContextTrack o1;
    public boolean p1;
    public final Handler q1;
    public volatile int r1;
    public xab1 s1;
    public iac0 t1;
    public final idd1 u1;
    public ikd v1;
    public final tkd w1;
    public final String x1;
    public final ju8 y1;

    /* JADX WARN: Illegal instructions before constructor call */
    public vkd(v290 v290Var, l7m0 l7m0Var, kma kmaVar, woa woaVar, ii9 ii9Var, ne neVar, gw70 gw70Var, i6b i6bVar, iac0 iac0Var, g26 g26Var, ViewGroup viewGroup, mr20 mr20Var, y3o0 y3o0Var) {
        View viewF = e711.F(2131624310, viewGroup);
        super(viewF);
        this.U0 = v290Var;
        this.V0 = l7m0Var;
        this.W0 = kmaVar;
        this.X0 = woaVar;
        this.Y0 = ii9Var;
        this.Z0 = neVar;
        this.a1 = gw70Var;
        this.b1 = i6bVar;
        this.c1 = iac0Var;
        this.d1 = g26Var;
        this.e1 = mr20Var;
        this.f1 = y3o0Var;
        this.g1 = f46.S0(new sid[]{sid.c, sid.d});
        VideoSurfaceView videoSurfaceViewFindViewById = viewF.findViewById(2131431606);
        this.h1 = videoSurfaceViewFindViewById;
        this.i1 = viewF.findViewById(2131430319);
        this.j1 = (ImageView) viewF.findViewById(2131429612);
        this.k1 = viewF.findViewById(2131429987);
        this.m1 = true;
        this.n1 = new rkd(this, (byte) 0);
        this.q1 = new Handler(Looper.getMainLooper());
        this.u1 = new idd1(new ptb(this, (byte) 15));
        this.w1 = new tkd(this, neVar, (byte) 0);
        this.x1 = UUID.randomUUID().toString();
        boolean zA = iac0Var.getLifecycle().b().a(w8c0.e);
        boolean zIsAttachedToWindow = viewF.isAttachedToWindow();
        ju8 ju8Var = new ju8();
        ju8Var.a = zA;
        ju8Var.b = zIsAttachedToWindow;
        this.y1 = ju8Var;
        videoSurfaceViewFindViewById.setVisibility(8);
        videoSurfaceViewFindViewById.setScaleType(b3k1.c);
        if (g26Var.h()) {
            videoSurfaceViewFindViewById.setOnFirstFrameRendered(new q01(0, this, vkd.class, "onFirstFrameRendered", "onFirstFrameRendered()V", 0, (byte) 26));
        }
        if (g26Var.j()) {
            return;
        }
        L(iac0Var);
    }

    public final void E(int i, Object obj) {
        Drawable drawable;
        ContextTrack contextTrack = (ContextTrack) obj;
        String strR = l4o1.r(contextTrack);
        if (this.d1.k()) {
            drawable = (ColorDrawable) this.u1.getValue();
        } else {
            drawable = ((w611) this).a.getContext().getDrawable(2131231274);
            drawable.getClass();
        }
        ImageView imageView = this.j1;
        if (strR == null) {
            imageView.setImageDrawable(drawable);
        } else {
            ixg ixgVarF = this.a1.f(strR);
            ixgVarF.m(drawable);
            ixgVarF.k(imageView, (ird1) null);
        }
        this.o1 = contextTrack;
        if (this.c1.getLifecycle().b().a(w8c0.c)) {
            N(contextTrack);
        }
        this.f1.invoke(new kdn(true, contextTrack.uri()));
    }

    public final void G() {
        g26 g26Var = this.d1;
        boolean zJ = g26Var.j();
        View view = ((w611) this).a;
        if (zJ && this.t1 == null) {
            iac0 iac0VarH = x9p1.h(view);
            if (iac0VarH == null) {
                n57.e("Carousel holder attached without a view-tree LifecycleOwner");
                iac0VarH = this.c1;
            }
            if (iac0VarH.getLifecycle().b() != w8c0.a) {
                L(iac0VarH);
            }
        }
        this.y1.b = true;
        uoa uoaVar = this.l1;
        if (uoaVar != null) {
            uoaVar.d(this.h1);
        }
        M();
        if (g26Var.i()) {
            view.getViewTreeObserver().addOnPreDrawListener(this.n1);
            O();
            return;
        }
        this.m1 = true;
        uoa uoaVar2 = this.l1;
        if (uoaVar2 != null) {
            uoaVar2.l();
        }
    }

    public final void H() {
        this.r1++;
        this.y1.b = false;
        if (this.d1.i()) {
            ViewTreeObserver viewTreeObserver = ((w611) this).a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.n1);
            }
        }
        this.m1 = false;
        uoa uoaVar = this.l1;
        if (uoaVar != null) {
            uoaVar.f();
        }
        J();
        uoa uoaVar2 = this.l1;
        if (uoaVar2 != null) {
            uoaVar2.k(this.h1);
        }
        this.k1.animate().cancel();
    }

    public final void I() {
        g26 g26Var = this.d1;
        View view = this.k1;
        uoa uoaVar = this.l1;
        if (uoaVar != null) {
            uoaVar.u();
        }
        uoa uoaVar2 = this.l1;
        if (uoaVar2 != null) {
            this.X0.c(uoaVar2);
        }
        this.l1 = null;
        if (this.d1.h()) {
            this.r1++;
            this.p1 = false;
            J();
        }
        if (g26Var.k() || g26Var.h()) {
            this.j1.setVisibility(0);
            this.i1.setVisibility(4);
        }
        view.animate().cancel();
        view.setAlpha(0.0f);
        view.setVisibility(8);
    }

    public final void J() {
        this.h1.setVisibility(4);
    }

    public final void K(BetamaxException betamaxException) {
        String message;
        ikd ikdVar = this.v1;
        if (ikdVar == null) {
            u890.C("canvasTrack");
            throw null;
        }
        switch (betamaxException.a) {
            case ERROR_UNKNOWN:
                message = betamaxException.getMessage();
                break;
            case ERROR_GEORESTRICTED:
                message = "This content is georestricted";
                break;
            case ERROR_UNSUPPORTED_PLATFORM_VERSION:
                message = "This content is unsupported for platform version";
                break;
            case ERROR_UNSUPPORTED_CLIENT_VERSION:
                message = "This content is unsupported for client version";
                break;
            case ERROR_IN_OFFLINE_MODE:
                message = "There is no internet connection";
                break;
            case ERROR_MANIFEST_DELETED:
            default:
                message = "There is a error we didn't catch.";
                break;
            case ERROR_COUNTRY_RESTRICTED:
                message = "This content is country restricted";
                break;
            case ERROR_UNAVAILABLE:
                message = "The content is unavailable";
                break;
            case ERROR_CATALOGUE_RESTRICTED:
                message = "The catalogue is restricted";
                break;
            case ERROR_PLAYBACK_STUCK:
                message = "Video playback is stuck";
                break;
        }
        this.Y0.a(ikdVar, "failure", "CANVAS_VIDEO_PLAYBACK_ERROR", message);
        ikd ikdVar2 = this.v1;
        if (ikdVar2 == null) {
            u890.C("canvasTrack");
            throw null;
        }
        String str = ikdVar2.a;
        ne neVar = this.Z0;
        ((LinkedHashSet) neVar.b).remove(str);
        ((PublishSubject) neVar.c).onNext(new xjd(str, false));
    }

    public final void L(iac0 iac0Var) {
        this.t1 = iac0Var;
        if (this.d1.f() && this.e1 != null) {
            xab1 xab1Var = this.s1;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.s1 = fn31.T(zso1.H(iac0Var.getLifecycle()), (o8n) null, 0, new vk6(this, (lnm) null, (byte) 24), 3);
        }
        iac0Var.getLifecycle().a(this.w1);
    }

    public final void M() {
        if (this.i1.getVisibility() == 0) {
            return;
        }
        if (!this.d1.h() || this.p1) {
            xap1.s(this.h1);
        }
    }

    public final void N(ContextTrack contextTrack) {
        String strN;
        long jNextInt;
        ikd ikdVarE = this.V0.e(contextTrack);
        ikdVarE.getClass();
        this.v1 = ikdVarE;
        String str = ikdVarE.c;
        if (str == null || ihc1.y0(str)) {
            str = null;
        }
        if (str != null) {
            this.U0.getClass();
            strN = wqn1.n(str);
        } else {
            ikd ikdVar = this.v1;
            if (ikdVar == null) {
                u890.C("canvasTrack");
                throw null;
            }
            strN = ikdVar.b;
        }
        if (strN == null || ihc1.y0(strN)) {
            ii9 ii9Var = this.Y0;
            ikd ikdVar2 = this.v1;
            if (ikdVar2 != null) {
                ii9Var.a(ikdVar2, "failure", "CANVAS_VIDEO_PLAYBACK_ERROR", "Canvas video URL is null or blank");
                return;
            } else {
                u890.C("canvasTrack");
                throw null;
            }
        }
        o2u0 o2u0Var = new o2u0(strN, 6, Collections.singletonMap("itemId", this.x1));
        if (this.l1 == null) {
            uoa uoaVarA = woa.a(this.X0, "canvas-video", o2u0Var, (w2k1) null, this.W0, Collections.singletonList(new cv7(this, (byte) 2)), false, (bas) null, (sn10) null, 996);
            uoaVarA.p(2);
            this.l1 = uoaVarA;
        }
        if (this.d1.h()) {
            this.r1++;
            this.p1 = false;
            J();
        }
        uoa uoaVar = this.l1;
        if (uoaVar != null) {
            uoaVar.d(this.h1);
            i6b i6bVar = this.b1;
            ikd ikdVar3 = this.v1;
            if (ikdVar3 == null) {
                u890.C("canvasTrack");
                throw null;
            }
            if (ikdVar3.e == sid.d) {
                jNextInt = ((Random) i6bVar.b).nextInt(8000);
            } else {
                i6bVar.getClass();
                jNextInt = 0;
            }
            oot0 oot0Var = new oot0(jNextInt, 0L, true, false, (hu7) null, (tne1) null, false, 242);
            Set set = this.g1;
            ikd ikdVar4 = this.v1;
            if (ikdVar4 == null) {
                u890.C("canvasTrack");
                throw null;
            }
            uoaVar.q(set.contains(ikdVar4.e));
            uoaVar.h(o2u0Var, oot0Var);
            this.m1 = true;
        }
    }

    public final void O() {
        if (this.l1 == null) {
            return;
        }
        View view = ((w611) this).a;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && view.isLaidOut()) {
            boolean z = view.getRight() > 0 && view.getLeft() < viewGroup.getWidth();
            if (z == this.m1) {
                return;
            }
            if (z) {
                this.m1 = true;
                uoa uoaVar = this.l1;
                if (uoaVar != null) {
                    uoaVar.l();
                    return;
                }
                return;
            }
            this.m1 = false;
            uoa uoaVar2 = this.l1;
            if (uoaVar2 != null) {
                uoaVar2.f();
            }
        }
    }

    public final void c() {
        ImageView imageView = this.j1;
        int visibility = imageView.getVisibility();
        View view = this.i1;
        if (visibility == 0) {
            view.setVisibility(4);
            return;
        }
        if (this.d1.h() && !this.p1) {
            imageView.setVisibility(0);
            view.setVisibility(4);
            return;
        }
        VideoSurfaceView videoSurfaceView = this.h1;
        if (videoSurfaceView.getVisibility() == 4 && view.getVisibility() == 0) {
            xap1.p(view, videoSurfaceView);
        }
    }

    public final void d() {
        this.j1.setVisibility(4);
        this.h1.setVisibility(4);
        this.i1.setVisibility(0);
    }
}
