package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fdy0 implements gdy0 {
    public final String a;
    public final String b;

    public fdy0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdy0)) {
            return false;
        }
        fdy0 fdy0Var = (fdy0) obj;
        return this.a.equals(fdy0Var.a) && u890.j(this.b, fdy0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
