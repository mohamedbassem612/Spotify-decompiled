package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fv2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final boolean f;
    public final Boolean g;
    public final String h;

    /* JADX WARN: Multi-variable type inference failed */
    public fv2(String str, String str2, String str3, String str4, ArrayList arrayList, int i, Boolean bool, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = i;
        this.g = bool;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv2)) {
            return false;
        }
        fv2 fv2Var = (fv2) obj;
        return this.a.equals(fv2Var.a) && u890.j(this.b, fv2Var.b) && this.c.equals(fv2Var.c) && this.d.equals(fv2Var.d) && this.e.equals(fv2Var.e) && this.f == fv2Var.f && u890.j(this.g, fv2Var.g) && u890.j(this.h, fv2Var.h);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.f ? 1 : 0, p3d1.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
        Boolean bool = this.g;
        int iHashCode = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
