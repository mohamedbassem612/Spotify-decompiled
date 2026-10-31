package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d880 implements acr0 {
    public final /* synthetic */ byte a;
    public final w8r0 b;
    public final Set c;

    public d880(w8r0 w8r0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = w8r0Var;
                this.c = Collections.singleton(blc0.tc);
                break;
            default:
                this.b = w8r0Var;
                this.c = Collections.singleton(blc0.qc);
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
                return e880.class;
            default:
                return asq0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String str;
        String queryParameter;
        switch (this.a) {
            case 0:
                String strJ = s4b1Var.j();
                str = strJ != null ? strJ : "";
                String strConcat = "spotify:show:".concat(str);
                Uri uri = s4b1Var.a;
                og90 og90Var = null;
                if (uri != null && (queryParameter = uri.getQueryParameter("isbn")) != null) {
                    if (nhc1.Y(queryParameter, "connected:", false) && queryParameter.length() > 10) {
                        og90Var = new og90(ihc1.U0(queryParameter, "connected:", queryParameter));
                    } else if (queryParameter.equals("skipped")) {
                        og90Var = rg90.a;
                    } else if (queryParameter.equals("remove")) {
                        og90Var = pg90.a;
                    }
                }
                return new r880(str, strConcat, og90Var);
            default:
                Collections.singleton(blc0.tc);
                String strO = s4b1Var.o(2);
                str = strO != null ? strO : "";
                return new psq0(str, "spotify:show:".concat(str));
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
                return "Page Match inbound scanning bottom sheet to capture book pages";
            default:
                return "Page Match outbound scanning bottom sheet to capture book pages";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        w8r0 w8r0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return w8r0Var.a();
    }
}
