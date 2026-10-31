package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ju61 implements h0r0 {
    public final Context a;
    public final mu61 b;
    public final kly0 c;
    public final idd1 d;
    public final cbr0 e;

    public ju61(Context context, mu61 mu61Var, ipq ipqVar, los losVar) {
        this.a = context;
        this.b = mu61Var;
        this.c = ipqVar;
        idd1 idd1Var = new idd1(new l451(this, (byte) 26));
        this.d = idd1Var;
        yxe1 yxe1Var = new yxe1(((hu61) idd1Var.getValue()).b());
        v8h1 v8h1VarB = mu61Var.b();
        this.e = new cbr0(new dbr0[]{yxe1Var, v8h1VarB != null ? new bn70(mu61Var.e(), mu61Var.getViewUri(), v8h1VarB) : new bn70(mu61Var.e(), mu61Var.getViewUri(), (nar0) null), new pu00(true), new t1r0(true), new s9h1(14, true, false, false), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        pu61 pu61Var = (pu61) this.c.get();
        idd1 idd1Var = this.d;
        return pu61Var.d(uyn1.r(((hu61) idd1Var.getValue()).b(), this.a), ((hu61) idd1Var.getValue()).a());
    }
}
