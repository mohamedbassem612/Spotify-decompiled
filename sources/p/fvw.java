package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fvw extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ wvw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvw(boolean z, wvw wvwVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = wvwVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        wvw wvwVar = this.c;
        switch (b) {
            case 0:
                return new fvw(this.b, wvwVar, lnmVar, (byte) 0);
            case 1:
                return new fvw(this.b, wvwVar, lnmVar, (byte) 1);
            case 2:
                return new fvw(this.b, wvwVar, lnmVar, (byte) 2);
            default:
                return new fvw(wvwVar, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wvw wvwVar = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (this.b) {
                    wvwVar.V(lvw.a);
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                if (this.b) {
                    wvwVar.U(pvw.a);
                    wvwVar.W(new jhv0("email_otp", "error_sdk_auth-client_challenge-proceed", 4, (String) null));
                }
                return rih1Var;
            case 2:
                hm5.M(obj);
                if (this.b) {
                    wvwVar.U(tvw.a);
                    wvwVar.W(new jhv0("email_otp", "error_endpoint_login_otp-too-many-attempts", 12, (String) null));
                }
                return rih1Var;
            default:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objI = hap1.i(5000L, this);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                bpb1 bpb1Var = wvwVar.g;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, vvw.a((vvw) value, false, false, null, kvw.a, 7)));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvw(wvw wvwVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.c = wvwVar;
    }
}
