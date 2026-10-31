package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y3g {
    public final String a;
    public final String b;

    public y3g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3g)) {
            return false;
        }
        y3g y3gVar = (y3g) obj;
        return u890.j(this.a, y3gVar.a) && this.b.equals(y3gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
