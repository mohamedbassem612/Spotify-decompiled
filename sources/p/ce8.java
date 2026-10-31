package p;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ce8 implements h0r0 {
    public final a8e0 a;
    public final ee8 b;
    public final ge8 c;
    public final fta d;
    public final cbr0 e;

    public ce8(Context context, a8e0 a8e0Var, ee8 ee8Var, ge8 ge8Var, fta ftaVar) {
        this.a = a8e0Var;
        this.b = ee8Var;
        this.c = ge8Var;
        this.d = ftaVar;
        dbr0 yxe1Var = new yxe1(new jx21(2131952653));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.V(), nik1.U2, (nar0) null), new nxb((Integer) null, ixb.b, Integer.valueOf(context.getResources().getDimensionPixelSize(2131165479)), 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4089), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return a8e0.b(this.a, f610.e(new p6e0[]{new p6e0()}, new dt0(this, (lnm) null, (byte) 13)), new rr6(this, (byte) 25));
    }
}
