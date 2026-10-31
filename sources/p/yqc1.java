package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yqc1 implements erc1 {
    public final hux a;
    public final int b;

    public yqc1(hux huxVar, int i) {
        this.a = huxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqc1)) {
            return false;
        }
        yqc1 yqc1Var = (yqc1) obj;
        return u890.j(this.a, yqc1Var.a) && this.b == yqc1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
