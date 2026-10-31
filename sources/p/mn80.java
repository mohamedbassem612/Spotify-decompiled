package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mn80 implements kn80 {
    public final ln80 a;

    public mn80(ln80 ln80Var) {
        this.a = ln80Var;
    }

    public final String a(String str) {
        ArrayList arrayList = new ArrayList();
        String strV = ilo1.v(str, "utm_campaign");
        if (strV.length() > 0) {
            arrayList.add("utm_campaign=".concat(strV));
        }
        String strV2 = ilo1.v(str, "utm_medium");
        if (strV2.length() > 0) {
            arrayList.add("utm_medium=".concat(strV2));
        }
        String strV3 = ilo1.v(str, "utm_source");
        if (strV3.length() > 0) {
            arrayList.add("utm_source=".concat(strV3));
        }
        return o7h.y0(arrayList, "&", (String) null, (String) null, (iu30) null, 62);
    }

    public final boolean b(String str) {
        if (this.a.b(str)) {
            return false;
        }
        return ihc1.j0(str, "utm_campaign") || ihc1.j0(str, "utm_medium") || ihc1.j0(str, "utm_source");
    }
}
