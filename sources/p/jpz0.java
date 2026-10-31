package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jpz0 implements h0r0 {
    public final qpz0 a;
    public final lo5 b;
    public final cbr0 c;

    public jpz0(gx81 gx81Var, qpz0 qpz0Var, lo5 lo5Var) {
        this.a = qpz0Var;
        this.b = lo5Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131960831));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarB4 = yon1.B4();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarB4, oap1.i("spotify:internal:radio"), (nar0) null), new j0c0(mno1.a0), new qod1("radio")}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return gx81.a(new hbz0(this, (byte) 1), new dx81(new ipz0(this), gkz0.d, pdx0.d, gkz0.e));
    }
}
