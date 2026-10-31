package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wc1 {
    public final int a;
    public final fc1 b;
    public final wxn0 c;

    public wc1(int i, fc1 fc1Var, wxn0 wxn0Var) {
        this.a = i;
        this.b = fc1Var;
        this.c = wxn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc1)) {
            return false;
        }
        wc1 wc1Var = (wc1) obj;
        return this.a == wc1Var.a && this.b.equals(wc1Var.b) && this.c == wc1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
