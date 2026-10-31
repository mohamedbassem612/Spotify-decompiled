package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ss70 implements h020 {
    public final oq70 a;
    public final boolean b;
    public final int c;

    public ss70(oq70 oq70Var, boolean z, int i) {
        this.a = oq70Var;
        this.b = z;
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final oq70 b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss70)) {
            return false;
        }
        ss70 ss70Var = (ss70) obj;
        return this.a.equals(ss70Var.a) && this.b == ss70Var.b && this.c == ss70Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + eqq.y(this.c) + ')';
    }
}
