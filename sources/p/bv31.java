package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bv31 implements bw31, ov31, vu31 {
    public final jh90 a;
    public final boolean b;
    public final String c;
    public final nv31 d;
    public final int e;

    public bv31(jh90 jh90Var, boolean z, nv31 nv31Var, int i) {
        String str = jh90Var.a;
        this.a = jh90Var;
        this.b = z;
        this.c = str;
        this.d = nv31Var;
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    public final nv31 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv31)) {
            return false;
        }
        bv31 bv31Var = (bv31) obj;
        return this.a.equals(bv31Var.a) && this.b == bv31Var.b && this.c.equals(bv31Var.c) && this.d.equals(bv31Var.d) && this.e == bv31Var.e;
    }

    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return l1d.C(this.e) + ((this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
