package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q1x0 extends fn31 {
    public final String g;
    public final String h;

    public q1x0(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1x0)) {
            return false;
        }
        q1x0 q1x0Var = (q1x0) obj;
        return u890.j(this.g, q1x0Var.g) && u890.j(this.h, q1x0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }
}
