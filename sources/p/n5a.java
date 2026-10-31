package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n5a implements p5a {
    public final Integer a;
    public final Integer b;
    public final h5a c;
    public final String d;
    public final Integer e;
    public final h5a f;
    public final List g;
    public final iu30 h;
    public final m5a i;

    public n5a(Integer num, h5a h5aVar, String str, Integer num2, clv clvVar, List list, iu30 iu30Var, m5a m5aVar, int i) {
        Integer num3 = (i & 1) != 0 ? null : 2131230952;
        num = (i & 4) != 0 ? null : num;
        h5aVar = (i & 8) != 0 ? null : h5aVar;
        str = (i & 16) != 0 ? null : str;
        num2 = (i & 32) != 0 ? null : num2;
        clvVar = (i & 64) != 0 ? null : clvVar;
        list = (i & 128) != 0 ? z6x.a : list;
        iu30Var = (i & 512) != 0 ? fr9.b1 : iu30Var;
        this.a = num3;
        this.b = num;
        this.c = h5aVar;
        this.d = str;
        this.e = num2;
        this.f = clvVar;
        this.g = list;
        this.h = iu30Var;
        this.i = m5aVar;
        if (num == null && h5aVar == null) {
            hhg1.n("A title is required for banners");
            throw null;
        }
    }

    public final List a() {
        return this.g;
    }

    public final Integer b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final h5a d() {
        return this.f;
    }

    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5a)) {
            return false;
        }
        n5a n5aVar = (n5a) obj;
        return u890.j(this.a, n5aVar.a) && u890.j(this.b, n5aVar.b) && u890.j(this.c, n5aVar.c) && u890.j(this.d, n5aVar.d) && u890.j(this.e, n5aVar.e) && u890.j(this.f, n5aVar.f) && this.g.equals(n5aVar.g) && this.h.equals(n5aVar.h) && this.i.equals(n5aVar.i);
    }

    public final m5a f() {
        return this.i;
    }

    public final h5a g() {
        return this.c;
    }

    public final Integer h() {
        return this.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 961;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        h5a h5aVar = this.c;
        int iHashCode3 = (iHashCode2 + (h5aVar == null ? 0 : h5aVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        h5a h5aVar2 = this.f;
        return this.i.hashCode() + ktd.g(this.h, xcg1.g(f4i1.b((iHashCode5 + (h5aVar2 != null ? h5aVar2.hashCode() : 0)) * 31, 31, this.g), 31, true), 31);
    }
}
