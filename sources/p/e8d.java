package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e8d implements f8d {
    public final tom a;
    public final boolean b;

    public e8d(tom tomVar, boolean z) {
        this.a = tomVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8d)) {
            return false;
        }
        e8d e8dVar = (e8d) obj;
        return u890.j(this.a, e8dVar.a) && this.b == e8dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
