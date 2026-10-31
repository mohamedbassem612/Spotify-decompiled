package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class npy {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final mum1 d;
    public final boolean e;
    public final int f;

    public npy(boolean z, boolean z2, boolean z3, mum1 mum1Var, boolean z4, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = mum1Var;
        this.e = z4;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npy)) {
            return false;
        }
        npy npyVar = (npy) obj;
        return this.a == npyVar.a && this.b == npyVar.b && this.c == npyVar.c && this.d.equals(npyVar.d) && this.e == npyVar.e && this.f == npyVar.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + xcg1.g(f4i1.b(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d.a), 31, this.e);
    }
}
