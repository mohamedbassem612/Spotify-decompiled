package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class kgs0 {
    public static final jgs0 Companion = new jgs0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final j16 e;

    public /* synthetic */ kgs0(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, igs0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
            str4 = null;
        } else {
            this.d = str4;
        }
        this.e = n3o1.p(str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgs0)) {
            return false;
        }
        kgs0 kgs0Var = (kgs0) obj;
        return u890.j(this.a, kgs0Var.a) && u890.j(this.b, kgs0Var.b) && u890.j(this.c, kgs0Var.c) && u890.j(this.d, kgs0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public kgs0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = null;
        this.e = n3o1.p((String) null);
    }
}
