package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u6g0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ z6g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6g0(z6g0 z6g0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = z6g0Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        z6g0 z6g0Var = this.c;
        switch (b) {
            case 0:
                return new u6g0(z6g0Var, lnmVar, (byte) 0);
            default:
                return new u6g0(z6g0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        z6g0 z6g0Var = this.c;
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
                jpa0 jpa0Var = z6g0Var.c;
                String str = z6g0Var.f.a;
                this.b = true;
                Object objD = jpa0Var.d(str, this);
                return objD == d9nVar ? d9nVar : objD;
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
                d4e0 d4e0Var = z6g0Var.d;
                e7g0 e7g0Var = z6g0Var.f;
                String str2 = e7g0Var.a;
                iyr0 iyr0Var = e7g0Var.c;
                this.b = true;
                Object objE = d4e0Var.e(str2, iyr0Var, this);
                return objE == d9nVar ? d9nVar : objE;
        }
    }
}
