package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uhz0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ zhz0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uhz0(zhz0 zhz0Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = zhz0Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        zhz0 zhz0Var = this.c;
        switch (b) {
            case 0:
                return new uhz0(zhz0Var, str, lnmVar, (byte) 0);
            default:
                return new uhz0(zhz0Var, str, lnmVar, (byte) 1);
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
        Object objE;
        Object objG;
        byte b = this.a;
        String str = this.d;
        zhz0 zhz0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    e5l0 e5l0Var = zhz0Var.b;
                    this.b = true;
                    objE = e5l0Var.e(str, this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objE = ((e331) obj).a;
                }
                return new e331(objE);
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    e5l0 e5l0Var2 = zhz0Var.b;
                    this.b = true;
                    objG = e5l0Var2.g(str, this);
                    if (objG == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objG = ((e331) obj).a;
                }
                Object obj2 = objG;
                return obj2 instanceof m231 ? z6x.a : obj2;
        }
    }
}
