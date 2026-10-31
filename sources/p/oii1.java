package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oii1 implements h0r0 {
    public final kyj a;
    public final xse1 b;
    public final sun0 c;
    public final iii1 d;
    public final fhi1 e;
    public final ytq f;
    public final ztq g;
    public final boolean h;
    public final bbc i = mno1.a(Integer.MAX_VALUE, 0, 6);
    public final cbr0 j;

    public oii1(kyj kyjVar, xse1 xse1Var, sun0 sun0Var, iii1 iii1Var, fhi1 fhi1Var, ytq ytqVar, ztq ztqVar, boolean z) {
        this.a = kyjVar;
        this.b = xse1Var;
        this.c = sun0Var;
        this.d = iii1Var;
        this.e = fhi1Var;
        this.f = ytqVar;
        this.g = ztqVar;
        this.h = z;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.j = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.t2(), nik1.y4, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.j;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1447062301, new zyf1(this, (byte) 10), true), new dx81(new nii1(this), kei1.T0, new lqc((byte) 28)));
    }
}
