package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class t521 {
    public final int a;
    public final Integer b;

    public t521(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t521)) {
            return false;
        }
        t521 t521Var = (t521) obj;
        return this.a == t521Var.a && this.b.equals(t521Var.b);
    }

    public final int hashCode() {
        return (l1d.C(this.a) * 31) + this.b.hashCode();
    }
}
