package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mn6 extends ujo1 {
    public final String c;
    public final tv80 d;

    public mn6(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn6)) {
            return false;
        }
        mn6 mn6Var = (mn6) obj;
        return u890.j(this.c, mn6Var.c) && u890.j(this.d, mn6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
