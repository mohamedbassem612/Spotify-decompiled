package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g1x extends h1x {
    public final int a;
    public final int b;

    public g1x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1x)) {
            return false;
        }
        g1x g1xVar = (g1x) obj;
        return this.a == g1xVar.a && this.b == g1xVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
