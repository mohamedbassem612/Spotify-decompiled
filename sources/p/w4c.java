package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w4c extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ s2t c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4c(s2t s2tVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = s2tVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        s2t s2tVar = this.c;
        switch (b) {
            case 0:
                return new w4c(s2tVar, lnmVar, (byte) 0);
            default:
                return new w4c(s2tVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        s2t s2tVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ = s2tVar.Q(this);
                    return objQ == d9nVar ? d9nVar : objQ;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        this.b = true;
                        obj = s2tVar.Q(this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return (kc41) obj;
                } catch (CancellationException unused) {
                    return ic41.a;
                }
        }
    }
}
