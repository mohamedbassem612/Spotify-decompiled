package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j9d implements o9d {
    public final String a;
    public final long b;
    public final long c;
    public final i9d d;

    public j9d(String str, long j, long j2, i9d i9dVar) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i9dVar;
    }

    public final i9d a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9d)) {
            return false;
        }
        j9d j9dVar = (j9d) obj;
        return u890.j(this.a, j9dVar.a) && this.b == j9dVar.b && this.c == j9dVar.c && this.d.equals(j9dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}
