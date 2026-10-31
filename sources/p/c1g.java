package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c1g {
    public final String a;
    public final zzy b;

    public c1g(String str, zzy zzyVar) {
        this.a = str;
        this.b = zzyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        c1g c1gVar = (c1g) obj;
        return u890.j(this.a, c1gVar.a) && u890.j(this.b, c1gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
