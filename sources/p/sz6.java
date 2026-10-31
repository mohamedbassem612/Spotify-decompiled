package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sz6 extends boo1 {
    public final String c;
    public final u37 d;

    public sz6(String str, u37 u37Var) {
        this.c = str;
        this.d = u37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz6)) {
            return false;
        }
        sz6 sz6Var = (sz6) obj;
        return u890.j(this.c, sz6Var.c) && this.d == sz6Var.d;
    }

    public final int hashCode() {
        String str = this.c;
        return this.d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public /* synthetic */ sz6(String str) {
        this(str, u37.b);
    }
}
