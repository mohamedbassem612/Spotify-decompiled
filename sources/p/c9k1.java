package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c9k1 extends d7p1 {
    public final String c;
    public final tv80 d;

    public c9k1(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9k1)) {
            return false;
        }
        c9k1 c9k1Var = (c9k1) obj;
        return this.c.equals(c9k1Var.c) && this.d.equals(c9k1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
