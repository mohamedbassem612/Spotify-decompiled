package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o3b extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ t3b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3b(t3b t3bVar, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = t3bVar;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new o3b(this.c, lnmVar, (byte) 0);
            default:
                return new o3b(this.c, lnmVar, (byte) 1);
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
        t3b t3bVar = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    g4b g4bVar = t3bVar.c;
                    this.b = true;
                    Object objE = g4bVar.e(new i24(g4bVar, (Object) null, (lnm) null, (byte) 12), this);
                    if (objE != d9nVar) {
                        objE = rih1Var;
                    }
                    if (objE == d9nVar) {
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
                    g4b g4bVar2 = t3bVar.c;
                    this.b = true;
                    Object objD = g4bVar2.d(new i24(g4bVar2, (lnm) null), this);
                    if (objD != d9nVar) {
                        objD = rih1Var;
                    }
                    if (objD == d9nVar) {
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
