package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b8d implements f8d {
    public final tom a;
    public final tom b;
    public final boolean c;

    public b8d(tom tomVar, tom tomVar2, boolean z) {
        this.a = tomVar;
        this.b = tomVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8d)) {
            return false;
        }
        b8d b8dVar = (b8d) obj;
        return this.a.equals(b8dVar.a) && this.b.equals(b8dVar.b) && this.c == b8dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
