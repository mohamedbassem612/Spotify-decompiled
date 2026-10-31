package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wkz0 implements h0r0 {
    public final qyj a;
    public final ykz0 b;
    public final lzn0 c;
    public final imq d;
    public final cbr0 e;

    public wkz0(Resources resources, qyj qyjVar, ykz0 ykz0Var, lzn0 lzn0Var, imq imqVar, los losVar) {
        this.a = qyjVar;
        this.b = ykz0Var;
        this.c = lzn0Var;
        this.d = imqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.y4(), nik1.U, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.6f)), ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3804), new hgr0(egr0.a, 0, 2), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1673682758, new vkz0(this, (byte) 1), true));
    }
}
