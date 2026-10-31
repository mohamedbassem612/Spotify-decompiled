package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ci81 {
    public final hux a;
    public final Integer b;
    public final List c;
    public final boolean d;
    public final fi81 e;

    public ci81(bi81 bi81Var, fi81 fi81Var) {
        hh81 hh81Var = bi81Var.a;
        hux huxVar = hh81Var.a;
        Integer num = hh81Var.b;
        vrv0 vrv0Var = bi81Var.b;
        ArrayList arrayList = vrv0Var != null ? (ArrayList) vrv0Var.e : null;
        arrayList = arrayList == null ? z6x.a : arrayList;
        boolean z = vrv0Var != null;
        this.a = huxVar;
        this.b = num;
        this.c = arrayList;
        this.d = z;
        this.e = fi81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci81)) {
            return false;
        }
        ci81 ci81Var = (ci81) obj;
        return u890.j(this.a, ci81Var.a) && this.b.equals(ci81Var.b) && this.c.equals(ci81Var.c) && this.d == ci81Var.d && this.e.equals(ci81Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(f4i1.b(pze0.e(this.a.hashCode() * 961, 31, this.b), 31, this.c), 31, this.d);
    }
}
