package p;

import android.content.Intent;
import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d7y0 implements ct80 {
    public static final String c = nik1.e6.a;
    public final i5y0 a;
    public final x1i1 b;

    public d7y0(i5y0 i5y0Var, x1i1 x1i1Var) {
        this.a = i5y0Var;
        this.b = x1i1Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    public final gt80 a(Intent intent) {
        i5y0 i5y0Var;
        String dataString = intent.getDataString();
        if (dataString != null) {
            Set set = s4b1.f;
            Uri uri = uic.x(dataString).a;
            String queryParameter = uri != null ? uri.getQueryParameter("config") : null;
            if (!nhc1.Y(dataString, "spotify:create-prompted-playlist", false)) {
                String str = c;
                if (nhc1.Y(dataString, str, false) && (dataString.length() <= str.length() || dataString.charAt(str.length()) == '?')) {
                    if (queryParameter != null) {
                        i5y0Var = this.a;
                        if (i5y0Var.c()) {
                            x1i1.a(this.b, new z740(1, ((lm10) i5y0Var.d).a, "generate"), 6);
                            return dt80.a;
                        }
                    } else {
                        i5y0Var = this.a;
                        if (i5y0Var.c()) {
                            x1i1.a(this.b, new z740(1, ((lm10) i5y0Var.d).a, "generate"), 6);
                            return dt80.a;
                        }
                    }
                }
            } else if (queryParameter != null || queryParameter.equals("NEW")) {
                i5y0Var = this.a;
                if (i5y0Var.c()) {
                    x1i1.a(this.b, new z740(1, ((lm10) i5y0Var.d).a, "generate"), 6);
                    return dt80.a;
                }
            }
        }
        return et80.a;
    }
}
