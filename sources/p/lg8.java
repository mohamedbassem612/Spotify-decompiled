package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lg8 extends byo1 {
    public final String c;
    public final String d;

    public lg8(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg8)) {
            return false;
        }
        lg8 lg8Var = (lg8) obj;
        return u890.j(this.c, lg8Var.c) && u890.j(this.d, lg8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
