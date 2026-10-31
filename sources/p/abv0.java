package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class abv0 implements gbv0 {
    public final int a;
    public final boolean b;

    public abv0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // p.gbv0
    public final boolean a() {
        return this.b;
    }

    @Override // p.gbv0
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abv0)) {
            return false;
        }
        abv0 abv0Var = (abv0) obj;
        return this.a == abv0Var.a && this.b == abv0Var.b;
    }

    public final int hashCode() {
        int i = this.a;
        return Boolean.hashCode(this.b) + ((i == 0 ? 0 : l1d.C(i)) * 31);
    }
}
