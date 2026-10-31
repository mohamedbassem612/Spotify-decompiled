package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ad7 extends fqo1 {
    public final String e;
    public final String f;
    public final boolean g;
    public final r620 h;
    public final List i;
    public final List j;

    public ad7(String str, String str2, boolean z, r620 r620Var, List list, List list2) {
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = r620Var;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad7)) {
            return false;
        }
        ad7 ad7Var = (ad7) obj;
        return u890.j(this.e, ad7Var.e) && u890.j(this.f, ad7Var.f) && this.g == ad7Var.g && this.h == ad7Var.h && u890.j(this.i, ad7Var.i) && u890.j(this.j, ad7Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + f4i1.b((this.h.hashCode() + xcg1.g(cy30.d(this.e.hashCode() * 31, 31, this.f), 31, this.g)) * 31, 31, this.i);
    }
}
