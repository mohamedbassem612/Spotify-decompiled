package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class hth {
    public static final gth Companion = new gth();
    public final lrs0 a;
    public final String b;
    public final kth c;
    public final nth d;
    public final String e;

    public /* synthetic */ hth(int i, lrs0 lrs0Var, String str, kth kthVar, nth nthVar, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, fth.a.getDescriptor());
            throw null;
        }
        this.a = lrs0Var;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kthVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = nthVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hth)) {
            return false;
        }
        hth hthVar = (hth) obj;
        return u890.j(this.a, hthVar.a) && u890.j(this.b, hthVar.b) && u890.j(this.c, hthVar.c) && u890.j(this.d, hthVar.d) && u890.j(this.e, hthVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        kth kthVar = this.c;
        int iHashCode = (iD + (kthVar == null ? 0 : kthVar.hashCode())) * 31;
        nth nthVar = this.d;
        int iHashCode2 = (iHashCode + (nthVar == null ? 0 : nthVar.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
