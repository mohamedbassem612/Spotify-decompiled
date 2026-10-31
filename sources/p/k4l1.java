package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class k4l1 extends l4l1 {
    public static final j4l1 Companion = new j4l1();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ k4l1(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, i4l1.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4l1)) {
            return false;
        }
        k4l1 k4l1Var = (k4l1) obj;
        return u890.j(this.b, k4l1Var.b) && u890.j(this.c, k4l1Var.c) && u890.j(this.d, k4l1Var.d) && u890.j(this.e, k4l1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
