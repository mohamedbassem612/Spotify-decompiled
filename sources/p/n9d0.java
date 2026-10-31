package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n9d0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p9d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9d0(p9d0 p9d0Var, byte b) {
        super(3);
        this.a = b;
        this.b = p9d0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p9d0 p9d0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                otw.c(p9d0Var.g, new lr3(p9d0Var.h.a), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                ud1 ud1Var = p9d0Var.d;
                rih1 rih1Var2 = rih1.a;
                otw.c(ud1Var, rih1Var2, (qim0) null, (ipb1) null, (b0k) obj2, 48, 12);
                return rih1Var2;
            case 2:
                ((Number) obj3).intValue();
                bqp bqpVar = p9d0Var.c;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                String str = yon1.q2().a;
                String str2 = nik1.u4.a;
                t7p t7pVar = (t7p) bqpVar.a.c;
                Context context = (Context) ((q9d0) t7pVar.b).a.a;
                c8o.l(context);
                q9d0 q9d0Var = (q9d0) t7pVar.b;
                r35 r35Var = (r35) q9d0Var.d.get();
                c8o.l(r35Var);
                Flowable flowable = (Flowable) q9d0Var.e.get();
                c8o.l(flowable);
                q8n q8nVar = (q8n) q9d0Var.g.get();
                c8o.l(q8nVar);
                res resVar = new res(context, r35Var, flowable, q8nVar, str, str2);
                rih1 rih1Var3 = rih1.a;
                otw.c(resVar, rih1Var3, (qim0) null, (ipb1) null, (b0k) obj2, 48, 12);
                return rih1Var3;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(469793492, new cy00(p9d0Var, rwq.g(new cg60(p9d0Var.i.d(), (byte) 1), Boolean.FALSE, (o8n) null, b0kVar, 48, 2), (List) obj, (byte) 22), b0kVar), b0kVar, 24576, 15);
                return rih1Var;
        }
    }
}
