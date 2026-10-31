package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s7d implements v7d {
    public final String a;
    public final t7d b;
    public final String c;

    public s7d(String str, t7d t7dVar, String str2) {
        this.a = str;
        this.b = t7dVar;
        this.c = str2;
    }

    @Override // p.v7d
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7d)) {
            return false;
        }
        s7d s7dVar = (s7d) obj;
        return u890.j(this.a, s7dVar.a) && this.b == s7dVar.b && this.c.equals(s7dVar.c);
    }

    @Override // p.v7d
    public final t7d getStatus() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
