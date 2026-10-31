package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class rx91 {
    public static final qx91 Companion = new qx91();
    public final int a;
    public final String b;

    public /* synthetic */ rx91(int i, int i2, String str) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, px91.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx91)) {
            return false;
        }
        rx91 rx91Var = (rx91) obj;
        return this.a == rx91Var.a && u890.j(this.b, rx91Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public rx91(int i) {
        this.a = i;
        this.b = null;
    }
}
