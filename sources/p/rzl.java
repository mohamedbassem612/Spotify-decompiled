package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rzl extends zzl {
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public rzl(String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzl)) {
            return false;
        }
        rzl rzlVar = (rzl) obj;
        return this.a.equals(rzlVar.a) && this.b == rzlVar.b && u890.j(this.c, rzlVar.c) && u890.j(this.d, rzlVar.d) && this.e == rzlVar.e && this.f == rzlVar.f;
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }
}
