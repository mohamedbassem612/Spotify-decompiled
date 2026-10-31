package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v9l1 implements w8l1 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final vpl e;
    public final z0i f;
    public final okc1 g;
    public final r160 h;

    public v9l1(String str, String str2, String str3, ArrayList arrayList, vpl vplVar, z0i z0iVar, okc1 okc1Var, r160 r160Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = vplVar;
        this.f = z0iVar;
        this.g = okc1Var;
        this.h = r160Var;
    }

    @Override // p.w8l1
    public final vpl a() {
        return this.e;
    }

    @Override // p.w8l1
    public final r160 b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9l1)) {
            return false;
        }
        v9l1 v9l1Var = (v9l1) obj;
        return this.a.equals(v9l1Var.a) && this.b.equals(v9l1Var.b) && this.c.equals(v9l1Var.c) && this.d.equals(v9l1Var.d) && u890.j(this.e, v9l1Var.e) && u890.j(this.f, v9l1Var.f) && u890.j(this.g, v9l1Var.g) && u890.j(this.h, v9l1Var.h);
    }

    @Override // p.w8l1
    public final String getItemId() {
        return this.a;
    }

    @Override // p.w8l1
    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        vpl vplVar = this.e;
        int iHashCode = (iF + (vplVar == null ? 0 : vplVar.hashCode())) * 31;
        z0i z0iVar = this.f;
        int iHashCode2 = (iHashCode + (z0iVar == null ? 0 : z0iVar.hashCode())) * 31;
        okc1 okc1Var = this.g;
        int iHashCode3 = (iHashCode2 + (okc1Var == null ? 0 : okc1Var.hashCode())) * 31;
        r160 r160Var = this.h;
        return iHashCode3 + (r160Var != null ? r160Var.hashCode() : 0);
    }
}
