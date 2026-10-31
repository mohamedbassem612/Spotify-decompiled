package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cf20 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ff20 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf20(ff20 ff20Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ff20Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        ff20 ff20Var = this.c;
        switch (b) {
            case 0:
                return new cf20(ff20Var, str, lnmVar, (byte) 0);
            default:
                return new cf20(ff20Var, str, lnmVar, (byte) 1);
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
        String str = this.d;
        ff20 ff20Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    bf20 bf20Var = ff20Var.a;
                    this.b = true;
                    Object objZ = qyo1.z(this, new cl1(false, str, (byte) 14), bf20Var.a, false, true);
                    if (objZ != d9nVar) {
                        objZ = rih1Var;
                    }
                    if (objZ != d9nVar) {
                        objZ = rih1Var;
                    }
                    if (objZ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    bf20 bf20Var2 = ff20Var.a;
                    this.b = true;
                    Object objY = qyo1.y(bf20Var2.a, new fpo(bf20Var2, str, (lnm) null, (byte) 9), this);
                    if (objY != d9nVar) {
                        objY = rih1Var;
                    }
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
