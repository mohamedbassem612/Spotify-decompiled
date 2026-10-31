package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ue6 {
    public final xb2 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final String e;

    public ue6(xb2 xb2Var, ArrayList arrayList, int i, int i2, String str) {
        this.a = xb2Var;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ue6) {
            ue6 ue6Var = (ue6) obj;
            if (this.a == ue6Var.a && this.b.equals(ue6Var.b) && this.c == ue6Var.c && this.d == ue6Var.d && this.e.equals(ue6Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        int i = this.c;
        int iC = (iF + (i == 0 ? 0 : l1d.C(i))) * 31;
        int i2 = this.d;
        return this.e.hashCode() + ((iC + (i2 != 0 ? l1d.C(i2) : 0)) * 31);
    }
}
