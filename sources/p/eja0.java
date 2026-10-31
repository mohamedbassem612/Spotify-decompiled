package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eja0 extends oon1 {
    public final String d;
    public final String e;

    public eja0(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final String J() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eja0)) {
            return false;
        }
        eja0 eja0Var = (eja0) obj;
        return u890.j(this.d, eja0Var.d) && u890.j(this.e, eja0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String p() {
        return this.d + ':' + this.e;
    }
}
