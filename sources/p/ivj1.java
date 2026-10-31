package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ivj1 implements aac0 {
    public final woa a;
    public final kma b;
    public final iac0 c;
    public uoa d;
    public ths e;
    public o2u0 f;
    public VideoSurfaceView g;
    public Boolean h;

    public ivj1(woa woaVar, v290 v290Var, kma kmaVar, iac0 iac0Var) {
        this.a = woaVar;
        this.b = kmaVar;
        this.c = iac0Var;
    }

    public final uoa a(VideoSurfaceView videoSurfaceView, ths thsVar, o2u0 o2u0Var) {
        w2k1 w2k1Var = new w2k1();
        w2k1Var.a(videoSurfaceView);
        return woa.a(this.a, "prerelease-video-preview-content-handler", o2u0Var, w2k1Var, this.b, Collections.singletonList(new cv7(thsVar, (byte) 13)), false, (bas) null, (sn10) null, 960);
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        o2u0 o2u0Var;
        VideoSurfaceView videoSurfaceView;
        ths thsVar;
        Boolean bool;
        int i = hvj1.a[k8c0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.c.getLifecycle().d(this);
                return;
            } else {
                uoa uoaVar = this.d;
                if (uoaVar != null) {
                    this.a.c(uoaVar);
                    uoaVar.i();
                }
                this.d = null;
                return;
            }
        }
        uoa uoaVar2 = this.d;
        if (uoaVar2 == null && (o2u0Var = this.f) != null && (videoSurfaceView = this.g) != null && (thsVar = this.e) != null && (bool = this.h) != null) {
            boolean zBooleanValue = bool.booleanValue();
            uoa uoaVarA = a(videoSurfaceView, thsVar, o2u0Var);
            uoaVarA.o(zBooleanValue);
            uoaVarA.q(true);
            uoaVarA.g(o2u0Var);
            this.d = uoaVarA;
            uoaVar2 = uoaVarA;
        }
        if (uoaVar2 != null) {
            uoaVar2.l();
        }
    }
}
