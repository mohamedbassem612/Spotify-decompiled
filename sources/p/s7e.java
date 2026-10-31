package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s7e extends x7e {
    public final int a;
    public final kfe b;
    public final boolean c;

    public s7e(int i, kfe kfeVar, boolean z) {
        this.a = i;
        this.b = kfeVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7e)) {
            return false;
        }
        s7e s7eVar = (s7e) obj;
        return this.a == s7eVar.a && this.b == s7eVar.b && this.c == s7eVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
