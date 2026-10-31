package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bt60 extends jto1 {
    public final String b;
    public final int c;

    public bt60(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt60)) {
            return false;
        }
        bt60 bt60Var = (bt60) obj;
        return u890.j(this.b, bt60Var.b) && this.c == bt60Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + (this.b.hashCode() * 31);
    }
}
