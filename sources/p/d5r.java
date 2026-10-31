package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d5r {
    public final String a;
    public final String b;

    public d5r(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5r)) {
            return false;
        }
        d5r d5rVar = (d5r) obj;
        return u890.j(this.a, d5rVar.a) && this.b.equals(d5rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
