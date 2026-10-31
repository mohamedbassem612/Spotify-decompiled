package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a391 {
    public final int a;
    public final int b;

    public a391(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a391)) {
            return false;
        }
        a391 a391Var = (a391) obj;
        return this.a == a391Var.a && this.b == a391Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + kaa0.q(this.a) + ", height=" + kaa0.q(this.b) + ')';
    }
}
