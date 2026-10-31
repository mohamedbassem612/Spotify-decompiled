package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bke0 extends d9p1 {
    public final nhe0 c;
    public final String d;

    public bke0(nhe0 nhe0Var, String str) {
        this.c = nhe0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bke0)) {
            return false;
        }
        bke0 bke0Var = (bke0) obj;
        return u890.j(this.c, bke0Var.c) && u890.j(this.d, bke0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
