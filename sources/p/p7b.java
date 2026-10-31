package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p7b {
    public final String a;
    public final o7b b;

    public p7b(String str, o7b o7bVar) {
        this.a = str;
        this.b = o7bVar;
    }

    public final o7b a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7b)) {
            return false;
        }
        p7b p7bVar = (p7b) obj;
        return u890.j(this.a, p7bVar.a) && this.b.equals(p7bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
