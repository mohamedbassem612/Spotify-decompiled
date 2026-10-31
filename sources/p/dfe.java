package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dfe {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public dfe(boolean z, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfe)) {
            return false;
        }
        dfe dfeVar = (dfe) obj;
        return this.a == dfeVar.a && this.b == dfeVar.b && this.c == dfeVar.c && this.d == dfeVar.d && this.e == dfeVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        boolean z = this.e;
        StringBuilder sbQ = cy30.q(i, i2, "Change(preStart=", ", preEnd=", ", originalStart=");
        ktd.p(i3, i4, ", originalEnd=", ", isFromHardwareSource=", sbQ);
        return l1d.r(sbQ, z, ")");
    }
}
