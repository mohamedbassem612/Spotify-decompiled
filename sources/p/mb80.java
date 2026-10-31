package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mb80 {
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final ArrayList e;
    public final String f;
    public final String g;

    public mb80(String str, String str2, List list, int i, ArrayList arrayList, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = arrayList;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb80)) {
            return false;
        }
        mb80 mb80Var = (mb80) obj;
        return this.a.equals(mb80Var.a) && this.b.equals(mb80Var.b) && this.c.equals(mb80Var.c) && this.d == mb80Var.d && this.e.equals(mb80Var.e) && this.f.equals(mb80Var.f) && this.g.equals(mb80Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(p3d1.f(this.e, ab80.k(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
    }
}
