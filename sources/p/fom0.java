package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fom0 {
    public final String a;
    public final String b;

    public fom0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fom0)) {
            return false;
        }
        fom0 fom0Var = (fom0) obj;
        return this.a.equals(fom0Var.a) && this.b.equals(fom0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
