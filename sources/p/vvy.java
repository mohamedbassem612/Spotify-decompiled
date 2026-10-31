package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vvy {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final boolean d;
    public final String e;

    public vvy(String str, String str2, String str3, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvy)) {
            return false;
        }
        vvy vvyVar = (vvy) obj;
        return this.a.equals(vvyVar.a) && this.b.equals(vvyVar.b) && u890.j(this.c, vvyVar.c) && this.d == vvyVar.d && u890.j(this.e, vvyVar.e);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iG = xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
