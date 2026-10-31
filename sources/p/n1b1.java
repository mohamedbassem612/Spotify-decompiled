package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class n1b1 {
    public static final i1b1 Companion = new i1b1();
    public final Long a;
    public final Long b;
    public final String c;
    public final String d;
    public final Integer e;
    public boolean f;

    public /* synthetic */ n1b1(int i, Long l, Long l2, String str, String str2, Integer num) {
        if (4 != (i & 4)) {
            o6p1.t(i, 4, h1b1.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        this.c = str;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        this.f = false;
    }

    public final String a() {
        return this.d;
    }

    public final Long b() {
        return this.b;
    }

    public final Long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1b1)) {
            return false;
        }
        n1b1 n1b1Var = (n1b1) obj;
        return u890.j(this.a, n1b1Var.a) && u890.j(this.b, n1b1Var.b) && u890.j(this.c, n1b1Var.c) && u890.j(this.d, n1b1Var.d) && u890.j(this.e, n1b1Var.e);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iD = cy30.d((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int iHashCode2 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
