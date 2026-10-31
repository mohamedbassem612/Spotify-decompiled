package p;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ep21 {
    public final int a;
    public final String b;
    public final Map c;
    public final long d;
    public final String e;
    public final Map f;
    public final HashSet g = dm61.t0(new String[]{"authorization", "client-token", "x-spotify-connection-id"});

    public ep21(int i, String str, Map map, long j, String str2, Map map2) {
        this.a = i;
        this.b = str;
        this.c = map;
        this.d = j;
        this.e = str2;
        this.f = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep21)) {
            return false;
        }
        ep21 ep21Var = (ep21) obj;
        return this.a == ep21Var.a && this.b.equals(ep21Var.b) && this.c.equals(ep21Var.c) && this.d == ep21Var.d && u890.j(this.e, ep21Var.e) && u890.j(this.f, ep21Var.f);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.e(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c), this.d, 31);
        String str = this.e;
        return this.f.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestInfo(");
        sb.append("method=" + kx40.l(this.a) + ", ");
        String strSubstring = this.b;
        int iW0 = ihc1.w0(strSubstring, "?", 0, false, 6);
        if (iW0 > 0) {
            strSubstring = strSubstring.substring(0, iW0);
        }
        sb.append("url=" + strSubstring + ", ");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.c.entrySet()) {
            if (!this.g.contains(((String) entry.getKey()).toLowerCase(Locale.ROOT))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        sb.append("headers=" + linkedHashMap + ", ");
        sb.append("bytesSent=" + this.d + ")");
        return sb.toString();
    }
}
