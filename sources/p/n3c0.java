package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n3c0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ q3c0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3c0(q3c0 q3c0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = q3c0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        q3c0 q3c0Var = this.c;
        switch (b) {
            case 0:
                return new n3c0(q3c0Var, lnmVar, (byte) 0);
            default:
                return new n3c0(q3c0Var, lnmVar, (byte) 1);
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
        q3c0 q3c0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    zzx zzxVar = q3c0Var.l;
                    this.b = true;
                    obj = zzxVar.a(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(obj != xzx.b);
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
                pp31 pp31Var = q3c0Var.e;
                this.b = true;
                Object objC = pp31Var.c("spotify:playlist:37i9dQZF1EYkqdzj48dyYq", this);
                return objC == d9nVar ? d9nVar : objC;
        }
    }
}
