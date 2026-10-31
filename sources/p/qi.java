package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qi implements hi {
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final Boolean g;
    public final axo1 h;
    public final cn70 i;

    public /* synthetic */ qi(String str, String str2, String str3, int i, List list, Boolean bool, ii iiVar, cn70 cn70Var, int i2) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, i, (i2 & 16) != 0 ? z6x.a : list, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? ji.b : iiVar, cn70Var);
    }

    public static qi c(qi qiVar, String str, String str2, String str3, List list, Boolean bool, axo1 axo1Var, cn70 cn70Var, int i) {
        if ((i & 1) != 0) {
            str = qiVar.b;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = qiVar.c;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = qiVar.d;
        }
        String str6 = str3;
        int i2 = qiVar.e;
        if ((i & 16) != 0) {
            list = qiVar.f;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            bool = qiVar.g;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            axo1Var = qiVar.h;
        }
        axo1 axo1Var2 = axo1Var;
        cn70 cn70Var2 = (i & 128) != 0 ? qiVar.i : cn70Var;
        qiVar.getClass();
        return new qi(str4, str5, str6, i2, list2, bool2, axo1Var2, cn70Var2);
    }

    public final String b() {
        String str = this.c;
        return str == null ? this.b : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) obj;
        return u890.j(this.b, qiVar.b) && u890.j(this.c, qiVar.c) && u890.j(this.d, qiVar.d) && this.e == qiVar.e && u890.j(this.f, qiVar.f) && u890.j(this.g, qiVar.g) && u890.j(this.h, qiVar.h) && u890.j(this.i, qiVar.i);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iB = f4i1.b(ab80.k(this.e, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f);
        Boolean bool = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((iB + (bool != null ? bool.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = gvg.n("AccessoryImpl(name=", this.b, ", alias=", this.c, ", accessoryClass=");
        sbN.append(this.d);
        sbN.append(", transportType=");
        sbN.append(xcg1.p(this.e));
        sbN.append(", supportedFeatures=");
        sbN.append(this.f);
        sbN.append(", activeAudioRoute=");
        sbN.append(this.g);
        sbN.append(", categorizationStatus=");
        sbN.append(this.h);
        sbN.append(", identifier=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }

    public qi(String str, String str2, String str3, int i, List list, Boolean bool, axo1 axo1Var, cn70 cn70Var) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = list;
        this.g = bool;
        this.h = axo1Var;
        this.i = cn70Var;
    }
}
