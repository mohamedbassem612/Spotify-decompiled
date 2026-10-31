package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aw30 {
    public static final aw30 c = new aw30(p7h.M(new yv30[]{uv30.d, xv30.d, vv30.d, wv30.d}));
    public final List a;
    public final LinkedHashMap b;

    public aw30(List list) {
        this.a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            kf30 kf30Var = ((yv30) obj).a;
            Object arrayList = linkedHashMap.get(kf30Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kf30Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    public final zv30 a(String str, kf30 kf30Var) {
        Integer numValueOf;
        List<yv30> list = (List) this.b.get(kf30Var);
        if (list != null) {
            for (yv30 yv30Var : list) {
                int i = 0;
                if (nhc1.Y(str, yv30Var.b, false)) {
                    String strSubstring = str.substring(yv30Var.b.length());
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i2 = 0;
                    while (true) {
                        if (i >= length) {
                            numValueOf = Integer.valueOf(i2);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i2 = (i2 * 10) + iCharAt;
                        i++;
                    }
                    if (numValueOf != null) {
                        return new zv30(yv30Var, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
