package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u0d {
    public final int a;
    public final t0d b;

    public u0d(int i, t0d t0dVar) {
        this.a = i;
        this.b = t0dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0d)) {
            return false;
        }
        u0d u0dVar = (u0d) obj;
        return this.a == u0dVar.a && this.b == u0dVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
