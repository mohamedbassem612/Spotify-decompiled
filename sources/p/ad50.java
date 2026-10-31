package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ad50 {
    public final int a;
    public final long b;
    public final float c;

    public ad50(float f, long j, int i) {
        this.a = i;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad50)) {
            return false;
        }
        ad50 ad50Var = (ad50) obj;
        return this.a == ad50Var.a && this.b == ad50Var.b && Float.compare(this.c, ad50Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + cy30.f(Integer.hashCode(this.a) * 31, this.b, 31);
    }
}
