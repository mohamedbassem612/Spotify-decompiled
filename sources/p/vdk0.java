package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vdk0 {
    public final String a;
    public final bek0 b;

    public vdk0(String str, bek0 bek0Var) {
        this.a = str;
        this.b = bek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdk0)) {
            return false;
        }
        vdk0 vdk0Var = (vdk0) obj;
        return this.a.equals(vdk0Var.a) && this.b.equals(vdk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
