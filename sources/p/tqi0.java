package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tqi0 implements acr0 {
    public final /* synthetic */ byte a;
    public final asi0 b;
    public final Set c;

    public tqi0(asi0 asi0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = asi0Var;
                this.c = Collections.singleton(blc0.vb);
                break;
            default:
                this.b = asi0Var;
                this.c = Collections.singleton(blc0.Zg);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.c;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return pqi0.class;
            default:
                return qri0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String str = null;
        switch (this.a) {
            case 0:
                String strZ = s4b1Var.z();
                if (strZ != null) {
                    String strJ0 = ihc1.J0(strZ, ":membershipsuccess");
                    if (ihc1.y0(strJ0)) {
                        strJ0 = null;
                    }
                    if (strJ0 != null) {
                        String strN = s4b1Var.n("showTitle");
                        if (strN != null && !ihc1.y0(strN)) {
                            str = strN;
                        }
                        return new sqi0(strJ0, str != null ? str : "");
                    }
                }
                hhg1.g(s4b1Var, "Missing show URI in membershipsuccess link: ");
                return null;
            default:
                String strN2 = s4b1Var.n("showUri");
                if (strN2 != null && !ihc1.y0(strN2)) {
                    str = strN2;
                }
                return new tri0(str != null ? str : "");
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new c6w0(2, false, (hd5) null, 14);
            default:
                return new b6w0(true);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Full-screen overlay confirming a successful membership purchase";
            default:
                return "Bottom sheet for membership upsell when locked episode is tapped";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        asi0 asi0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return asi0Var.a.a();
    }
}
