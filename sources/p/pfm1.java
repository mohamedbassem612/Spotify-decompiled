package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pfm1 {
    public final String a;
    public final ofm1 b;

    public pfm1(String str, ofm1 ofm1Var) {
        this.a = str;
        this.b = ofm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfm1)) {
            return false;
        }
        pfm1 pfm1Var = (pfm1) obj;
        return u890.j(this.a, pfm1Var.a) && u890.j(this.b, pfm1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ofm1 ofm1Var = this.b;
        return iHashCode + (ofm1Var != null ? ofm1Var.hashCode() : 0);
    }
}
