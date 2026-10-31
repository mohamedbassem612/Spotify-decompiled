package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ycl {
    public static final xcl Companion = new xcl();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;

    public /* synthetic */ ycl(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2) {
        if (219 != (i & 219)) {
            o6p1.t(i, 219, wcl.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = str4;
        this.e = z;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        this.g = str6;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycl)) {
            return false;
        }
        ycl yclVar = (ycl) obj;
        return u890.j(this.a, yclVar.a) && u890.j(this.b, yclVar.b) && u890.j(this.c, yclVar.c) && u890.j(this.d, yclVar.d) && this.e == yclVar.e && u890.j(this.f, yclVar.f) && u890.j(this.g, yclVar.g) && this.h == yclVar.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        return Boolean.hashCode(this.h) + cy30.d((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g);
    }
}
