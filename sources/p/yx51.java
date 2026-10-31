package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yx51 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final int d;
    public final int e;
    public final d061 f;
    public final List g;

    public yx51(String str, String str2, ArrayList arrayList, int i, int i2, d061 d061Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
        this.f = d061Var;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx51)) {
            return false;
        }
        yx51 yx51Var = (yx51) obj;
        return u890.j(this.a, yx51Var.a) && u890.j(this.b, yx51Var.b) && this.c.equals(yx51Var.c) && this.d == yx51Var.d && this.e == yx51Var.e && this.f.equals(yx51Var.f) && this.g.equals(yx51Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + kaa0.f(200, kaa0.f(5, (this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31)) * 31, 31), 31);
    }
}
