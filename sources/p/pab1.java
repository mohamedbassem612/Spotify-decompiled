package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pab1 implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;
    public final int d;

    public pab1(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var, int i) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final n900 b() {
        return this.c;
    }

    public final i3i0 c() {
        return this.a;
    }

    public final xcu0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pab1)) {
            return false;
        }
        pab1 pab1Var = (pab1) obj;
        return this.a.equals(pab1Var.a) && this.b.equals(pab1Var.b) && this.c.equals(pab1Var.c) && this.d == pab1Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
