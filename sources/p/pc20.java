package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pc20 {
    public final String a;
    public final String b;
    public final oc20 c;
    public final int d;
    public final String e;
    public final gyh f;
    public final boolean g;
    public final l651 h;

    public pc20(String str, String str2, oc20 oc20Var, int i, String str3, gyh gyhVar, boolean z, l651 l651Var) {
        this.a = str;
        this.b = str2;
        this.c = oc20Var;
        this.d = i;
        this.e = str3;
        this.f = gyhVar;
        this.g = z;
        this.h = l651Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc20)) {
            return false;
        }
        pc20 pc20Var = (pc20) obj;
        return this.a.equals(pc20Var.a) && u890.j(this.b, pc20Var.b) && this.c.equals(pc20Var.c) && this.d == pc20Var.d && u890.j(this.e, pc20Var.e) && this.f == pc20Var.f && this.g == pc20Var.g && this.h == pc20Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g((this.f.hashCode() + cy30.d(kaa0.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e)) * 31, 31, this.g);
    }
}
