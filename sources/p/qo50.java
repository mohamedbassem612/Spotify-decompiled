package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qo50 {
    public final boolean a;
    public final String b;
    public final List c;
    public final phx d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;

    public qo50(boolean z, String str, List list, phx phxVar, int i, boolean z2, boolean z3, boolean z4, int i2, boolean z5) {
        this.a = z;
        this.b = str;
        this.c = list;
        this.d = phxVar;
        this.e = i;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = i2;
        this.j = z5;
    }

    public static qo50 a(qo50 qo50Var, boolean z, String str, List list, phx phxVar, int i, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3) {
        if ((i3 & 1) != 0) {
            z = qo50Var.a;
        }
        boolean z6 = z;
        if ((i3 & 2) != 0) {
            str = qo50Var.b;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            list = qo50Var.c;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            phxVar = qo50Var.d;
        }
        return new qo50(z6, str2, list2, phxVar, (i3 & 16) != 0 ? qo50Var.e : i, (i3 & 32) != 0 ? qo50Var.f : z2, (i3 & 64) != 0 ? qo50Var.g : z3, (i3 & 128) != 0 ? qo50Var.h : z4, (i3 & 256) != 0 ? qo50Var.i : i2, (i3 & 512) != 0 ? qo50Var.j : z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo50)) {
            return false;
        }
        qo50 qo50Var = (qo50) obj;
        return this.a == qo50Var.a && u890.j(this.b, qo50Var.b) && u890.j(this.c, qo50Var.c) && u890.j(this.d, qo50Var.d) && this.e == qo50Var.e && this.f == qo50Var.f && this.g == qo50Var.g && this.h == qo50Var.h && this.i == qo50Var.i && this.j == qo50Var.j;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iB = f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        phx phxVar = this.d;
        return Boolean.hashCode(this.j) + kaa0.f(this.i, xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.e, (iB + (phxVar != null ? phxVar.hashCode() : 0)) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31);
    }
}
