package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a181 implements jn60, qjl {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final j181 e;

    public a181(String str, String str2, x360 x360Var, yz21 yz21Var, j181 j181Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = j181Var;
    }

    @Override // p.qjl
    public final Set c() {
        List<oi90> listA = this.e.a();
        ArrayList arrayList = new ArrayList();
        for (oi90 oi90Var : listA) {
            List listX = oi90Var.b;
            if (listX.isEmpty()) {
                listX = k4p1.x(oi90Var.a);
            }
            r7h.W(listX, arrayList);
        }
        return o7h.p1(arrayList);
    }

    @Override // p.jn60
    public final List d(op80 op80Var) {
        List<oi90> listA = this.e.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        for (oi90 oi90Var : listA) {
            arrayList.add(new d181(oi90Var.a, oi90Var.b));
        }
        return k4p1.x(new y081(new e181(this.b, arrayList, this.c), this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a181)) {
            return false;
        }
        a181 a181Var = (a181) obj;
        return this.a.equals(a181Var.a) && this.b.equals(a181Var.b) && u890.j(this.c, a181Var.c) && this.d.equals(a181Var.d) && this.e.equals(a181Var.e);
    }

    @Override // p.jn60
    public final yz21 f() {
        return this.d;
    }

    @Override // p.jn60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.e.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
