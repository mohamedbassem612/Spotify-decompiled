package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class n411 {
    public static final m411 Companion = new m411();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ n411(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, l411.a.getDescriptor());
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
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n411)) {
            return false;
        }
        n411 n411Var = (n411) obj;
        return u890.j(this.a, n411Var.a) && u890.j(this.b, n411Var.b) && u890.j(this.c, n411Var.c) && u890.j(this.d, n411Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
