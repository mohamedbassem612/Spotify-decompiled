package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r1x0 extends fn31 {
    public final String g;
    public final String h;

    public r1x0(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1x0)) {
            return false;
        }
        r1x0 r1x0Var = (r1x0) obj;
        return u890.j(this.g, r1x0Var.g) && u890.j(this.h, r1x0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }
}
