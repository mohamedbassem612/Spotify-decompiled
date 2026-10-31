package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hfr0 implements qfr0 {
    public final int a;

    public hfr0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfr0) && this.a == ((hfr0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
