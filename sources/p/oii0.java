package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oii0 {
    public final String a;
    public final String b;
    public final String c;
    public final x360 d;
    public final ArrayList e;
    public final n1x f;
    public final String g;

    public oii0(String str, String str2, String str3, x360 x360Var, ArrayList arrayList, n1x n1xVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = x360Var;
        this.e = arrayList;
        this.f = n1xVar;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oii0)) {
            return false;
        }
        oii0 oii0Var = (oii0) obj;
        return this.a.equals(oii0Var.a) && this.b.equals(oii0Var.b) && this.c.equals(oii0Var.c) && u890.j(this.d, oii0Var.d) && this.e.equals(oii0Var.e) && u890.j(this.f, oii0Var.f) && u890.j(this.g, oii0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        x360 x360Var = this.d;
        int iF = p3d1.f(this.e, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
        n1x n1xVar = this.f;
        int iHashCode = (iF + (n1xVar == null ? 0 : n1xVar.hashCode())) * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
