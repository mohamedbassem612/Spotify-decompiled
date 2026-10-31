package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class he9 extends je9 {
    public final String c;
    public final be9 d;
    public final String e;

    public he9(String str, be9 be9Var, String str2) {
        this.c = str;
        this.d = be9Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he9)) {
            return false;
        }
        he9 he9Var = (he9) obj;
        return u890.j(this.c, he9Var.c) && this.d.equals(he9Var.d) && this.e.equals(he9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final be9 n() {
        return this.d;
    }
}
