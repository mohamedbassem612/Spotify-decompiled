package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g730 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h730 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g730(h730 h730Var, byte b) {
        super(1);
        this.a = b;
        this.b = h730Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        h730 h730Var = this.b;
        switch (b) {
            case 0:
                d730 d730Var = (d730) obj;
                g7h g7hVar = h730Var.a;
                String str = d730Var.a;
                evz evzVar = new evz(yoi1.g(g7hVar.c(str, Collections.singletonList(str), false)), d730Var, (byte) 20);
                Flowable flowable = h730Var.d.a(str).toFlowable();
                vbm[] vbmVarArr = q601.a;
                return h5p1.s(evzVar, new kge(flowable), h730Var.e.c(), new ryu(4, (lnm) null, (byte) 1));
            default:
                ((qtr) obj).b(new js(h730Var, null, (byte) 12));
                return rih1.a;
        }
    }
}
