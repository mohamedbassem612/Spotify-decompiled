package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fwf0 implements hwf0 {
    public final String a;
    public final boolean b;

    public fwf0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwf0)) {
            return false;
        }
        fwf0 fwf0Var = (fwf0) obj;
        return u890.j(this.a, fwf0Var.a) && this.b == fwf0Var.b;
    }

    public final String getEntityUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
