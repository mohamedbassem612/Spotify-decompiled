package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fja0 extends oon1 {
    public final String d;
    public final String e;

    public fja0(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fja0)) {
            return false;
        }
        fja0 fja0Var = (fja0) obj;
        return u890.j(this.d, fja0Var.d) && u890.j(this.e, fja0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String p() {
        return this.d + this.e;
    }
}
