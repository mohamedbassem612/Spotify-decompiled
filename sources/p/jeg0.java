package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jeg0 {
    public final a0g a;
    public final boolean b;

    public jeg0(a0g a0gVar, boolean z) {
        this.a = a0gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeg0)) {
            return false;
        }
        jeg0 jeg0Var = (jeg0) obj;
        return this.a.equals(jeg0Var.a) && this.b == jeg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
