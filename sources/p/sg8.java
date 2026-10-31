package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sg8 extends byo1 {
    public final String c;
    public final String d;

    public sg8(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg8)) {
            return false;
        }
        sg8 sg8Var = (sg8) obj;
        return u890.j(this.c, sg8Var.c) && u890.j(this.d, sg8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 961);
    }
}
