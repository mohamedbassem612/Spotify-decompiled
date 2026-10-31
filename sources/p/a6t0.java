package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a6t0 extends m5n1 {
    public final String h;
    public final String i;

    public a6t0(String str, String str2) {
        this.h = str;
        this.i = str2;
    }

    public final String Y() {
        return this.i;
    }

    public final String Z() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6t0)) {
            return false;
        }
        a6t0 a6t0Var = (a6t0) obj;
        return u890.j(this.h, a6t0Var.h) && u890.j(this.i, a6t0Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() * 31;
        String str = this.i;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
