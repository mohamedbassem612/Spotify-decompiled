package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qup0 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final boolean f;
    public final fkt g;
    public final Float h;
    public final int i = 1;
    public final boolean j;

    public qup0(String str, String str2, List list, String str3, int i, boolean z, fkt fktVar, Float f, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = i;
        this.f = z;
        this.g = fktVar;
        this.h = f;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qup0)) {
            return false;
        }
        qup0 qup0Var = (qup0) obj;
        return u890.j(this.a, qup0Var.a) && u890.j(this.b, qup0Var.b) && this.c.equals(qup0Var.c) && u890.j(this.d, qup0Var.d) && this.e == qup0Var.e && this.f == qup0Var.f && this.g == qup0Var.g && this.h.equals(qup0Var.h) && this.i == qup0Var.i && this.j == qup0Var.j;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iB = f4i1.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        int iG = xcg1.g(ab80.k(this.e, (iB + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f);
        fkt fktVar = this.g;
        return Boolean.hashCode(this.j) + ab80.k(this.i, (this.h.hashCode() + ((iG + (fktVar != null ? fktVar.hashCode() : 0)) * 31)) * 961, 31);
    }
}
