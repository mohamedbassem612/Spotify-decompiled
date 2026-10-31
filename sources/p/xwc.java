package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xwc {
    public final String a;
    public final String b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public xwc(int i, Integer num, Integer num2, String str, String str2, boolean z) {
        int i2 = (i & 4) != 0 ? 2131102457 : 2131101168;
        num = (i & 8) != 0 ? null : num;
        num2 = (i & 16) != 0 ? null : num2;
        z = (i & 32) != 0 ? false : z;
        boolean z2 = (i & 64) == 0;
        int i3 = (i & 128) == 0 ? 2 : 1;
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = num;
        this.e = num2;
        this.f = z;
        this.g = z2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwc)) {
            return false;
        }
        xwc xwcVar = (xwc) obj;
        return u890.j(this.a, xwcVar.a) && u890.j(this.b, xwcVar.b) && this.c == xwcVar.c && u890.j(this.d, xwcVar.d) && u890.j(this.e, xwcVar.e) && this.f == xwcVar.f && this.g == xwcVar.g && this.h == xwcVar.h;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        Integer num = this.d;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return l1d.C(this.h) + xcg1.g(xcg1.g((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }
}
