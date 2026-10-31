package p;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vjr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ akr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vjr(akr akrVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = akrVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        akr akrVar = this.c;
        switch (b) {
            case 0:
                vjr vjrVar = new vjr(akrVar, lnmVar, (byte) 0);
                vjrVar.b = ((Boolean) obj).booleanValue();
                return vjrVar;
            default:
                return new vjr(akrVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((vjr) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                ((vjr) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9n.a;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        akr akrVar = this.c;
        switch (b) {
            case 0:
                ConcurrentLinkedQueue concurrentLinkedQueue = akrVar.u;
                boolean z = this.b;
                hm5.M(obj);
                if (!z && !concurrentLinkedQueue.isEmpty()) {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        wjr wjrVar = (wjr) concurrentLinkedQueue.poll();
                        if (wjrVar != null) {
                            akrVar.j(wjrVar);
                        }
                    }
                }
                return rih1.a;
            default:
                boolean z2 = this.b;
                lnm lnmVar = null;
                if (!z2) {
                    hm5.M(obj);
                    bpb1 bpb1Var = akrVar.t;
                    vjr vjrVar = new vjr(akrVar, lnmVar, (byte) 0);
                    this.b = true;
                    Object objQ = l4p1.q(bpb1Var, vjrVar, this);
                    d9n d9nVar = d9n.a;
                    if (objQ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                eg.m("SharedFlow never completes, this call should never return.");
                return null;
        }
    }
}
