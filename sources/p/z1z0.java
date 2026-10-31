package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z1z0 extends oho1 {
    public final String c;
    public final String d;

    public z1z0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1z0)) {
            return false;
        }
        z1z0 z1z0Var = (z1z0) obj;
        return u890.j(this.c, z1z0Var.c) && u890.j(this.d, z1z0Var.d);
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
