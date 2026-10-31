package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hr2 {
    public final ArrayList a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public hr2(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr2)) {
            return false;
        }
        hr2 hr2Var = (hr2) obj;
        return this.a.equals(hr2Var.a) && this.b.equals(hr2Var.b) && u890.j(this.c, hr2Var.c) && u890.j(this.d, hr2Var.d);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
