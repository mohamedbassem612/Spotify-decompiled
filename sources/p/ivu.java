package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ivu {
    public final h2v a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final xuu f;

    public ivu(h2v h2vVar, ArrayList arrayList, String str, String str2, String str3, xuu xuuVar) {
        this.a = h2vVar;
        this.b = arrayList;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = xuuVar;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }

    public final h2v d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivu)) {
            return false;
        }
        ivu ivuVar = (ivu) obj;
        return this.a.equals(ivuVar.a) && this.b.equals(ivuVar.b) && u890.j(this.c, ivuVar.c) && u890.j(this.d, ivuVar.d) && u890.j(this.e, ivuVar.e) && this.f == ivuVar.f;
    }

    public final int hashCode() {
        int iD = cy30.d(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
