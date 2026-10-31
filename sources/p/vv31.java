package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vv31 implements aw31 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public vv31(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv31)) {
            return false;
        }
        vv31 vv31Var = (vv31) obj;
        return this.a == vv31Var.a && this.b.equals(vv31Var.b) && u890.j(this.c, vv31Var.c) && this.d == vv31Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final int p() {
        return this.a;
    }
}
