package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oef1 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final fef1 e;
    public final String f;

    public oef1(String str, String str2, String str3, ArrayList arrayList, fef1 fef1Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = fef1Var;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oef1)) {
            return false;
        }
        oef1 oef1Var = (oef1) obj;
        return this.a.equals(oef1Var.a) && this.b.equals(oef1Var.b) && this.c.equals(oef1Var.c) && this.d.equals(oef1Var.d) && this.e.equals(oef1Var.e) && u890.j(this.f, oef1Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p3d1.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31;
        String str = this.f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
