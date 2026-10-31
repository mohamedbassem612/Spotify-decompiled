package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bth0 implements h0r0 {
    public final qyj a;
    public final zsh0 b;
    public final pt c;
    public final ysh0 d;
    public final cbr0 e;

    public bth0(Resources resources, qyj qyjVar, los losVar, zsh0 zsh0Var, pt ptVar, ysh0 ysh0Var) {
        this.a = qyjVar;
        this.b = zsh0Var;
        this.c = ptVar;
        this.d = ysh0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.Q2(), nik1.g3, (nar0) null), new t1r0(true), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.6f)), (ixb) null, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4062), new cxb(apo.j(1396645356, new ath0(this, (byte) 1), true))}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-970787238, new ath0(this, (byte) 0), true));
    }
}
