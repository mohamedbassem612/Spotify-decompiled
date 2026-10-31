package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class klt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final zob1 f;
    public final plt g;
    public final ArrayList h;

    public klt(String str, String str2, String str3, String str4, String str5, zob1 zob1Var, plt pltVar, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = zob1Var;
        this.g = pltVar;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof klt) {
            klt kltVar = (klt) obj;
            if (u890.j(this.a, kltVar.a) && u890.j(this.b, kltVar.b) && u890.j(this.c, kltVar.c) && u890.j(this.d, kltVar.d) && u890.j(this.e, kltVar.e) && u890.j(this.f, kltVar.f) && this.g == kltVar.g && this.h.equals(kltVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.h.hashCode() + xcg1.g((this.g.hashCode() + ((this.f.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31)) * 31, 31, false);
    }
}
