package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s361 {
    public static final s361 g = new s361("", "", "", "", "", b7x.a);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map f;

    public s361(String str, String str2, String str3, String str4, String str5, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s361)) {
            return false;
        }
        s361 s361Var = (s361) obj;
        return this.a.equals(s361Var.a) && u890.j(this.b, s361Var.b) && this.c.equals(s361Var.c) && u890.j(this.d, s361Var.d) && this.e.equals(s361Var.e) && this.f.equals(s361Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
