package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class obk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public obk(String str, String str2, String str3, String str4, boolean z, List list, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = list;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obk)) {
            return false;
        }
        obk obkVar = (obk) obj;
        return u890.j(this.a, obkVar.a) && u890.j(this.b, obkVar.b) && u890.j(this.c, obkVar.c) && u890.j(this.d, obkVar.d) && this.e == obkVar.e && u890.j(this.f, obkVar.f) && this.g == obkVar.g && this.h == obkVar.h && this.i == obkVar.i;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(f4i1.b(xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
