package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class veg0 extends mqn1 {
    public final String f;
    public final ibg0 g;
    public final boolean h;

    public veg0(String str, ibg0 ibg0Var, boolean z) {
        this.f = str;
        this.g = ibg0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof veg0)) {
            return false;
        }
        veg0 veg0Var = (veg0) obj;
        return u890.j(this.f, veg0Var.f) && this.g == veg0Var.g && this.h == veg0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + (this.f.hashCode() * 31)) * 31);
    }
}
