package p;

import android.content.res.Resources;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rah1 implements h0r0 {
    public final wah1 a;
    public final xrc0 b;
    public final xvo c;
    public final dlg1 d;
    public final vxe1 e;
    public final hvj f;
    public final tsq g;
    public final tsq h;
    public final ezb1 i;
    public final up0 j;
    public final ffe1 k;
    public final zb91 l;
    public final kt91 m;
    public final tsq n;
    public final los o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cbr0 f36p;

    public rah1(Resources resources, wah1 wah1Var, xrc0 xrc0Var, xvo xvoVar, dlg1 dlg1Var, vxe1 vxe1Var, hvj hvjVar, tsq tsqVar, tsq tsqVar2, ezb1 ezb1Var, up0 up0Var, ffe1 ffe1Var, zb91 zb91Var, kt91 kt91Var, tsq tsqVar3) {
        this.a = wah1Var;
        this.b = xrc0Var;
        this.c = xvoVar;
        this.d = dlg1Var;
        this.e = vxe1Var;
        this.f = hvjVar;
        this.g = tsqVar;
        this.h = tsqVar2;
        this.i = ezb1Var;
        this.j = up0Var;
        this.k = ffe1Var;
        this.l = zb91Var;
        this.m = kt91Var;
        this.n = tsqVar3;
        los losVar = new los();
        this.o = losVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("MAGPIE_UCP_ACTIONS", "magpie/ucp-actions", 988, "magpie");
        kik1 kik1Var = nik1.l6;
        Set set = s4b1.f;
        this.f36p = new cbr0(new dbr0[]{new bn70(p6r0VarG1, kik1Var.b("spotify:internal:magpie:ucp-actions:".concat(uic.x(wah1Var.a).h())), (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.66f)), ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4060)}, false);
    }

    public final cbr0 a() {
        return this.f36p;
    }

    public final p2r0 b() {
        return this.f.a(new h190(new lt20(new m441(new q721(this, (lnm) null, (byte) 29)), new w1e0(3, (lnm) null, (byte) 27), (byte) 0), (byte) 1), new j2i(1049423160, new e9f1(this, (byte) 14), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }

    public final yah1 c(qxc0 qxc0Var) {
        Map map = qxc0Var.X;
        zb91 zb91Var = this.l;
        List listF = zb91Var.f(map);
        String strA = qxc0Var.b.a(1);
        boolean zR = ejo1.r(map);
        List listE = zb91Var.e(map);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            r7h.W(((zah1) it.next()).c, linkedHashSet);
        }
        return new yah1(listF, strA, zR, linkedHashSet);
    }
}
