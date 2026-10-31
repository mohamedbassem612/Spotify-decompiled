package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k8d implements o8d {
    public final tom a;
    public final tom b;

    public k8d(tom tomVar, tom tomVar2) {
        this.a = tomVar;
        this.b = tomVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8d)) {
            return false;
        }
        k8d k8dVar = (k8d) obj;
        return u890.j(this.a, k8dVar.a) && u890.j(this.b, k8dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
