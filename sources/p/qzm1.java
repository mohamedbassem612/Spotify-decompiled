package p;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qzm1 implements h0r0 {
    public final Context a;
    public final yuj b;
    public final gzm1 c;
    public final fv9 d;
    public final vr51 e;
    public final uvq f;
    public final vvq g;
    public final wvq h;
    public final u961 i;
    public final s24 j;
    public final lzn0 k;
    public final szm1 l;
    public final wpv0 m;
    public final cgq n;
    public final dgq o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fgq f71p;
    public final ptf1 q;
    public final tsq r;
    public final ksk0 s;
    public final idd1 t = new idd1(new mzm1(this, (byte) 0));
    public final idd1 u = new idd1(new mzm1(this, (byte) 1));
    public final idd1 v = new idd1(new mzm1(this, (byte) 2));
    public final cbr0 w;

    public qzm1(Context context, yuj yujVar, gzm1 gzm1Var, fv9 fv9Var, vr51 vr51Var, uvq uvqVar, vvq vvqVar, wvq wvqVar, u961 u961Var, s24 s24Var, lzn0 lzn0Var, szm1 szm1Var, wpv0 wpv0Var, cgq cgqVar, dgq dgqVar, fgq fgqVar, ptf1 ptf1Var, tsq tsqVar, ksk0 ksk0Var, e5b0 e5b0Var) {
        this.a = context;
        this.b = yujVar;
        this.c = gzm1Var;
        this.d = fv9Var;
        this.e = vr51Var;
        this.f = uvqVar;
        this.g = vvqVar;
        this.h = wvqVar;
        this.i = u961Var;
        this.j = s24Var;
        this.k = lzn0Var;
        this.l = szm1Var;
        this.m = wpv0Var;
        this.n = cgqVar;
        this.o = dgqVar;
        this.f71p = fgqVar;
        this.q = ptf1Var;
        this.r = tsqVar;
        this.s = ksk0Var;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, wpv0Var.b.r(), false, false);
        yxe1 yxe1Var = new yxe1(new jx21(2131964212));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.w = new cbr0(new dbr0[]{t1r0Var, s9h1Var, yxe1Var, new bn70((n6r0) yon1.o6(), nik1.Y1, (v8h1) ksk0Var), new kce0(), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.w;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        boolean zG = this.m.b.G();
        yuj yujVar = this.b;
        if (!zG) {
            return yuj.b(yujVar, f610.e(new p6e0[]{new p6e0()}, new izm1(this, (lnm) null, (byte) 0)), apo.j(-857446279, new jzm1(this, (byte) 0), true), new n7e0(new kzm1(this), bom1.h, new lzm1()));
        }
        return yuj.b(yujVar, f610.e(new p6e0[]{new p6e0()}, new izm1(this, (lnm) null, (byte) 1)), apo.j(932061481, new jzm1(this, (byte) 1), true), new n7e0(pzm1.a, bom1.i, pdx0.Z0));
    }
}
