package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ta60 {
    public final String a;
    public final int b;
    public final fa60 c;
    public final ea60 d;
    public final la60 e;
    public final boolean f;
    public final List g;

    public ta60(String str, int i, fa60 fa60Var, ea60 ea60Var, la60 la60Var, boolean z, List list) {
        this.a = str;
        this.b = i;
        this.c = fa60Var;
        this.d = ea60Var;
        this.e = la60Var;
        this.f = z;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta60)) {
            return false;
        }
        ta60 ta60Var = (ta60) obj;
        return this.a.equals(ta60Var.a) && this.b == ta60Var.b && this.c.equals(ta60Var.c) && this.d.equals(ta60Var.d) && this.e.equals(ta60Var.e) && this.f == ta60Var.f && u890.j(this.g, ta60Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g((this.e.hashCode() + cy30.d((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d.a)) * 31, 31, this.f);
    }
}
