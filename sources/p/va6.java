package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class va6 {
    public final boolean a;
    public final int b;
    public final String c;
    public final ArrayList d;
    public final za6 e;

    public va6(boolean z, int i, String str, ArrayList arrayList, za6 za6Var) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = arrayList;
        this.e = za6Var;
    }

    public final ab6 a(String str) {
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        for (Object obj3 : this.d) {
            if (((ab6) obj3).a.equals(str)) {
                if (z) {
                    return (ab6) obj;
                }
                z = true;
                obj2 = obj3;
            }
        }
        if (z) {
            obj = obj2;
        }
        return (ab6) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va6)) {
            return false;
        }
        va6 va6Var = (va6) obj;
        return this.a == va6Var.a && this.b == va6Var.b && u890.j(this.c, va6Var.c) && this.d.equals(va6Var.d) && u890.j(this.e, va6Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, Boolean.hashCode(this.a) * 31, 31);
        String str = this.c;
        int iF = p3d1.f(this.d, (iK + (str == null ? 0 : str.hashCode())) * 31, 31);
        za6 za6Var = this.e;
        return iF + (za6Var != null ? za6Var.hashCode() : 0);
    }
}
