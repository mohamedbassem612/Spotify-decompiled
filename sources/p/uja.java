package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uja {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public uja(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uja)) {
            return false;
        }
        uja ujaVar = (uja) obj;
        return this.a.equals(ujaVar.a) && this.b.equals(ujaVar.b) && u890.j(this.c, ujaVar.c) && u890.j(this.d, ujaVar.d);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
