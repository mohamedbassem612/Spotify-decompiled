package p;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dpd implements fpd {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final qi51 e;
    public final yod f;
    public final int g;
    public final li51 h;
    public final hvc i;
    public final jpd j;

    public dpd(String str, List list, String str2, String str3, qi51 qi51Var, yod yodVar, int i, li51 li51Var, hvc hvcVar, jpd jpdVar) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = qi51Var;
        this.f = yodVar;
        this.g = i;
        this.h = li51Var;
        this.i = hvcVar;
        this.j = jpdVar;
    }

    public static dpd e(dpd dpdVar, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = dpdVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            list = dpdVar.b;
        }
        return new dpd(str2, list, dpdVar.c, dpdVar.d, dpdVar.e, dpdVar.f, dpdVar.g, dpdVar.h, dpdVar.i, dpdVar.j);
    }

    @Override // p.fpd
    public final jpd a() {
        return this.j;
    }

    @Override // p.fpd
    public final yod b() {
        return this.f;
    }

    @Override // p.fpd
    public final li51 c() {
        return this.h;
    }

    @Override // p.fpd
    public final hvc d() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpd)) {
            return false;
        }
        dpd dpdVar = (dpd) obj;
        return u890.j(this.a, dpdVar.a) && u890.j(this.b, dpdVar.b) && u890.j(this.c, dpdVar.c) && u890.j(this.d, dpdVar.d) && this.e == dpdVar.e && u890.j(this.f, dpdVar.f) && this.g == dpdVar.g && u890.j(this.h, dpdVar.h) && u890.j(this.i, dpdVar.i) && u890.j(this.j, dpdVar.j);
    }

    @Override // p.fpd
    public final String getId() {
        return this.d;
    }

    @Override // p.fpd
    public final List getItems() {
        return this.b;
    }

    @Override // p.fpd
    public final int getKind() {
        return this.g;
    }

    @Override // p.fpd
    public final String getTitle() {
        return this.a;
    }

    @Override // p.fpd
    public final String getUri() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        yod yodVar = this.f;
        int iK = ab80.k(this.g, (iHashCode2 + (yodVar == null ? 0 : yodVar.hashCode())) * 31, 31);
        li51 li51Var = this.h;
        int iHashCode3 = (iK + (li51Var == null ? 0 : li51Var.hashCode())) * 31;
        hvc hvcVar = this.i;
        int iHashCode4 = (iHashCode3 + (hvcVar == null ? 0 : hvcVar.hashCode())) * 31;
        jpd jpdVar = this.j;
        return iHashCode4 + (jpdVar != null ? jpdVar.hashCode() : 0);
    }

    @Override // p.fpd
    public final qi51 u() {
        return this.e;
    }

    public /* synthetic */ dpd(String str, AbstractList abstractList, int i) {
        this((i & 1) != 0 ? null : str, abstractList, null, null, qi51.a, null, 1, null, null, null);
    }
}
