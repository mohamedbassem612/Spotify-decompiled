package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jfl {
    public final ArrayList a;
    public final ArrayList b;
    public final String c;
    public final int d;

    public jfl(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfl)) {
            return false;
        }
        jfl jflVar = (jfl) obj;
        return this.a.equals(jflVar.a) && this.b.equals(jflVar.b) && u890.j(this.c, jflVar.c) && this.d == jflVar.d;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.d;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }
}
