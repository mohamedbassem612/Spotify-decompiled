package p;

import com.spotify.gpb.trackingimpl.events.proto.GpbOperation;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h7m0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j7m0 b;
    public final /* synthetic */ pta c;

    public /* synthetic */ h7m0(j7m0 j7m0Var, pta ptaVar, byte b) {
        this.a = b;
        this.b = j7m0Var;
        this.c = ptaVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        pta ptaVar = this.c;
        j7m0 j7m0Var = this.b;
        switch (b) {
            case 0:
                com.spotify.mobius.functions.Consumer consumer = j7m0Var.g;
                if (consumer != null) {
                    consumer.accept(new yjb0(ptaVar));
                    return;
                } else {
                    u890.C("eventConsumer");
                    throw null;
                }
            default:
                vx40 vx40Var = j7m0Var.f;
                vsw0 vsw0Var = ptaVar.b;
                e550 e550VarP = GpbOperation.p();
                pf61 pf61Var = (pf61) vx40Var.c;
                e550VarP.w(pf61Var.c());
                e550VarP.v(pf61Var.a());
                e550VarP.t("LAUNCH_BILLING_FLOW");
                vx40.x(e550VarP, vsw0Var);
                vx40.B(e550VarP, (j331) obj, null);
                GpbOperation gpbOperation = (GpbOperation) e550VarP.build();
                t2j0 t2j0Var = (t2j0) vx40Var.b;
                gpbOperation.getClass();
                t2j0Var.a(gpbOperation);
                return;
        }
    }
}
