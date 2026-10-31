package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jwq {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Map f;

    public jwq(String str, String str2, String str3, boolean z, boolean z2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwq)) {
            return false;
        }
        jwq jwqVar = (jwq) obj;
        return u890.j(this.a, jwqVar.a) && u890.j(this.b, jwqVar.b) && u890.j(this.c, jwqVar.c) && this.d == jwqVar.d && this.e == jwqVar.e && u890.j(this.f, jwqVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
