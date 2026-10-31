package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wdl implements h0r0 {
    public final yuj a;
    public final sel b;
    public final hfl c;
    public final cbr0 d;

    public wdl(Resources resources, yuj yujVar, sel selVar, hfl hflVar, los losVar) {
        this.a = yujVar;
        this.b = selVar;
        this.c = hflVar;
        dbr0 t1r0Var = new t1r0(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{t1r0Var, new bn70(yon1.i0(), nik1.s6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.66f)), ixb.a, (Integer) null, 2, (mxb) null, losVar, false, false, false, (nsm0) null, 4052)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        o6e0 o6e0VarB = this.b.b();
        n7e0 n7e0Var = new n7e0(new vdl(this), yzj.W0, qbo1.Q0);
        return yuj.b(this.a, o6e0VarB, bfi.a, n7e0Var);
    }
}
