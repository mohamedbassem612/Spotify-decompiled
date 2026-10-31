package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class qa90 {
    public static final pa90 Companion = new pa90();
    public final q9c1 a;
    public final q9c1 b;
    public final q9c1 c;
    public final q9c1 d;
    public final String e;
    public final String f;
    public final dc71 g;

    public /* synthetic */ qa90(int i, q9c1 q9c1Var, q9c1 q9c1Var2, q9c1 q9c1Var3, q9c1 q9c1Var4, String str, String str2, dc71 dc71Var) {
        if (37 != (i & 37)) {
            o6p1.t(i, 37, oa90.a.getDescriptor());
            throw null;
        }
        this.a = q9c1Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = q9c1Var2;
        }
        this.c = q9c1Var3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = q9c1Var4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        this.f = str2;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = dc71Var;
        }
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final q9c1 c() {
        return this.b;
    }

    public final q9c1 d() {
        return this.d;
    }

    public final q9c1 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa90)) {
            return false;
        }
        qa90 qa90Var = (qa90) obj;
        return u890.j(this.a, qa90Var.a) && u890.j(this.b, qa90Var.b) && u890.j(this.c, qa90Var.c) && u890.j(this.d, qa90Var.d) && u890.j(this.e, qa90Var.e) && u890.j(this.f, qa90Var.f) && u890.j(this.g, qa90Var.g);
    }

    public final q9c1 f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        q9c1 q9c1Var = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (q9c1Var == null ? 0 : q9c1Var.hashCode())) * 31)) * 31;
        q9c1 q9c1Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (q9c1Var2 == null ? 0 : q9c1Var2.hashCode())) * 31;
        String str = this.e;
        int iD = cy30.d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        dc71 dc71Var = this.g;
        return iD + (dc71Var != null ? dc71Var.hashCode() : 0);
    }
}
