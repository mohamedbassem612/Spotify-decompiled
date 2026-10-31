package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class teg0 extends mqn1 {
    public final String f;
    public final ibg0 g;
    public final boolean h;

    public teg0(String str, ibg0 ibg0Var, boolean z) {
        this.f = str;
        this.g = ibg0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof teg0)) {
            return false;
        }
        teg0 teg0Var = (teg0) obj;
        return u890.j(this.f, teg0Var.f) && this.g == teg0Var.g && this.h == teg0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + (this.f.hashCode() * 31)) * 31);
    }
}
