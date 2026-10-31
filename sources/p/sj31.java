package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sj31 implements uj31 {
    public final String a;
    public final String b;

    public sj31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj31)) {
            return false;
        }
        sj31 sj31Var = (sj31) obj;
        return this.a.equals(sj31Var.a) && this.b.equals(sj31Var.b);
    }

    @Override // p.uj31
    public final String getPath() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
