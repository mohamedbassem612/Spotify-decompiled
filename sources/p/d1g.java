package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d1g {
    public final String a;
    public final Boolean b;

    public d1g(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1g)) {
            return false;
        }
        d1g d1gVar = (d1g) obj;
        return u890.j(this.a, d1gVar.a) && u890.j(this.b, d1gVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
