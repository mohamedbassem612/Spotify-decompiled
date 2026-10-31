package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hs2 extends upf {
    public final String d;
    public final String e;
    public final int f;

    public hs2(int i, String str, String str2) {
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs2)) {
            return false;
        }
        hs2 hs2Var = (hs2) obj;
        return u890.j(this.d, hs2Var.d) && u890.j(this.e, hs2Var.e) && this.f == hs2Var.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + cy30.d(this.d.hashCode() * 31, 31, this.e);
    }
}
