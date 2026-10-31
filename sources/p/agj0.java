package p;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class agj0 {
    public final g8h1 a;

    public agj0(g8h1 g8h1Var) {
        this.a = g8h1Var;
    }

    public final f8h1 a(Uri uri, cwn0 cwn0Var) {
        if (!m2i1.a(uri)) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                int iV0 = ihc1.v0(encodedQuery, '&', i, 4);
                Integer numValueOf = Integer.valueOf(iV0);
                if (iV0 < 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : encodedQuery.length();
                arrayList.add(encodedQuery.substring(i, iIntValue));
                i = iIntValue + 1;
            } while (i <= encodedQuery.length());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!u890.j(Uri.decode(ihc1.Y0((String) obj, '=')), "ubi")) {
                    arrayList2.add(obj);
                }
            }
            Uri.Builder builderBuildUpon = uri.buildUpon();
            ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
            uri = builderBuildUpon.encodedQuery(arrayList3 != null ? o7h.y0(arrayList3, "&", (String) null, (String) null, (iu30) null, 62) : null).build();
            String str = (String) o7h.X0(arrayList2);
            if (str == null || str.length() != 0) {
                uri.getClass();
            } else {
                uri.getClass();
                String string = uri.toString();
                int iV1 = ihc1.v0(string, '#', 0, 6);
                uri = Uri.parse(iV1 < 0 ? string.concat("?") : f4i1.f(string.substring(0, iV1), "?", string.substring(iV1)));
            }
        }
        g8h1 g8h1Var = this.a;
        return new f8h1(g8h1Var.b(uri, cwn0Var), g8h1Var);
    }
}
