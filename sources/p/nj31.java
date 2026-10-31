package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nj31 implements uj31 {
    public final String a;
    public final boolean b;

    public nj31(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj31)) {
            return false;
        }
        nj31 nj31Var = (nj31) obj;
        return this.a.equals(nj31Var.a) && this.b == nj31Var.b;
    }

    @Override // p.uj31
    public final String getPath() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
