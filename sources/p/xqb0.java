package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xqb0 {
    public final a8b0 a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public xqb0(a8b0 a8b0Var, List list, ArrayList arrayList, List list2) {
        this.a = a8b0Var;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqb0)) {
            return false;
        }
        xqb0 xqb0Var = (xqb0) obj;
        return this.a.equals(xqb0Var.a) && this.b.equals(xqb0Var.b) && this.c.equals(xqb0Var.c) && this.d.equals(xqb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(p3d1.f(this.c, f4i1.b(this.a.hashCode() * 961, 31, this.b), 31), 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}
