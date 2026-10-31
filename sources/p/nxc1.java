package p;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nxc1 {
    public final vu30 a;
    public final ArrayList b;
    public final x660 c;
    public final Bitmap d;
    public final w660 e;
    public final Bitmap f;
    public final zud g;
    public final zud h;
    public final zud i;
    public final zud j;
    public final String k;
    public final int l;
    public final String m;
    public final String n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bitmap f45p;

    public nxc1(iyc1 iyc1Var, ArrayList arrayList, x660 x660Var, Bitmap bitmap, w660 w660Var, Bitmap bitmap2, zud zudVar, zud zudVar2, zud zudVar3, zud zudVar4, String str, int i, String str2, String str3, boolean z, Bitmap bitmap3) {
        this.a = iyc1Var;
        this.b = arrayList;
        this.c = x660Var;
        this.d = bitmap;
        this.e = w660Var;
        this.f = bitmap2;
        this.g = zudVar;
        this.h = zudVar2;
        this.i = zudVar3;
        this.j = zudVar4;
        this.k = str;
        this.l = i;
        this.m = str2;
        this.n = str3;
        this.o = z;
        this.f45p = bitmap3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxc1)) {
            return false;
        }
        nxc1 nxc1Var = (nxc1) obj;
        return u890.j(this.a, nxc1Var.a) && this.b.equals(nxc1Var.b) && this.c == nxc1Var.c && u890.j(this.d, nxc1Var.d) && u890.j(this.e, nxc1Var.e) && this.f.equals(nxc1Var.f) && u890.j(this.g, nxc1Var.g) && u890.j(this.h, nxc1Var.h) && u890.j(this.i, nxc1Var.i) && u890.j(this.j, nxc1Var.j) && this.k.equals(nxc1Var.k) && this.l == nxc1Var.l && this.m.equals(nxc1Var.m) && this.n.equals(nxc1Var.n) && this.o == nxc1Var.o && u890.j(this.f45p, nxc1Var.f45p);
    }

    public final int hashCode() {
        vu30 vu30Var = this.a;
        int iHashCode = (this.c.hashCode() + p3d1.f(this.b, (vu30Var == null ? 0 : vu30Var.hashCode()) * 31, 31)) * 31;
        Bitmap bitmap = this.d;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        w660 w660Var = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (w660Var == null ? 0 : w660Var.hashCode())) * 31)) * 31;
        zud zudVar = this.g;
        int iHashCode4 = (iHashCode3 + (zudVar == null ? 0 : zudVar.hashCode())) * 31;
        zud zudVar2 = this.h;
        int iHashCode5 = (iHashCode4 + (zudVar2 == null ? 0 : zudVar2.hashCode())) * 31;
        zud zudVar3 = this.i;
        int iHashCode6 = (iHashCode5 + (zudVar3 == null ? 0 : zudVar3.hashCode())) * 31;
        zud zudVar4 = this.j;
        int iG = xcg1.g(cy30.d(cy30.d(kaa0.f(this.l, cy30.d((iHashCode6 + (zudVar4 == null ? 0 : zudVar4.hashCode())) * 31, 31, this.k), 31), 31, this.m), 31, this.n), 31, this.o);
        Bitmap bitmap2 = this.f45p;
        return iG + (bitmap2 != null ? bitmap2.hashCode() : 0);
    }
}
