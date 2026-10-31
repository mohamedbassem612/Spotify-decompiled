package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xrd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final vex0 e;
    public final ArrayList f;
    public final ArrayList g;

    public xrd(String str, String str2, String str3, String str4, vex0 vex0Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = vex0Var;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrd)) {
            return false;
        }
        xrd xrdVar = (xrd) obj;
        return this.a.equals(xrdVar.a) && this.b.equals(xrdVar.b) && this.c.equals(xrdVar.c) && this.d.equals(xrdVar.d) && this.e.equals(xrdVar.e) && this.f.equals(xrdVar.f) && this.g.equals(xrdVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + p3d1.f(this.f, (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31);
    }
}
