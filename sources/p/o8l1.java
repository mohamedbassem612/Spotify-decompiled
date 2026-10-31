package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o8l1 implements w8l1 {
    public final vpl a;
    public final ArrayList b;
    public final ArrayList c;
    public final r160 d;
    public final String e;

    public o8l1(vpl vplVar, ArrayList arrayList, ArrayList arrayList2, r160 r160Var, String str) {
        this.a = vplVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = r160Var;
        this.e = str;
    }

    @Override // p.w8l1
    public final vpl a() {
        return this.a;
    }

    @Override // p.w8l1
    public final r160 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8l1)) {
            return false;
        }
        o8l1 o8l1Var = (o8l1) obj;
        return u890.j(this.a, o8l1Var.a) && this.b.equals(o8l1Var.b) && this.c.equals(o8l1Var.c) && u890.j(this.d, o8l1Var.d) && this.e.equals(o8l1Var.e);
    }

    @Override // p.w8l1
    public final String getUri() {
        return this.e;
    }

    public final int hashCode() {
        vpl vplVar = this.a;
        int iF = p3d1.f(this.c, p3d1.f(this.b, (vplVar == null ? 0 : vplVar.hashCode()) * 31, 31), 31);
        r160 r160Var = this.d;
        return this.e.hashCode() + ((iF + (r160Var != null ? r160Var.hashCode() : 0)) * 31);
    }
}
