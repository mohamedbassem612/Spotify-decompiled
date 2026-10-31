package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDefer;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u1b1 implements dwo {
    public final /* synthetic */ byte a;
    public final Object b;

    public u1b1(xi61 xi61Var) {
        this.a = (byte) 3;
        this.b = xi61Var;
        xi61Var.g.dispose();
        yj1 yj1Var = new yj1(xi61Var, (byte) 26);
        int i = Flowable.a;
        FlowableDefer flowableDefer = new FlowableDefer(yj1Var);
        Scheduler scheduler = xi61Var.f;
        xi61Var.g = flowableDefer.W(scheduler).L(scheduler).x(rtw0.f).J(r6x0.X).t(Functions.a).subscribe(new tr41(xi61Var, (byte) 6));
    }

    public final void shutdown() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                op71.q(((v1b1) obj).d.a, null);
                break;
            case 1:
                ((xh61) obj).b = false;
                break;
            case 2:
                ((fvc1) obj).a();
                break;
            case 3:
                ((xi61) obj).g.dispose();
                break;
            case 4:
                ((ftk1) obj).a();
                break;
            case 5:
                ((zsk1) obj).a();
                break;
            case 6:
                ((znl1) obj).a();
                break;
            case 7:
                ((eol1) obj).a();
                break;
            default:
                c9n c9nVar = (c9n) obj;
                if (c9nVar != null) {
                    smo1.p(c9nVar, (CancellationException) null);
                }
                break;
        }
    }

    public u1b1(zsk1 zsk1Var) {
        this.a = (byte) 5;
        this.b = zsk1Var;
        zsk1Var.b();
    }

    public u1b1(eol1 eol1Var) {
        this.a = (byte) 7;
        this.b = eol1Var;
        eol1Var.b();
    }

    public /* synthetic */ u1b1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public u1b1(ftk1 ftk1Var) {
        this.a = (byte) 4;
        this.b = ftk1Var;
        ftk1Var.b();
    }

    public u1b1(xh61 xh61Var) {
        this.a = (byte) 1;
        this.b = xh61Var;
        xh61Var.b = true;
        SingleEmitter singleEmitter = xh61Var.a;
        if (singleEmitter != null) {
            singleEmitter.onSuccess(rih1.a);
        }
    }

    public u1b1(v1b1 v1b1Var) {
        this.a = (byte) 0;
        this.b = v1b1Var;
        l4p1.u(v1b1Var.d, new lt20(new fu20(yoi1.g(v1b1Var.a), new wp41(v1b1Var, null, (byte) 26), (byte) 1), new pq0(3, (lnm) null, (byte) 3), (byte) 0));
    }
}
