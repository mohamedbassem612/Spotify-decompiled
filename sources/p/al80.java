package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class al80 implements cl80 {
    public final String a;
    public final v7f b;
    public final ArrayList c;
    public final long d;
    public final int e;
    public final int f;

    public al80(String str, v7f v7fVar, ArrayList arrayList, long j, int i, int i2) {
        this.a = str;
        this.b = v7fVar;
        this.c = arrayList;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al80)) {
            return false;
        }
        al80 al80Var = (al80) obj;
        return this.a.equals(al80Var.a) && u890.j(this.b, al80Var.b) && this.c.equals(al80Var.c) && this.d == al80Var.d && this.e == al80Var.e && this.f == al80Var.f;
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
        return l1d.C(this.f) + ab80.k(this.e, cy30.f(p3d1.f(this.c, (iHashCode + (v7fVar == null ? 0 : v7fVar.hashCode())) * 31, 31), this.d, 31), 31);
    }
}
