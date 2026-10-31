package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jek implements ez00 {
    public final d7d a;
    public final String b;

    public jek(d7d d7dVar, String str) {
        this.a = d7dVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jek)) {
            return false;
        }
        jek jekVar = (jek) obj;
        return this.a.equals(jekVar.a) && u890.j(this.b, jekVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
