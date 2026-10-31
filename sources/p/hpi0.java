package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hpi0 implements h0r0 {
    public final yuj a;
    public final kpi0 b;
    public final mev c;
    public final epi0 d;
    public final gw70 e;
    public final q8n f;
    public final wen0 g;
    public final lwf h;
    public final cbr0 i;

    public hpi0(yuj yujVar, kpi0 kpi0Var, mev mevVar, epi0 epi0Var, gw70 gw70Var, q8n q8nVar, wen0 wen0Var, lwf lwfVar) {
        this.a = yujVar;
        this.b = kpi0Var;
        this.c = mevVar;
        this.d = epi0Var;
        this.e = gw70Var;
        this.f = q8nVar;
        this.g = wen0Var;
        this.h = lwfVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.i = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.c4(), cfm0.i("spotify:account-management:member-details:remove-member:", kpi0Var.a(), nik1.k0), (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new oxa0(this, (lnm) null, (byte) 14)), apo.j(-1154416842, new pah0(this, (byte) 6), true), new n7e0(new gpi0(this), ish0.W0, ud20.O0));
    }
}
