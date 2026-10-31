package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kwe1 extends mwe1 {
    public final long a;
    public final int b;

    public kwe1(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // p.mwe1
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwe1)) {
            return false;
        }
        kwe1 kwe1Var = (kwe1) obj;
        return this.a == kwe1Var.a && this.b == kwe1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Long.hashCode(this.a) * 31);
    }
}
