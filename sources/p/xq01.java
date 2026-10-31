package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xq01 implements jn60 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final oq01 e;

    public xq01(String str, String str2, x360 x360Var, yz21 yz21Var, oq01 oq01Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = oq01Var;
    }

    @Override // p.jn60
    public final List d(op80 op80Var) {
        return k4p1.x(new mq01(this.e, this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq01)) {
            return false;
        }
        xq01 xq01Var = (xq01) obj;
        return this.a.equals(xq01Var.a) && this.b.equals(xq01Var.b) && u890.j(this.c, xq01Var.c) && this.d.equals(xq01Var.d) && this.e.equals(xq01Var.e);
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
