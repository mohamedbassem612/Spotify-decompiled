package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pj31 implements uj31 {
    public final String a;
    public final String b;

    public pj31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj31)) {
            return false;
        }
        pj31 pj31Var = (pj31) obj;
        return this.a.equals(pj31Var.a) && this.b.equals(pj31Var.b);
    }

    @Override // p.uj31
    public final String getPath() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
