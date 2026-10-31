package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.profileconfig.proto.v1.DismissProfileCompletionRequest;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f0x0 implements o5s {
    public final /* synthetic */ MobiusLoop.Controller a;
    public final /* synthetic */ j0x0 b;
    public final /* synthetic */ iis c;

    public f0x0(MobiusLoop.Controller controller, j0x0 j0x0Var, iis iisVar) {
        this.a = controller;
        this.b = j0x0Var;
        this.c = iisVar;
    }

    public final void onDestroy(iac0 iac0Var) {
        d0x0 d0x0Var;
        this.a.disconnect();
        int i = this.c.l;
        int i2 = i == 0 ? -1 : e0x0.a[l1d.C(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                d0x0Var = d0x0.INTRO;
            } else if (i2 == 2) {
                d0x0Var = d0x0.DISPLAY_NAME;
            } else if (i2 == 3) {
                d0x0Var = d0x0.PROFILE_PICTURE;
            } else {
                if (i2 != 4) {
                    eg.o();
                    return;
                }
                d0x0Var = d0x0.CONFIRM;
            }
            w0x0 w0x0Var = this.b.d.a;
            bfu bfuVarO = DismissProfileCompletionRequest.o();
            bfuVarO.n(d0x0Var);
            bfuVarO.q(tfu.SWIPED_AWAY);
            w0x0Var.a(bfuVarO.build()).flatMapCompletable(dj20.c1).o(Functions.h).subscribe();
        }
    }

    public final void onStart(iac0 iac0Var) {
        this.a.start();
    }

    public final void onStop(iac0 iac0Var) {
        this.a.stop();
    }
}
