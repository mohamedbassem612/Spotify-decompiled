package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class t510 {
    public static final s510 Companion = new s510();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final Long g;
    public final Long h;
    public final Integer i;
    public final String j;

    public /* synthetic */ t510(int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l, Long l2, Integer num, String str5) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, r510.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = Boolean.FALSE;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = Boolean.FALSE;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = l;
        }
        if ((i & 128) == 0) {
            this.h = 0L;
        } else {
            this.h = l2;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t510)) {
            return false;
        }
        t510 t510Var = (t510) obj;
        return u890.j(this.a, t510Var.a) && u890.j(this.b, t510Var.b) && u890.j(this.c, t510Var.c) && u890.j(this.d, t510Var.d) && u890.j(this.e, t510Var.e) && u890.j(this.f, t510Var.f) && u890.j(this.g, t510Var.g) && u890.j(this.h, t510Var.h) && u890.j(this.i, t510Var.i) && u890.j(this.j, t510Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.g;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.j;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }
}
