package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class srv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ urv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ srv0(urv0 urv0Var, byte b) {
        super(1);
        this.a = b;
        this.b = urv0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        urv0 urv0Var = this.b;
        switch (b) {
            case 0:
                kyp kypVar = urv0Var.c;
                ekb ekbVar = new ekb((byte) 20);
                e93 e93Var = (e93) kypVar.a.c;
                e93Var.getClass();
                PublishSubject publishSubject = new PublishSubject();
                yxk0 yxk0Var = new yxk0((byte) 1);
                ywp ywpVar = (ywp) e93Var.g;
                xrv0 xrv0Var = (xrv0) e93Var.b;
                Scheduler scheduler = (Scheduler) xrv0Var.b.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) xrv0Var.a.get();
                c8o.l(scheduler2);
                return new fsv0(ekbVar, new mzr0(scheduler, scheduler2, publishSubject, yxk0Var, ywpVar), new PublishSubject(), new uvv0(), (lyp) ((jly0) e93Var.t).get(), (myp) ((jly0) e93Var.X).get(), (nyp) ((jly0) e93Var.U0).get(), (rrv0) ((jly0) e93Var.e).get(), (byte) 0);
            default:
                bsv0 bsv0Var = urv0Var.a;
                djw0 djw0Var = bsv0Var.b;
                String str = bsv0Var.a;
                if (djw0Var == null) {
                    return new lvv0(str, new rvv0(false), null, bsv0Var.c, 26);
                }
                return new lvv0(str, qvv0.a, djw0Var, bsv0Var.c, 18);
        }
    }
}
