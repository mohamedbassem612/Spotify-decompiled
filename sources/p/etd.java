package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class etd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final rbc g;
    public final String h;
    public final boolean i;

    public /* synthetic */ etd(String str, String str2, String str3, String str4, List list, String str5, String str6, int i) {
        this(str, str2, str3, str4, (i & 16) != 0 ? z6x.a : list, str5, (i & 128) != 0 ? null : str6, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etd)) {
            return false;
        }
        etd etdVar = (etd) obj;
        return u890.j(this.a, etdVar.a) && u890.j(this.b, etdVar.b) && u890.j(this.c, etdVar.c) && u890.j(this.d, etdVar.d) && u890.j(this.e, etdVar.e) && u890.j(this.f, etdVar.f) && u890.j(this.g, etdVar.g) && u890.j(this.h, etdVar.h) && this.i == etdVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + cy30.d(f4i1.b(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31;
        String str = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public etd(String str, String str2, String str3, String str4, List list, String str5, String str6, boolean z) {
        rbc rbcVar = rbc.P0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
        this.g = rbcVar;
        this.h = str6;
        this.i = z;
    }
}
