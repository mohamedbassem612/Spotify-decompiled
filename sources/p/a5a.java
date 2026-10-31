package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a5a {
    public final String a;
    public final String b;

    public a5a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5a)) {
            return false;
        }
        a5a a5aVar = (a5a) obj;
        return this.a.equals(a5aVar.a) && this.b.equals(a5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
