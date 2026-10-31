package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ic40 extends k1u {
    public final String f;
    public final String g;
    public final tr80 h;
    public final ArrayList i;
    public final boolean j;
    public final String k;

    public ic40(String str, String str2, tr80 tr80Var, ArrayList arrayList, boolean z, String str3) {
        this.f = str;
        this.g = str2;
        this.h = tr80Var;
        this.i = arrayList;
        this.j = z;
        this.k = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic40)) {
            return false;
        }
        ic40 ic40Var = (ic40) obj;
        return this.f.equals(ic40Var.f) && this.g.equals(ic40Var.g) && this.h.equals(ic40Var.h) && this.i.equals(ic40Var.i) && this.j == ic40Var.j && this.k.equals(ic40Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + xcg1.g(p3d1.f(this.i, lf51.e(cy30.d(this.f.hashCode() * 31, 31, this.g), 31, this.h), 31), 31, this.j);
    }
}
