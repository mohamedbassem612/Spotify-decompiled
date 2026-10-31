package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r7d implements v7d {
    public final String a;
    public final t7d b;

    public r7d(String str, t7d t7dVar) {
        this.a = str;
        this.b = t7dVar;
    }

    @Override // p.v7d
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7d)) {
            return false;
        }
        r7d r7dVar = (r7d) obj;
        return u890.j(this.a, r7dVar.a) && this.b == r7dVar.b;
    }

    @Override // p.v7d
    public final t7d getStatus() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
