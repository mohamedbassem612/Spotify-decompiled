package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g0g {
    public final String a;
    public final String b;

    public g0g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0g)) {
            return false;
        }
        g0g g0gVar = (g0g) obj;
        return this.a.equals(g0gVar.a) && this.b.equals(g0gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
