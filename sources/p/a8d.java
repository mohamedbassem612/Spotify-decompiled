package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a8d implements f8d {
    public final tom a;
    public final boolean b;

    public a8d(tom tomVar, boolean z) {
        this.a = tomVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8d)) {
            return false;
        }
        a8d a8dVar = (a8d) obj;
        return u890.j(this.a, a8dVar.a) && this.b == a8dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
