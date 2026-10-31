package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n1x {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;

    public n1x(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1x)) {
            return false;
        }
        n1x n1xVar = (n1x) obj;
        return this.a.equals(n1xVar.a) && this.b.equals(n1xVar.b) && this.c.equals(n1xVar.c) && this.d.equals(n1xVar.d) && this.e.equals(n1xVar.e) && this.f.equals(n1xVar.f) && this.g.equals(n1xVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
