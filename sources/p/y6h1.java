package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y6h1 implements eri1, Serializable {
    public static final y6h1 i = new y6h1("", "", "", k4p1.x(a7h1.f), false, "", "");
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;
    public final String f;
    public final String g;
    public final a7h1 h;

    public y6h1(String str, String str2, String str3, List list, boolean z, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
        this.f = str4;
        this.g = str5;
        this.h = (a7h1) o7h.q0(list);
    }

    @Override // p.eri1
    public final List a() {
        ArrayList arrayListR = gxo1.r(this.d);
        a7h1 a7h1Var = this.h;
        int length = a7h1Var.a.length();
        String str = this.c;
        if (length > 0 && str.length() > 0 && arrayListR.isEmpty()) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayListR);
        if (a7h1Var.a.length() == 0) {
            arrayList.add("spec id is empty");
        }
        if (str.length() == 0) {
            arrayList.add("app is empty");
        }
        return arrayList;
    }

    public final List b() {
        List list = this.d;
        return list.subList(1, list.size());
    }

    public final x6h1 c() {
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = this.c;
        x6h1VarI.g = this.b;
        a7h1 a7h1Var = this.h;
        x6h1VarI.a = a7h1Var.a;
        x6h1VarI.f = this.a;
        x6h1VarI.b = a7h1Var.b;
        x6h1VarI.d = a7h1Var.c;
        x6h1VarI.c = a7h1Var.d;
        x6h1VarI.e = a7h1Var.e;
        List listB = b();
        ArrayList arrayList = x6h1VarI.i;
        arrayList.clear();
        arrayList.addAll(listB);
        x6h1VarI.j = this.e;
        x6h1VarI.k = this.f;
        x6h1VarI.l = this.g;
        return x6h1VarI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !y6h1.class.equals(obj.getClass())) {
            return false;
        }
        y6h1 y6h1Var = (y6h1) obj;
        if (this.a.equals(y6h1Var.a) && this.b.equals(y6h1Var.b) && u890.j(this.c, y6h1Var.c) && u890.j(this.h, y6h1Var.h) && this.d.equals(y6h1Var.d) && this.e == y6h1Var.e && u890.j(this.f, y6h1Var.f)) {
            return u890.j(this.g, y6h1Var.g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(xcg1.g(f4i1.b((this.h.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.c);
        sb.append("][");
        List list = this.d;
        sb.append(list.isEmpty() ? "no path" : o7h.y0(list, "/", null, null, null, 62));
        sb.append("] <spec version ");
        sb.append(this.a);
        sb.append("><generator version ");
        return gvg.k(sb, this.b, '>');
    }
}
