package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pg8 extends byo1 {
    public final String c;
    public final of8 d;

    public pg8(String str, of8 of8Var) {
        this.c = str;
        this.d = of8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg8)) {
            return false;
        }
        pg8 pg8Var = (pg8) obj;
        return u890.j(this.c, pg8Var.c) && this.d.equals(pg8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
