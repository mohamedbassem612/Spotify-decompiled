package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vof1 {
    public final jo70 a;
    public final mtl b;
    public final boolean c;
    public final jo70 d;

    public vof1(jo70 jo70Var, mtl mtlVar, boolean z, jo70 jo70Var2) {
        this.a = jo70Var;
        this.b = mtlVar;
        this.c = z;
        this.d = jo70Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vof1)) {
            return false;
        }
        vof1 vof1Var = (vof1) obj;
        return this.a.equals(vof1Var.a) && this.b.equals(vof1Var.b) && this.c == vof1Var.c && this.d.equals(vof1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
