package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r211 implements phi1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ r211(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final qhi1 a(dtb1 dtb1Var, i2g1 i2g1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                f211 f211Var = dtb1Var instanceof f211 ? (f211) dtb1Var : null;
                if (f211Var == null) {
                    return null;
                }
                bjx bjxVar = (bjx) obj;
                return lro1.l(new et90((gw70) bjxVar.b, (cr6) bjxVar.c, (ysu0) bjxVar.d, (pdu0) bjxVar.e, (Scheduler) bjxVar.f, (l6m0) bjxVar.g), f211Var);
            case 1:
                cka1 cka1Var = dtb1Var instanceof cka1 ? (cka1) dtb1Var : null;
                if (cka1Var == null) {
                    return null;
                }
                return lro1.l(new ngs0((vtq) ((jly0) ((uw0) ((utq) obj).a.c).b).get()), cka1Var);
            default:
                qxc1 qxc1Var = dtb1Var instanceof qxc1 ? (qxc1) dtb1Var : null;
                if (qxc1Var == null) {
                    return null;
                }
                return lro1.l((txc1) obj, qxc1Var);
        }
    }
}
