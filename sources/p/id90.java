package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class id90 extends kd90 {
    public final boolean a;
    public final String b;
    public final x7i1 c;

    public id90(boolean z, String str, x7i1 x7i1Var) {
        this.a = z;
        this.b = str;
        this.c = x7i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id90)) {
            return false;
        }
        id90 id90Var = (id90) obj;
        return this.a == id90Var.a && u890.j(this.b, id90Var.b) && u890.j(this.c, id90Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        x7i1 x7i1Var = this.c;
        return iD + (x7i1Var == null ? 0 : x7i1Var.hashCode());
    }
}
