package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gt31 {
    public final vnb0 a;
    public final boolean b;
    public final boolean c;

    public gt31(vnb0 vnb0Var, boolean z, boolean z2) {
        this.a = vnb0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt31)) {
            return false;
        }
        gt31 gt31Var = (gt31) obj;
        return this.a == gt31Var.a && this.b == gt31Var.b && this.c == gt31Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.a);
        sb.append(", expandWidth=");
        sb.append(this.b);
        sb.append(", expandHeight=");
        return f4i1.g(sb, this.c, ')');
    }
}
