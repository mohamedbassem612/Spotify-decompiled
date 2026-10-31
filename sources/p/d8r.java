package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d8r {
    public final String a;
    public final long b;

    public d8r(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8r)) {
            return false;
        }
        d8r d8rVar = (d8r) obj;
        if (!this.a.equals(d8rVar.a)) {
            return false;
        }
        long j = d8rVar.b;
        int i = u7h.l;
        if (!z4h1.b(this.b, j)) {
            return false;
        }
        gra graVar = een.f;
        return graVar.equals(graVar);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Float.hashCode(-1.0f) + (Float.hashCode(1.0f) * 31) + cy30.f(iHashCode, this.b, 31);
    }
}
