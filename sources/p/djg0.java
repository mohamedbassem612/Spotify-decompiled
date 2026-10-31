package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class djg0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public djg0(c5l1 c5l1Var, boolean z) {
        this.a = (byte) 2;
        this.c = c5l1Var;
        this.b = z;
    }

    public final void run() {
        byte b = this.a;
        lnm lnmVar = null;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putBoolean("puffin_setup_flow_should_resume_music_when_exiting_flow", z);
                a1r0.i((a1r0) ((uw0) obj).d, "spotify:internal:puffin-setup-unsupported", (String) null, bundle, 2);
                break;
            case 1:
                ivg0 ivg0Var = (ivg0) obj;
                if (!z) {
                    ivg0Var.h.k(ivg0Var.s);
                    if (ivg0Var.l.d()) {
                        fn31.T(cto1.q(ivg0Var.j), ivg0Var.i, 0, new gvg0(ivg0Var, lnmVar, (byte) 0), 2);
                    }
                }
                break;
            default:
                ((c5l1) obj).Y0().c(new bkt(z), new ifl1((Object) null, (byte) 25), true);
                break;
        }
    }

    public /* synthetic */ djg0(boolean z, Object obj, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
    }
}
