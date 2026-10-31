package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t5k {
    public final p5k a;
    public final int b;

    public t5k(p5k p5kVar, int i) {
        this.a = p5kVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5k)) {
            return false;
        }
        t5k t5kVar = (t5k) obj;
        return u890.j(this.a, t5kVar.a) && this.b == t5kVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
