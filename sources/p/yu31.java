package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yu31 implements bw31, ov31, vu31 {
    public final eh90 a;
    public final boolean b;
    public final String c;
    public final nv31 d;
    public final int e;

    public yu31(eh90 eh90Var, boolean z, nv31 nv31Var, int i) {
        String str = eh90Var.a;
        this.a = eh90Var;
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
        if (!(obj instanceof yu31)) {
            return false;
        }
        yu31 yu31Var = (yu31) obj;
        return this.a.equals(yu31Var.a) && this.b == yu31Var.b && this.c.equals(yu31Var.c) && this.d.equals(yu31Var.d) && this.e == yu31Var.e;
    }

    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return l1d.C(this.e) + ((this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
