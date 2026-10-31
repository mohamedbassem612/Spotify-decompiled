package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ggw implements pgw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final int g;
    public final ArrayList h;
    public final String i;
    public final ArrayList j;

    public ggw(String str, String str2, String str3, String str4, boolean z, String str5, int i, ArrayList arrayList, String str6, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = i;
        this.h = arrayList;
        this.i = str6;
        this.j = arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this != obj) {
            if (obj instanceof ggw) {
                ggw ggwVar = (ggw) obj;
                String str = ggwVar.a;
                String str2 = this.a;
                if (str2 == null) {
                    if (str == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (str == null) {
                    zEquals = false;
                } else {
                    nl7 nl7Var = dyf.b;
                    zEquals = str2.equals(str);
                }
                if (zEquals && u890.j(this.b, ggwVar.b) && u890.j(this.c, ggwVar.c) && u890.j(this.d, ggwVar.d) && this.e == ggwVar.e) {
                    String str3 = ggwVar.f;
                    String str4 = this.f;
                    if (str4 == null) {
                        if (str3 == null) {
                            zEquals2 = true;
                        } else {
                            zEquals2 = false;
                        }
                    } else if (str3 == null) {
                        zEquals2 = false;
                    } else {
                        zEquals2 = str4.equals(str3);
                    }
                    if (zEquals2 && this.g == ggwVar.g && this.h.equals(ggwVar.h) && u890.j(this.i, ggwVar.i) && this.j.equals(ggwVar.j)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        String str = this.a;
        if (str == null) {
            iHashCode = 0;
        } else {
            nl7 nl7Var = dyf.b;
            iHashCode = str.hashCode();
        }
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(iHashCode * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str2 = this.f;
        return this.j.hashCode() + cy30.d(p3d1.f(this.h, kaa0.f(this.g, (iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 961), 31, this.i);
    }
}
