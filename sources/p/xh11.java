package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xh11 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip31 b;
    public final /* synthetic */ yh11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh11(ip31 ip31Var, yh11 yh11Var, byte b) {
        super(0);
        this.a = b;
        this.b = ip31Var;
        this.c = yh11Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yh11 yh11Var = this.c;
        ip31 ip31Var = this.b;
        switch (b) {
            case 0:
                ((rku) ip31Var.i).b(Flowable.e((moy0) ((ynb0) ip31Var.g).get(), (FlowableMap) ip31Var.c, yoi1.h(pno1.j((c9c0) ((ynb0) ip31Var.h).get()), o6x.a), new bv40(ip31Var, (byte) 26)).U(Boolean.FALSE).N(Boolean.TRUE).t(Functions.a).L((Scheduler) ip31Var.d).W((Scheduler) ip31Var.e).subscribe(new tg(ip31Var, (byte) 29)));
                ((fzw) yh11Var.D.get()).a((mtf) yh11Var.E.get());
                break;
            default:
                ((rku) ip31Var.i).a();
                op71.q(((fzw) yh11Var.D.get()).b.a, (CancellationException) null);
                break;
        }
        return rih1Var;
    }
}
