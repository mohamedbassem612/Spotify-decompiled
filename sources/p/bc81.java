package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bc81 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    public bc81(String str, String str2, String str3, ArrayList arrayList, int i, int i2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = i;
        this.f = i2;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc81)) {
            return false;
        }
        bc81 bc81Var = (bc81) obj;
        return this.a.equals(bc81Var.a) && u890.j(this.b, bc81Var.b) && this.c.equals(bc81Var.c) && this.d.equals(bc81Var.d) && this.e == bc81Var.e && this.f == bc81Var.f && this.g.equals(bc81Var.g) && this.h.equals(bc81Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.h.hashCode() + cy30.d(kaa0.f(this.f, kaa0.f(this.e, p3d1.f(this.d, cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31), 31), 31), 31, this.g);
    }
}
