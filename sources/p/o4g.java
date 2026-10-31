package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o4g {
    public final String a;
    public final String b;

    public o4g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4g)) {
            return false;
        }
        o4g o4gVar = (o4g) obj;
        return u890.j(this.a, o4gVar.a) && u890.j(this.b, o4gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
