package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j4s extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ iir c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4s(iir iirVar, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = iirVar;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        iir iirVar = this.c;
        switch (b) {
            case 0:
                return new j4s(iirVar, str, lnmVar, (byte) 0);
            default:
                return new j4s(iirVar, str, lnmVar, (byte) 1);
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
        rih1 rih1Var = d9n.a;
        rih1 rih1Var2 = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (rih1Var2 == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (rih1Var2 == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
        }
    }
}
