package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class han0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ kqi0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ han0(kqi0 kqi0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = kqi0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        kqi0 kqi0Var = this.c;
        switch (b) {
            case 0:
                return new han0(kqi0Var, lnmVar, (byte) 0);
            default:
                return new han0(kqi0Var, lnmVar, (byte) 1);
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
        kqi0 kqi0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                s6z0 s6z0Var = (s6z0) kqi0Var.b;
                String str = ((ean0) kqi0Var.c).a;
                this.b = true;
                Object objC = s6z0Var.c(str, this);
                return objC == d9nVar ? d9nVar : objC;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zgz0 zgz0Var = (zgz0) kqi0Var.d;
                String str2 = ((ean0) kqi0Var.c).a;
                this.b = true;
                Object objC2 = zgz0Var.c(str2, this);
                return objC2 == d9nVar ? d9nVar : objC2;
        }
    }
}
