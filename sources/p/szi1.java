package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class szi1 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public szi1(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szi1)) {
            return false;
        }
        szi1 szi1Var = (szi1) obj;
        return u890.j(this.a, szi1Var.a) && u890.j(this.b, szi1Var.b) && u890.j(this.c, szi1Var.c) && u890.j(this.d, szi1Var.d);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
