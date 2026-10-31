package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q0u0 implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;
    public final String d;
    public final String e;
    public final String f;

    public q0u0(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var, String str, String str2, String str3) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final n900 a() {
        return this.c;
    }

    public final i3i0 b() {
        return this.a;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final xcu0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0u0)) {
            return false;
        }
        q0u0 q0u0Var = (q0u0) obj;
        return this.a.equals(q0u0Var.a) && this.b.equals(q0u0Var.b) && this.c.equals(q0u0Var.c) && this.d.equals(q0u0Var.d) && this.e.equals(q0u0Var.e) && this.f.equals(q0u0Var.f);
    }

    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }
}
