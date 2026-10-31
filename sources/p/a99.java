package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class a99 {
    public static final z89 Companion = new z89();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ a99(int i, String str, String str2, String str3, boolean z, boolean z2) {
        if (9 != (i & 9)) {
            o6p1.t(i, 9, y89.a.getDescriptor());
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
        this.d = z;
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a99)) {
            return false;
        }
        a99 a99Var = (a99) obj;
        return u890.j(this.a, a99Var.a) && u890.j(this.b, a99Var.b) && u890.j(this.c, a99Var.c) && this.d == a99Var.d && this.e == a99Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }
}
