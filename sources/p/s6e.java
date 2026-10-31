package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s6e {
    public final r6e a;
    public final int b = 1;
    public final int c = 2;

    public s6e(r6e r6eVar) {
        this.a = r6eVar;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6e)) {
            return false;
        }
        s6e s6eVar = (s6e) obj;
        return this.a.equals(s6eVar.a) && obj2.equals(obj2) && this.b == s6eVar.b && this.c == s6eVar.c;
    }

    public final int hashCode() {
        Integer num = 3;
        return Boolean.hashCode(false) + ab80.k(this.c, ab80.k(this.b, (num.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
    }
}
