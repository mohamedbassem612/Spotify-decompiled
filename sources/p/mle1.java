package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mle1 implements h0r0 {
    public final qyj a;
    public final kly0 b;
    public final ynb0 c;
    public final cbr0 d;

    /* JADX WARN: Code duplicated, block: B:11:0x0060  */
    public mle1(qyj qyjVar, tsq tsqVar, los losVar, ole1 ole1Var, ynb0 ynb0Var) {
        bn70 bn70Var;
        this.a = qyjVar;
        this.b = tsqVar;
        this.c = ynb0Var;
        losVar.c(new qwc1(this, (byte) 23));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        String strA = ole1Var.a();
        if (strA == null) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            bn70Var = new bn70(yon1.O4(), nik1.y6, (nar0) null);
        } else {
            strA = ole1Var.b() ? strA : null;
            if (strA == null) {
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                bn70Var = new bn70(yon1.O4(), nik1.y6, (nar0) null);
            } else {
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                p6r0 p6r0VarN4 = yon1.N4();
                Parcelable.Creator<lik1> creator = lik1.CREATOR;
                bn70Var = new bn70((n6r0) p6r0VarN4, oap1.i("spotify:internal:reinvent-free:time-cap-pivot:track-radio-upsell:".concat(strA)), (v8h1) lm5.m("spotify:track:".concat(strA)));
            }
        }
        this.d = new cbr0(new dbr0[]{yxe1Var, bn70Var, new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, true, true, true, (nsm0) null, 3613), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1421058100, new gsc1(this, (byte) 21), true));
    }
}
