package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v6i0 implements o5s {
    public final /* synthetic */ x6i0 a;

    public v6i0(x6i0 x6i0Var) {
        this.a = x6i0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        b7i0 b7i0Var = this.a.d;
        bpb1 bpb1Var = b7i0Var.d;
        r091 r091Var = (r091) bpb1Var.getValue();
        if (r091Var != null) {
            r091Var.i((VideoSurfaceView) null);
        }
        b7i0Var.e = null;
        bpb1Var.l((Object) null);
        b7i0Var.f = false;
        b7i0Var.b.d();
    }

    public final void onStart(iac0 iac0Var) {
        b7i0 b7i0Var = this.a.d;
        vm70 vm70Var = b7i0Var.e;
        if (vm70Var == null) {
            return;
        }
        r091 r091Var = (r091) b7i0Var.d.getValue();
        if (r091Var != null) {
            r091Var.i((VideoSurfaceView) null);
        }
        b7i0Var.a(vm70Var);
    }
}
