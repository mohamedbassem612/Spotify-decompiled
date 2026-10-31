package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y61 extends k4p1 {
    public final String c;
    public final String d;

    public y61(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y61)) {
            return false;
        }
        y61 y61Var = (y61) obj;
        return u890.j(this.c, y61Var.c) && u890.j(this.d, y61Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
