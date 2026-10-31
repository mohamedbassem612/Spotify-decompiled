package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p7d implements v7d {
    public final String a;
    public final t7d b;

    public p7d(String str, t7d t7dVar) {
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
        if (!(obj instanceof p7d)) {
            return false;
        }
        p7d p7dVar = (p7d) obj;
        return u890.j(this.a, p7dVar.a) && this.b == p7dVar.b;
    }

    @Override // p.v7d
    public final t7d getStatus() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
