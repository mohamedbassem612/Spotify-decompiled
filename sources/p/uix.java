package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uix extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ p811 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uix(p811 p811Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.e = p811Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        p811 p811Var = this.e;
        switch (b) {
            case 0:
                uix uixVar = new uix(p811Var, lnmVar, (byte) 0);
                uixVar.d = obj;
                return uixVar;
            case 1:
                uix uixVar2 = new uix(p811Var, lnmVar, (byte) 1);
                uixVar2.d = obj;
                return uixVar2;
            default:
                uix uixVar3 = new uix(p811Var, lnmVar, (byte) 2);
                uixVar3.d = obj;
                return uixVar3;
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
            case 1:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        p811 p811Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                i8d1 i8d1Var = (i8d1) this.d;
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    this.d = null;
                    this.c = true;
                    if (rqd1.b(i8d1Var, this, 3) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                faa0 faa0Var = (faa0) p811Var.a;
                if (faa0Var == null) {
                    return rih1Var;
                }
                faa0Var.d((CancellationException) null);
                return rih1Var;
            case 1:
                i8d1 i8d1Var2 = (i8d1) this.d;
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    this.d = null;
                    this.c = true;
                    if (rqd1.b(i8d1Var2, this, 3) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                faa0 faa0Var2 = (faa0) p811Var.a;
                if (faa0Var2 == null) {
                    return rih1Var;
                }
                faa0Var2.d((CancellationException) null);
                return rih1Var;
            default:
                i8d1 i8d1Var3 = (i8d1) this.d;
                boolean z3 = this.c;
                if (!z3) {
                    hm5.M(obj);
                    this.d = null;
                    this.c = true;
                    if (rqd1.b(i8d1Var3, this, 3) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                faa0 faa0Var3 = (faa0) p811Var.a;
                if (faa0Var3 == null) {
                    return rih1Var;
                }
                faa0Var3.d((CancellationException) null);
                return rih1Var;
        }
    }
}
