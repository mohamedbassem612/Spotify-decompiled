package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v7f {
    public final w7f a;
    public final w7f b;

    public v7f(w7f w7fVar, w7f w7fVar2) {
        this.a = w7fVar;
        this.b = w7fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7f)) {
            return false;
        }
        v7f v7fVar = (v7f) obj;
        return this.a.equals(v7fVar.a) && this.b.equals(v7fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
