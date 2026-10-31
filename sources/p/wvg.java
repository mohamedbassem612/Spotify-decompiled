package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wvg extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ lz81 c;
    public final /* synthetic */ r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvg(AtomicReference atomicReference, lz81 lz81Var, r261 r261Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = atomicReference;
        this.c = lz81Var;
        this.d = r261Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new wvg(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Object andSet = this.b.getAndSet(null);
            if (andSet != null) {
                this.a = true;
                Object objA = this.c.a(andSet, this.d, this);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
