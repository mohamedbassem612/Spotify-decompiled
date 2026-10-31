package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r2l1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s2l1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2l1(s2l1 s2l1Var, byte b) {
        super(1);
        this.a = b;
        this.b = s2l1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        s2l1 s2l1Var = this.b;
        switch (b) {
            case 0:
                cir0 cir0Var = (cir0) obj;
                yuq yuqVar = s2l1Var.b;
                cbr0 cbr0Var = s2l1Var.e;
                f9p f9pVar = (f9p) yuqVar.a.c;
                q7m0 q7m0Var = (q7m0) ((jly0) f9pVar.S0).get();
                m4l1 m4l1Var = (m4l1) ((jly0) f9pVar.V0).get();
                zuq zuqVar = (zuq) ((jly0) f9pVar.W0).get();
                u2l1 u2l1Var = (u2l1) f9pVar.X;
                iu30 iu30Var = (iu30) ((jly0) f9pVar.e).get();
                g0l1 g0l1Var = (g0l1) ((jly0) f9pVar.g).get();
                q2l1 q2l1Var = (q2l1) ((jly0) f9pVar.T0).get();
                avq avqVar = (avq) ((jly0) f9pVar.X0).get();
                ArrayList arrayList = (ArrayList) ((jly0) f9pVar.f).get();
                j810 j810Var = (j810) ((t2l1) f9pVar.t).z.get();
                c8o.l(j810Var);
                return new x2l1(cir0Var, cbr0Var, q7m0Var, m4l1Var, zuqVar, u2l1Var, iu30Var, g0l1Var, q2l1Var, avqVar, arrayList, j810Var);
            default:
                return s2l1Var.c;
        }
    }
}
