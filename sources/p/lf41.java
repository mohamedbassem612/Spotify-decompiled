package p;

import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lf41 implements tcr {
    @Override // p.tcr
    public final String a(String str) {
        String strZ;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(Uri.decode(str));
        if (kf41.a[s4b1VarX.c.ordinal()] == 1) {
            Uri uri = s4b1VarX.a;
            String strF = null;
            if (uri != null && uri.getQuery() != null && (strZ = s4b1VarX.z()) != null) {
                strF = f4i1.f(strZ, "?", o7h.y0(uri.getQueryParameterNames(), "&", (String) null, (String) null, new zw11(s4b1VarX, (byte) 27), 30));
            }
            if (strF != null) {
                return strF;
            }
        }
        return str;
    }
}
