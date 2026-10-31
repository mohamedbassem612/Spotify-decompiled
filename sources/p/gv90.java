package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gv90 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ov90 c;
    public final /* synthetic */ yxb0 d;
    public final /* synthetic */ f4s e;
    public final /* synthetic */ lv90 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv90(ov90 ov90Var, yxb0 yxb0Var, f4s f4sVar, lv90 lv90Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 1;
        this.c = ov90Var;
        this.d = yxb0Var;
        this.e = f4sVar;
        this.f = lv90Var;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new gv90(this.d, this.e, this.c, this.f, lnmVar, (byte) 0);
            case 1:
                return new gv90(this.c, this.d, this.e, this.f, lnmVar);
            default:
                return new gv90(this.d, this.e, this.c, this.f, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
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
                yxb0 yxb0Var = this.d;
                i4s i4sVar = (i4s) yxb0Var.f;
                l24 l24Var = new l24(yxb0Var, this.c, this.f, (lnm) null, (byte) 8);
                this.b = true;
                Object objS = smo1.s(new swn(i4sVar, this.e, l24Var, (lnm) null, (byte) 11), this);
                return objS == d9nVar ? d9nVar : objS;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    fns fnsVar = igu.a;
                    bs50 bs50Var = pyf0.a.f;
                    sr1 sr1Var = new sr1(this.c, this.d, this.e, this.f, (lnm) null, (byte) 24);
                    this.b = true;
                    if (fn31.Y(bs50Var, sr1Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yxb0 yxb0Var2 = this.d;
                i4s i4sVar2 = (i4s) yxb0Var2.f;
                lv90 lv90Var = this.f;
                ov90 ov90Var = this.c;
                f4s f4sVar = this.e;
                gv90 gv90Var = new gv90(ov90Var, yxb0Var2, f4sVar, lv90Var, null);
                this.b = true;
                Object objS2 = smo1.s(new swn(i4sVar2, f4sVar, gv90Var, (lnm) null, (byte) 11), this);
                return objS2 == d9nVar ? d9nVar : objS2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv90(yxb0 yxb0Var, f4s f4sVar, ov90 ov90Var, lv90 lv90Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.d = yxb0Var;
        this.e = f4sVar;
        this.c = ov90Var;
        this.f = lv90Var;
    }
}
