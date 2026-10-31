package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
@o661
public final class rw {
    public static final qw Companion = new qw();
    public final String a;
    public final String b;
    public final ow c;
    public final String d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public final Long h;
    public final Long i;

    public /* synthetic */ rw(int i, String str, String str2, ow owVar, String str3, String str4, Integer num, boolean z, Long l, Long l2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, pw.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = owVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l2;
        }
    }

    public final Integer a() {
        return this.f;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final Long e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw)) {
            return false;
        }
        rw rwVar = (rw) obj;
        return u890.j(this.a, rwVar.a) && u890.j(this.b, rwVar.b) && u890.j(this.c, rwVar.c) && u890.j(this.d, rwVar.d) && u890.j(this.e, rwVar.e) && u890.j(this.f, rwVar.f) && this.g == rwVar.g && u890.j(this.h, rwVar.h) && u890.j(this.i, rwVar.i);
    }

    public final Long f() {
        return this.h;
    }

    public final boolean g() {
        return this.g;
    }

    public final ow h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        ow owVar = this.c;
        int iHashCode2 = (iHashCode + (owVar == null ? 0 : owVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.g)) * 31;
        Long l = this.h;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.i;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String i() {
        return this.a;
    }

    public rw(String str, String str2, ow owVar, String str3, String str4, Integer num, boolean z, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = owVar;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = z;
        this.h = l;
        this.i = l2;
    }
}
