package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class emt0 implements l9c, rnt0 {
    public final String a;
    public final k3h1 b;
    public final lnt0 c;
    public final String d;
    public final x360 e;

    public emt0(String str, k3h1 k3h1Var, lnt0 lnt0Var, String str2, x360 x360Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = lnt0Var;
        this.d = str2;
        this.e = x360Var;
    }

    public final lnt0 a() {
        return this.c;
    }

    public final x360 b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final op80 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emt0)) {
            return false;
        }
        emt0 emt0Var = (emt0) obj;
        return this.a.equals(emt0Var.a) && this.b.equals(emt0Var.b) && this.c.equals(emt0Var.c) && this.d.equals(emt0Var.d) && u890.j(this.e, emt0Var.e);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d((this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        x360 x360Var = this.e;
        return iD + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
