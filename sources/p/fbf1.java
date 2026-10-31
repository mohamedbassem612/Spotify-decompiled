package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fbf1 {
    public final String a;
    public final gsc1 b;
    public final List c;
    public final String d;
    public final boolean e;

    public fbf1(String str, gsc1 gsc1Var, List list, String str2, boolean z) {
        this.a = str;
        this.b = gsc1Var;
        this.c = list;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fbf1) {
            fbf1 fbf1Var = (fbf1) obj;
            if (this.a.equals(fbf1Var.a) && this.b == fbf1Var.b && u890.j(this.c, fbf1Var.c) && this.d.equals(fbf1Var.d) && this.e == fbf1Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
