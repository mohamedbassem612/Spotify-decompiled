package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vcg1 {
    public final String a;
    public final int b;

    public vcg1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcg1)) {
            return false;
        }
        vcg1 vcg1Var = (vcg1) obj;
        return u890.j(this.a, vcg1Var.a) && this.b == vcg1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + ab80.k(1, this.a.hashCode() * 31, 31);
    }
}
