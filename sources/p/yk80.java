package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yk80 implements xk80 {
    public final String a;
    public final v7f b;
    public final ArrayList c;
    public final String d;
    public final int e;

    public yk80(String str, v7f v7fVar, ArrayList arrayList, String str2, int i) {
        this.a = str;
        this.b = v7fVar;
        this.c = arrayList;
        this.d = str2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk80)) {
            return false;
        }
        yk80 yk80Var = (yk80) obj;
        return this.a.equals(yk80Var.a) && u890.j(this.b, yk80Var.b) && this.c.equals(yk80Var.c) && this.d.equals(yk80Var.d) && this.e == yk80Var.e;
    }

    @Override // p.xk80
    public final String getEntityUri() {
        return this.d;
    }

    @Override // p.cl80
    public final String getId() {
        return this.a;
    }

    @Override // p.cl80
    public final v7f getTimeRange() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v7f v7fVar = this.b;
        return l1d.C(this.e) + cy30.d(p3d1.f(this.c, (iHashCode + (v7fVar == null ? 0 : v7fVar.hashCode())) * 31, 31), 31, this.d);
    }
}
