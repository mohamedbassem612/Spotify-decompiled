package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y1z0 extends oho1 {
    public final String c;
    public final String d;

    public y1z0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1z0)) {
            return false;
        }
        y1z0 y1z0Var = (y1z0) obj;
        return u890.j(this.c, y1z0Var.c) && u890.j(this.d, y1z0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String v() {
        return this.c;
    }

    public final String w() {
        return this.d;
    }
}
