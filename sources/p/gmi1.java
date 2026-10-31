package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gmi1 implements xmi1 {
    public final String a;
    public final nd90 b;

    public gmi1(String str, nd90 nd90Var) {
        this.a = str;
        this.b = nd90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmi1)) {
            return false;
        }
        gmi1 gmi1Var = (gmi1) obj;
        return u890.j(this.a, gmi1Var.a) && this.b == gmi1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
