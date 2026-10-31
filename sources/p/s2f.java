package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s2f implements q3f {
    public final String a;
    public final String b;

    public s2f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2f)) {
            return false;
        }
        s2f s2fVar = (s2f) obj;
        return u890.j(this.a, s2fVar.a) && u890.j(this.b, s2fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
