package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jw1 {
    public final gy1 a;
    public final boolean b;
    public final Map c;
    public final qng d;

    public jw1(gy1 gy1Var, boolean z, Map map, qng qngVar) {
        this.a = gy1Var;
        this.b = z;
        this.c = map;
        this.d = qngVar;
    }

    public final boolean a(fu1 fu1Var, boolean z) {
        if (!this.b || !z || !(fu1Var.e() instanceof zt1) || ((yv51) fu1Var.b.b.get("atp")) != null) {
            return false;
        }
        gy1 gy1Var = this.a;
        return ((gy1Var instanceof by1) || (gy1Var instanceof zx1) || (gy1Var instanceof fy1)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw1)) {
            return false;
        }
        jw1 jw1Var = (jw1) obj;
        return u890.j(this.a, jw1Var.a) && this.b == jw1Var.b && u890.j(this.c, jw1Var.c) && u890.j(this.d, jw1Var.d);
    }

    public final int hashCode() {
        int iE = cy30.e(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, true), 31, this.b), 31, this.c);
        qng qngVar = this.d;
        return iE + (qngVar == null ? 0 : qngVar.hashCode());
    }
}
