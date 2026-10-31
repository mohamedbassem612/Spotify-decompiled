package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gpq0 extends i541 {
    public final hux d;
    public final String e;
    public final fpq0 f;
    public final boolean g;

    public gpq0(hux huxVar, String str, fpq0 fpq0Var, boolean z) {
        this.d = huxVar;
        this.e = str;
        this.f = fpq0Var;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpq0)) {
            return false;
        }
        gpq0 gpq0Var = (gpq0) obj;
        return u890.j(this.d, gpq0Var.d) && this.e.equals(gpq0Var.e) && this.f.equals(gpq0Var.f) && this.g == gpq0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + cy30.d(this.d.hashCode() * 31, 31, this.e)) * 31);
    }
}
