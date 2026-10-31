package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ymh0 extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public hav0 c;
    public iu30 d;
    public hav0 e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ iu30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymh0(iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.h = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        iu30 iu30Var = this.h;
        switch (b) {
            case 0:
                ymh0 ymh0Var = new ymh0(iu30Var, lnmVar, (byte) 0);
                ymh0Var.g = obj;
                return ymh0Var;
            default:
                ymh0 ymh0Var2 = new ymh0(iu30Var, lnmVar, (byte) 1);
                ymh0Var2.g = obj;
                return ymh0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        hav0 hav0Var;
        hav0 hav0Var2;
        hav0 hav0Var3;
        hav0 hav0Var4;
        hav0 hav0Var5;
        hav0 hav0Var6;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.h;
        d9n d9nVar = d9n.a;
        cav0 cav0Var = cav0.a;
        switch (b) {
            case 0:
                i8d1 i8d1Var = (i8d1) this.g;
                byte b2 = this.f;
                if (b2 == 0) {
                    hm5.M(obj);
                    this.g = i8d1Var;
                    this.f = (byte) 1;
                    obj = rqd1.a(i8d1Var, false, cav0Var, this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 == 1) {
                    hm5.M(obj);
                } else {
                    if (b2 == 2) {
                        hav0Var = this.c;
                        hm5.M(obj);
                        hav0Var2 = (hav0) obj;
                        if (hav0Var2 == null && hav0Var2.b - hav0Var.b < i8d1Var.c().b()) {
                            long jA = i8d1Var.c().a();
                            lia liaVar = new lia(2, (lnm) null, (byte) 9);
                            this.g = null;
                            this.c = null;
                            this.d = iu30Var;
                            this.e = hav0Var2;
                            this.f = (byte) 3;
                            Object objE = i8d1Var.e(jA, liaVar, this);
                            if (objE != d9nVar) {
                                hav0Var3 = hav0Var2;
                                obj = objE;
                            }
                            return d9nVar;
                        }
                    }
                    if (b2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hav0Var3 = this.e;
                    iu30Var = this.d;
                    hm5.M(obj);
                }
                if (((hav0) obj) != null) {
                    return rih1Var;
                }
                hav0Var3.a();
                iu30Var.invoke(mmh0.a);
                return rih1Var;
                hav0Var = (hav0) obj;
                this.g = i8d1Var;
                this.c = hav0Var;
                this.f = (byte) 2;
                obj = rqd1.i(i8d1Var, cav0Var, this);
                if (obj != d9nVar) {
                    hav0Var2 = (hav0) obj;
                    return hav0Var2 == null ? rih1Var : rih1Var;
                }
                return d9nVar;
            default:
                i8d1 i8d1Var2 = (i8d1) this.g;
                byte b3 = this.f;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.g = i8d1Var2;
                    this.f = (byte) 1;
                    obj = rqd1.a(i8d1Var2, false, cav0Var, this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 == 1) {
                    hm5.M(obj);
                } else {
                    if (b3 == 2) {
                        hav0Var4 = this.c;
                        hm5.M(obj);
                        hav0Var5 = (hav0) obj;
                        if (hav0Var5 == null && hav0Var5.b - hav0Var4.b < i8d1Var2.c().b()) {
                            long jA2 = i8d1Var2.c().a();
                            lia liaVar2 = new lia(2, (lnm) null, (byte) 12);
                            this.g = null;
                            this.c = null;
                            this.d = iu30Var;
                            this.e = hav0Var5;
                            this.f = (byte) 3;
                            Object objE2 = i8d1Var2.e(jA2, liaVar2, this);
                            if (objE2 != d9nVar) {
                                hav0Var6 = hav0Var5;
                                obj = objE2;
                            }
                            return d9nVar;
                        }
                    }
                    if (b3 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hav0Var6 = this.e;
                    iu30Var = this.d;
                    hm5.M(obj);
                }
                if (((hav0) obj) != null) {
                    return rih1Var;
                }
                hav0Var6.a();
                iu30Var.invoke(dwb1.a);
                return rih1Var;
                hav0Var4 = (hav0) obj;
                this.g = i8d1Var2;
                this.c = hav0Var4;
                this.f = (byte) 2;
                obj = rqd1.i(i8d1Var2, cav0Var, this);
                if (obj != d9nVar) {
                    hav0Var5 = (hav0) obj;
                    return hav0Var5 == null ? rih1Var : rih1Var;
                }
                return d9nVar;
        }
    }
}
