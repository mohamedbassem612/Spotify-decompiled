package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z5k extends a6k {
    public final p5k a;
    public final int b;

    public z5k(p5k p5kVar, int i) {
        this.a = p5kVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5k)) {
            return false;
        }
        z5k z5kVar = (z5k) obj;
        return u890.j(this.a, z5kVar.a) && this.b == z5kVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
