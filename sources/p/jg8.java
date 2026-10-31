package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jg8 extends byo1 {
    public final String c;
    public final String d;

    public jg8(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg8)) {
            return false;
        }
        jg8 jg8Var = (jg8) obj;
        return u890.j(this.c, jg8Var.c) && u890.j(this.d, jg8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
