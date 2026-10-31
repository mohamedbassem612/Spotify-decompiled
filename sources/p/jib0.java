package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jib0 implements acr0 {
    public final /* synthetic */ byte a;
    public final rxj0 b;
    public final Set c;

    public jib0(rxj0 rxj0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = rxj0Var;
                this.c = Collections.singleton(cyu0.e);
                break;
            default:
                this.b = rxj0Var;
                this.c = Collections.singleton(dyu0.e);
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return fib0.class;
            default:
                return v5k0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                dyu0 dyu0Var = s4b1Var.d;
                dyu0 dyu0Var2 = dyu0Var instanceof dyu0 ? dyu0Var : null;
                if (dyu0Var2 == null) {
                    ncn0.d(s4b1Var, " URI is not supported, only the later-in-playlist URI is supported.");
                    return null;
                }
                xkg0 xkg0Var = dyu0Var2.b;
                Bundle extras = intent.getExtras();
                hib0 hib0Var = extras != null ? (hib0) jhc1.t(extras, "later_in_playlist_input", hib0.class) : null;
                if (hib0Var == null) {
                    Set set = s4b1.f;
                    String strZ = uic.y(dyu0Var2.a).z();
                    if (strZ == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    Object obj = xkg0Var.get("outTrackRowId");
                    if (obj == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    String str = (String) obj;
                    Object obj2 = xkg0Var.get("currentIncomingTrackUri");
                    if (obj2 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    hib0Var = new hib0(strZ, str, (String) obj2, (String) xkg0Var.get("currentIncomingRowId"));
                }
                return new iib0(dyu0Var2.d, hib0Var, th61Var.a);
            default:
                cyu0 cyu0Var = s4b1Var.d;
                cyu0 cyu0Var2 = cyu0Var instanceof cyu0 ? cyu0Var : null;
                if (cyu0Var2 == null) {
                    ncn0.d(s4b1Var, " URI is not supported, only the mixing extended versions URI is supported.");
                    return null;
                }
                Set set2 = s4b1.f;
                String strZ2 = uic.y(cyu0Var2.a).z();
                if (strZ2 != null) {
                    return new x5k0(cyu0Var2.d, strZ2);
                }
                bhn0.k("Unable to convert ", s4b1Var, " URI to a playlist V2 URI.");
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            default:
                return new c6w0(1, true, (hd5) null, 12);
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.c;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Later in this playlist track selection bottom sheet";
            default:
                return "Page for replacing playlist tracks with their extended versions";
        }
    }

    public final boolean isEnabled() {
        switch (this.a) {
            case 0:
                return this.b.Y;
            default:
                return this.b.N;
        }
    }
}
