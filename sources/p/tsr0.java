package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tsr0 implements acr0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Set c;

    public tsr0(byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = z;
                this.c = Collections.singleton(blc0.t5);
                break;
            default:
                this.b = z;
                this.c = Collections.singleton(blc0.Lc);
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
                return nsr0.class;
            default:
                return vl21.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                return new ssr0();
            default:
                String strN = s4b1Var.n("uri");
                if (strN == null) {
                    strN = "";
                }
                xkg0 xkg0Var = new xkg0();
                String strN2 = s4b1Var.n("playback_timestamp");
                if (strN2 != null) {
                    xkg0Var.put("playback_timestamp", strN2);
                }
                xkg0 xkg0VarB = xkg0Var.b();
                String strZ = s4b1Var.z();
                String str = strZ != null ? strZ : "";
                if (xkg0VarB.isEmpty()) {
                    xkg0VarB = null;
                }
                String strO = hap1.o(strN, xkg0VarB);
                xkg0 xkg0Var2 = new xkg0();
                String strN3 = s4b1Var.n("entity_name");
                if (strN3 != null) {
                }
                String strN4 = s4b1Var.n("entity_image_uri");
                if (strN4 != null) {
                    xkg0Var2.put("artwork", strN4);
                }
                return new yl21(str, strN, strO, xkg0Var2.b());
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return new b6w0(false);
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Parent or guardian details for a managed account";
            default:
                return "Hybrid report bottom sheet with WebView";
        }
    }

    public final boolean isEnabled() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }
}
