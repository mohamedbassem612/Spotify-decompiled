package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ubc1 implements w8l1 {
    public final vpl a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final r160 e;
    public final okc1 f;
    public final String g;
    public final String h;
    public final vq71 i;

    public ubc1(vpl vplVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, r160 r160Var, okc1 okc1Var, String str, String str2, vq71 vq71Var) {
        this.a = vplVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = r160Var;
        this.f = okc1Var;
        this.g = str;
        this.h = str2;
        this.i = vq71Var;
    }

    @Override // p.w8l1
    public final vpl a() {
        return this.a;
    }

    @Override // p.w8l1
    public final r160 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubc1)) {
            return false;
        }
        ubc1 ubc1Var = (ubc1) obj;
        return u890.j(this.a, ubc1Var.a) && this.b.equals(ubc1Var.b) && this.c.equals(ubc1Var.c) && this.d.equals(ubc1Var.d) && u890.j(this.e, ubc1Var.e) && u890.j(this.f, ubc1Var.f) && this.g.equals(ubc1Var.g) && this.h.equals(ubc1Var.h) && u890.j(this.i, ubc1Var.i);
    }

    @Override // p.w8l1
    public final String getItemId() {
        return this.g;
    }

    @Override // p.w8l1
    public final String getUri() {
        return this.h;
    }

    @Override // p.w8l1
    public final vq71 h() {
        return this.i;
    }

    public final int hashCode() {
        vpl vplVar = this.a;
        int iF = p3d1.f(this.d, p3d1.f(this.c, p3d1.f(this.b, (vplVar == null ? 0 : vplVar.hashCode()) * 31, 31), 31), 31);
        r160 r160Var = this.e;
        int iHashCode = (iF + (r160Var == null ? 0 : r160Var.hashCode())) * 31;
        okc1 okc1Var = this.f;
        int iD = cy30.d(cy30.d((iHashCode + (okc1Var == null ? 0 : okc1Var.hashCode())) * 31, 31, this.g), 31, this.h);
        vq71 vq71Var = this.i;
        return iD + (vq71Var != null ? vq71Var.hashCode() : 0);
    }
}
