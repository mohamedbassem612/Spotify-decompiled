package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y8n0 implements z8n0 {
    public final Object X;
    public final boolean Y;
    public final String a;
    public final String b;
    public final g07 c;
    public final boolean d;
    public final boolean e;
    public final ArrayList f;
    public final int g;
    public final o1v h;
    public final k4m i;
    public final int t;

    public y8n0(String str, String str2, g07 g07Var, boolean z, boolean z2, ArrayList arrayList, int i, o1v o1vVar, k4m k4mVar, int i2, zuc0 zuc0Var, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = g07Var;
        this.d = z;
        this.e = z2;
        this.f = arrayList;
        this.g = i;
        this.h = o1vVar;
        this.i = k4mVar;
        this.t = i2;
        this.X = zuc0Var;
        this.Y = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8n0)) {
            return false;
        }
        y8n0 y8n0Var = (y8n0) obj;
        return this.a.equals(y8n0Var.a) && u890.j(this.b, y8n0Var.b) && this.c.equals(y8n0Var.c) && this.d == y8n0Var.d && this.e == y8n0Var.e && this.f.equals(y8n0Var.f) && this.g == y8n0Var.g && this.h == y8n0Var.h && this.i == y8n0Var.i && this.t == y8n0Var.t && u890.j(this.X, y8n0Var.X) && this.Y == y8n0Var.Y;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iF = kaa0.f(this.t, p3d1.g(this.i, (this.h.hashCode() + ab80.k(this.g, p3d1.f(this.f, xcg1.g(xcg1.g((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31), 31)) * 31, 31), 31);
        Object obj = this.X;
        return Boolean.hashCode(this.Y) + ((iF + (obj != null ? obj.hashCode() : 0)) * 31);
    }
}
