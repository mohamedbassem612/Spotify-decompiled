package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hbo {
    public final String a;
    public final obo b;

    public hbo(String str, obo oboVar) {
        this.a = str;
        this.b = oboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbo)) {
            return false;
        }
        hbo hboVar = (hbo) obj;
        return u890.j(this.a, hboVar.a) && this.b.equals(hboVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
