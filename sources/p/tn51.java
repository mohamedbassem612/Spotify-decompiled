package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tn51 implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;
    public final long d;
    public final long e;

    public tn51(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var, long j, long j2) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
        this.d = j;
        this.e = j2;
    }

    public final n900 a() {
        return this.c;
    }

    public final i3i0 b() {
        return this.a;
    }

    public final xcu0 c() {
        return this.b;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn51)) {
            return false;
        }
        tn51 tn51Var = (tn51) obj;
        return this.a.equals(tn51Var.a) && this.b.equals(tn51Var.b) && this.c.equals(tn51Var.c) && this.d == tn51Var.d && this.e == tn51Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }
}
