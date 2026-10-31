package p;

import com.google.android.meet.addons.AddonException;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t350 implements Consumer {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ x350 b;
    public final /* synthetic */ z1a1 c;

    public t350(x350 x350Var, z1a1 z1a1Var) {
        this.b = x350Var;
        this.c = z1a1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        z1a1 z1a1Var = this.c;
        x350 x350Var = this.b;
        switch (b) {
            case 0:
                Logger.b("[LiveSharing] Connected successfully to live-sharing as a " + z1a1Var + ".", new Object[0]);
                x350Var.e = (r02) obj;
                if (z1a1Var instanceof r350) {
                    x350Var.d(new jsd0(((r350) z1a1Var).c));
                }
                break;
            default:
                AddonException addonException = (Throwable) obj;
                Logger.d(f4i1.f("[LiveSharing] Error connecting to live-sharing, caused by: ", addonException.getMessage(), "."), new Object[0]);
                boolean z = addonException instanceof AddonException;
                if (z && addonException.a == m02.i) {
                    x350Var.d(new fsd0(addonException));
                } else {
                    String str = z ? "[LiveSharing] Failed to connect to live-sharing with code: " + addonException.a : "[LiveSharing] Failed to connect to live-sharing";
                    x350Var.d(new gsd0(z1a1Var instanceof r350 ? ((r350) z1a1Var).c : null, addonException));
                    n57.t(str, addonException);
                }
                break;
        }
    }

    public t350(z1a1 z1a1Var, x350 x350Var) {
        this.c = z1a1Var;
        this.b = x350Var;
    }
}
