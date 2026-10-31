package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sx01 implements ux01 {
    public final String a;
    public final int b;

    public sx01(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx01)) {
            return false;
        }
        sx01 sx01Var = (sx01) obj;
        return this.a.equals(sx01Var.a) && this.b == sx01Var.b;
    }

    @Override // p.ux01
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
