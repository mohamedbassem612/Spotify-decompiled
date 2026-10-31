package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l8d implements o8d {
    public final tom a;
    public final tom b;

    public l8d(tom tomVar, tom tomVar2) {
        this.a = tomVar;
        this.b = tomVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8d)) {
            return false;
        }
        l8d l8dVar = (l8d) obj;
        return u890.j(this.a, l8dVar.a) && u890.j(this.b, l8dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
