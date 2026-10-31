package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class via0 extends qon1 {
    public final String c;
    public final String d;

    public via0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof via0)) {
            return false;
        }
        via0 via0Var = (via0) obj;
        return u890.j(this.c, via0Var.c) && u890.j(this.d, via0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return this.c + ':' + this.d;
    }
}
