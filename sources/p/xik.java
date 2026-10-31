package p;

import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xik {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final String l;
    public final String m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f171p;
    public final boolean q;
    public final boolean r;
    public final Long s;
    public final wik t;
    public final boolean u;
    public final Integer v;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xik(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str8, String str9, boolean z, List list, boolean z2, Long l, wik wikVar, boolean z3, Integer num, int i) {
        String str10 = (i & 16) != 0 ? null : str5;
        String str11 = (i & 32) != 0 ? null : str6;
        String str12 = (i & 64) != 0 ? null : str7;
        int i2 = i & SemanticState.Focused;
        List list2 = z6x.a;
        this(str, str2, str3, str4, str10, str11, str12, i2 != 0 ? list2 : arrayList, (i & SemanticState.Hidden) != 0 ? list2 : arrayList2, (i & 512) != 0 ? list2 : arrayList3, (i & SemanticState.ReadOnly) != 0 ? list2 : arrayList4, str8, str9, (i & SemanticState.Multiline) != 0 ? false : z, false, (32768 & i) != 0 ? list2 : list, (65536 & i) == 0, (131072 & i) != 0 ? false : z2, (262144 & i) != 0 ? null : l, (524288 & i) != 0 ? null : wikVar, (1048576 & i) != 0 ? false : z3, (i & 2097152) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xik)) {
            return false;
        }
        xik xikVar = (xik) obj;
        return u890.j(this.a, xikVar.a) && u890.j(this.b, xikVar.b) && u890.j(this.c, xikVar.c) && u890.j(this.d, xikVar.d) && u890.j(this.e, xikVar.e) && u890.j(this.f, xikVar.f) && u890.j(this.g, xikVar.g) && u890.j(this.h, xikVar.h) && u890.j(this.i, xikVar.i) && u890.j(this.j, xikVar.j) && u890.j(this.k, xikVar.k) && u890.j(this.l, xikVar.l) && u890.j(this.m, xikVar.m) && this.n == xikVar.n && this.o == xikVar.o && u890.j(this.f171p, xikVar.f171p) && this.q == xikVar.q && this.r == xikVar.r && u890.j(this.s, xikVar.s) && u890.j(this.t, xikVar.t) && this.u == xikVar.u && u890.j(this.v, xikVar.v);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iG = xcg1.g(xcg1.g(f4i1.b(xcg1.g(xcg1.g(cy30.d(cy30.d(f4i1.b(f4i1.b(f4i1.b(f4i1.b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f171p), 31, this.q), 31, this.r);
        Long l = this.s;
        int iHashCode3 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        wik wikVar = this.t;
        int iG2 = xcg1.g((iHashCode3 + (wikVar == null ? 0 : wikVar.hashCode())) * 31, 31, this.u);
        Integer num = this.v;
        return iG2 + (num != null ? num.hashCode() : 0);
    }

    public xik(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, String str8, String str9, boolean z, boolean z2, List list5, boolean z3, boolean z4, Long l, wik wikVar, boolean z5, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = list4;
        this.l = str8;
        this.m = str9;
        this.n = z;
        this.o = z2;
        this.f171p = list5;
        this.q = z3;
        this.r = z4;
        this.s = l;
        this.t = wikVar;
        this.u = z5;
        this.v = num;
    }
}
