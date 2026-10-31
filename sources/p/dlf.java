package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dlf {
    public static final bma1 e = bma1.b.u("martini_chat_session_last_user_takeover_at_ms");
    public final Flowable a;
    public final Single b;
    public final yqg c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public dlf(Flowable flowable, Single single, yqg yqgVar) {
        this.a = flowable;
        this.b = single;
        this.c = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        alf alfVar;
        if (onmVar instanceof alf) {
            alfVar = (alf) onmVar;
            int i = alfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                alfVar.c = i - Integer.MIN_VALUE;
            } else {
                alfVar = new alf(this, onmVar);
            }
        } else {
            alfVar = new alf(this, onmVar);
        }
        Object objJ = alfVar.a;
        int i2 = alfVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            alfVar.c = 1;
            objJ = fc11.j(this.b, alfVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return yah0.q(((dma1) objJ).g(e, 0L));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        blf blfVar;
        if (onmVar instanceof blf) {
            blfVar = (blf) onmVar;
            int i = blfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                blfVar.c = i - Integer.MIN_VALUE;
            } else {
                blfVar = new blf(this, onmVar);
            }
        } else {
            blfVar = new blf(this, onmVar);
        }
        Object objJ = blfVar.a;
        int i2 = blfVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            blfVar.c = 1;
            objJ = fc11.j(this.b, blfVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        l1d.B(this.c, ((dma1) objJ).edit(), e);
        return rih1.a;
    }
}
