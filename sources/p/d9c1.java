package p;

import android.net.Uri;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d9c1 implements c0u0 {
    public final woa a;
    public final kma b;
    public final iac0 c;
    public final ek2 d = new ek2(this, (byte) 21);
    public CircularVideoPreviewView e;
    public uoa f;
    public String g;

    public d9c1(woa woaVar, v290 v290Var, kma kmaVar, iac0 iac0Var) {
        this.a = woaVar;
        this.b = kmaVar;
        this.c = iac0Var;
    }

    public final void a() {
        String strN = this.g;
        if (strN == null) {
            return;
        }
        if (!Uri.parse(strN).isAbsolute()) {
            Logger.k("StoryPreviewContentHandler: passed a manifest, prefer URLs", new Object[0]);
            strN = wqn1.n(strN);
        }
        o2u0 o2u0Var = new o2u0(strN, 12, (Map) null);
        CircularVideoPreviewView circularVideoPreviewView = this.e;
        circularVideoPreviewView.getClass();
        VideoSurfaceView videoSurfaceViewN = b8k1.n(circularVideoPreviewView.getContentView(), 2131431099);
        videoSurfaceViewN.setVideoSurfaceCallback(new o2b1(this, (byte) 4));
        w2k1 w2k1Var = new w2k1();
        w2k1Var.a(videoSurfaceViewN);
        uoa uoaVarA = woa.a(this.a, "story-preview-content-handler", o2u0Var, w2k1Var, this.b, Collections.singletonList(new cv7(this, (byte) 7)), false, (bas) null, (sn10) null, 960);
        uoaVarA.p(2);
        uoaVarA.q(true);
        this.f = uoaVarA;
        uoaVarA.g(o2u0Var);
    }

    public final void m(long j, long j2) {
        CircularVideoPreviewView circularVideoPreviewView = this.e;
        if (circularVideoPreviewView != null) {
            View view = circularVideoPreviewView.d;
            if (view == null) {
                u890.C("contentView");
                throw null;
            }
            if (view.getVisibility() == 0) {
                return;
            }
            View view2 = circularVideoPreviewView.d;
            if (view2 == null) {
                u890.C("contentView");
                throw null;
            }
            view2.setAlpha(0.0f);
            View view3 = circularVideoPreviewView.d;
            if (view3 == null) {
                u890.C("contentView");
                throw null;
            }
            view3.setVisibility(0);
            View view4 = circularVideoPreviewView.d;
            if (view4 != null) {
                view4.animate().setDuration(300L).alpha(1.0f).withEndAction(new s10(circularVideoPreviewView, (byte) 20));
            } else {
                u890.C("contentView");
                throw null;
            }
        }
    }

    public final void q() {
        uoa uoaVar = this.f;
        if (uoaVar != null) {
            uoaVar.u();
            this.a.c(uoaVar);
            uoaVar.i();
            this.f = null;
        }
    }
}
