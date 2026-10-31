package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gmy extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ i091 c;
    public final /* synthetic */ yqg d;
    public final /* synthetic */ drr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gmy(i091 i091Var, yqg yqgVar, drr0 drr0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i091Var;
        this.d = yqgVar;
        this.e = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new gmy(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new gmy(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        yqg yqgVar = this.d;
        n091 n091Var = n091.a;
        d9n d9nVar = d9n.a;
        i091 i091Var = this.c;
        drr0 drr0Var = this.e;
        switch (b) {
            case 0:
                long j = i091Var.d;
                long j2 = i091Var.e;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (!u890.j(i091Var.h, n091Var) || j2 == 0) {
                        if (j2 != 0) {
                            drr0Var.t(j / j2);
                        } else {
                            drr0Var.t(0.0f);
                        }
                        return rih1Var;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                do {
                    drr0Var.t(((yqgVar.b() - i091Var.c) + j) / j2);
                    this.b = true;
                } while (hap1.i(50L, this) != d9nVar);
                return d9nVar;
            default:
                long j3 = i091Var.d;
                long j4 = i091Var.e;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (!u890.j(i091Var.h, n091Var) || j4 == 0) {
                        drr0Var.t(j4 != 0 ? j3 / j4 : 0.0f);
                        return rih1Var;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                do {
                    drr0Var.t(((yqgVar.b() - i091Var.c) + j3) / j4);
                    this.b = true;
                } while (hap1.i(50L, this) != d9nVar);
                return d9nVar;
        }
    }
}
