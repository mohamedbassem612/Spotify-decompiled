package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class dpt {
    public static final apt Companion = new apt();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Long g;
    public final Boolean h;

    public /* synthetic */ dpt(int i, String str, String str2, String str3, String str4, String str5, boolean z, Long l, Boolean bool) {
        if (63 != (i & 63)) {
            o6p1.t(i, 63, yot.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpt)) {
            return false;
        }
        dpt dptVar = (dpt) obj;
        return u890.j(this.a, dptVar.a) && u890.j(this.b, dptVar.b) && u890.j(this.c, dptVar.c) && u890.j(this.d, dptVar.d) && u890.j(this.e, dptVar.e) && this.f == dptVar.f && u890.j(this.g, dptVar.g) && u890.j(this.h, dptVar.h);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Long l = this.g;
        int iHashCode = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.h;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public dpt(String str, String str2, String str3, String str4, String str5, Long l, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = true;
        this.g = l;
        this.h = bool;
    }
}
