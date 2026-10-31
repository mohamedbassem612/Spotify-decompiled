package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zwg0 extends z0o1 {
    public final String c;
    public final String d;

    public zwg0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwg0)) {
            return false;
        }
        zwg0 zwg0Var = (zwg0) obj;
        return u890.j(this.c, zwg0Var.c) && u890.j(this.d, zwg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
