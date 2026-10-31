package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v52 implements h0r0 {
    public final qyj a;
    public final kly0 b;
    public final p52 c;
    public final cbr0 d;

    public v52(qyj qyjVar, ewo ewoVar, los losVar, ce31 ce31Var) {
        this.a = qyjVar;
        this.b = ewoVar;
        p52 p52Var = new p52(new g3(ce31Var, (byte) 27));
        this.c = p52Var;
        losVar.c(new n5(1, p52Var, p52.class, "onDismissed", "onDismissed(Lcom/spotify/tome/pagecapabilities/properties/BottomSheetProperties$BehaviorManager$DismissedReason;)V", 0, (byte) 7));
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("ADS", "ads", 18, "ads"), nik1.f2, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, true, true, true, (nsm0) null, 3613), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(733763203, new ab(this, (byte) 29), true));
    }
}
