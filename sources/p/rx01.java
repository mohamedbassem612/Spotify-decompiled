package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rx01 implements ux01 {
    public final String a;
    public final int b;
    public final vpb1 c;

    public rx01(String str, int i, vpb1 vpb1Var) {
        this.a = str;
        this.b = i;
        this.c = vpb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx01)) {
            return false;
        }
        rx01 rx01Var = (rx01) obj;
        return u890.j(this.a, rx01Var.a) && this.b == rx01Var.b && u890.j(this.c, rx01Var.c);
    }

    @Override // p.ux01
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }

    public /* synthetic */ rx01(String str, int i) {
        this(str, i, eoy.f);
    }
}
