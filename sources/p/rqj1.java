package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rqj1 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public /* synthetic */ rqj1(int i, boolean z) {
        this((i & 4) != 0 ? "" : "watch-feed-entity-explorer-button", false, (i & 2) != 0 ? false : z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqj1)) {
            return false;
        }
        rqj1 rqj1Var = (rqj1) obj;
        return this.a == rqj1Var.a && this.b == rqj1Var.b && u890.j(this.c, rqj1Var.c) && this.d == rqj1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public rqj1(String str, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
    }
}
