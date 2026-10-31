package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ndj0 extends jyo1 {
    public final String c;
    public final String d;

    public ndj0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndj0)) {
            return false;
        }
        ndj0 ndj0Var = (ndj0) obj;
        return u890.j(this.c, ndj0Var.c) && u890.j(this.d, ndj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
