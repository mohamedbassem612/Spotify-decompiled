package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c8d implements f8d {
    public final tom a;
    public final tom b;
    public final boolean c;

    public c8d(tom tomVar, tom tomVar2, boolean z) {
        this.a = tomVar;
        this.b = tomVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8d)) {
            return false;
        }
        c8d c8dVar = (c8d) obj;
        return this.a.equals(c8dVar.a) && this.b.equals(c8dVar.b) && this.c == c8dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
