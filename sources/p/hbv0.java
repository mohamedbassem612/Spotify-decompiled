package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hbv0 implements gbv0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public hbv0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
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
        if (!(obj instanceof hbv0)) {
            return false;
        }
        hbv0 hbv0Var = (hbv0) obj;
        return this.a == hbv0Var.a && this.b == hbv0Var.b && this.c == hbv0Var.c;
    }

    public final int hashCode() {
        int i = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((i == 0 ? 0 : l1d.C(i)) * 31, 31, this.b);
    }
}
