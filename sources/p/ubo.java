package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ubo extends wbo {
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;
    public final List e;
    public final String f;
    public final i2n g;
    public final d8r0 h;
    public final String i;
    public final int j;
    public final String k;

    public ubo(String str, String str2, c380 c380Var, String str3, List list, String str4, i2n i2nVar, d8r0 d8r0Var, String str5, int i, String str6) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
        this.e = list;
        this.f = str4;
        this.g = i2nVar;
        this.h = d8r0Var;
        this.i = str5;
        this.j = i;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubo)) {
            return false;
        }
        ubo uboVar = (ubo) obj;
        return u890.j(this.a, uboVar.a) && u890.j(this.b, uboVar.b) && u890.j(this.c, uboVar.c) && u890.j(this.d, uboVar.d) && u890.j(this.e, uboVar.e) && u890.j(this.f, uboVar.f) && u890.j(this.g, uboVar.g) && this.h.equals(uboVar.h) && u890.j(this.i, uboVar.i) && this.j == uboVar.j && u890.j(this.k, uboVar.k);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iF = kk0.f(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.d;
        int iHashCode2 = (iF + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        i2n i2nVar = this.g;
        return this.k.hashCode() + kaa0.f(this.j, cy30.d(hrt.i(this.h, (iHashCode4 + (i2nVar != null ? i2nVar.hashCode() : 0)) * 31, 31), 31, this.i), 31);
    }
}
