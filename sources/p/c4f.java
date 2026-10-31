package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c4f implements d4f {
    public final int a;
    public final int b;

    public c4f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4f)) {
            return false;
        }
        c4f c4fVar = (c4f) obj;
        return this.a == c4fVar.a && this.b == c4fVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
