package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ofg0 {
    public final String a;
    public final ibg0 b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ofg0(String str, ibg0 ibg0Var, Boolean bool, Boolean bool2, Boolean bool3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = ibg0Var;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static ofg0 a(ofg0 ofg0Var, Boolean bool, Boolean bool2, Boolean bool3, boolean z, boolean z2, boolean z3, int i) {
        String str = ofg0Var.a;
        ibg0 ibg0Var = ofg0Var.b;
        if ((i & 4) != 0) {
            bool = ofg0Var.c;
        }
        Boolean bool4 = bool;
        if ((i & 8) != 0) {
            bool2 = ofg0Var.d;
        }
        Boolean bool5 = bool2;
        if ((i & 16) != 0) {
            bool3 = ofg0Var.e;
        }
        Boolean bool6 = bool3;
        if ((i & 32) != 0) {
            z = ofg0Var.f;
        }
        boolean z4 = z;
        if ((i & 64) != 0) {
            z2 = ofg0Var.g;
        }
        return new ofg0(str, ibg0Var, bool4, bool5, bool6, z4, z2, (i & 128) != 0 ? ofg0Var.h : z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofg0)) {
            return false;
        }
        ofg0 ofg0Var = (ofg0) obj;
        return u890.j(this.a, ofg0Var.a) && this.b == ofg0Var.b && u890.j(this.c, ofg0Var.c) && u890.j(this.d, ofg0Var.d) && u890.j(this.e, ofg0Var.e) && this.f == ofg0Var.f && this.g == ofg0Var.g && this.h == ofg0Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Boolean bool = this.c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.e;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }
}
