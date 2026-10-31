package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o27 {
    public final int a;
    public final int b;

    public /* synthetic */ o27(int i, int i2, l1d l1dVar) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) == 0 ? 2 : 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o27)) {
            return false;
        }
        o27 o27Var = (o27) obj;
        return this.a == o27Var.a && this.b == o27Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }

    public o27(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
