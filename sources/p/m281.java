package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m281 extends e6p1 {
    public final String c;
    public final int d;

    public m281(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m281)) {
            return false;
        }
        m281 m281Var = (m281) obj;
        return this.c.equals(m281Var.c) && this.d == m281Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + (this.c.hashCode() * 31);
    }
}
