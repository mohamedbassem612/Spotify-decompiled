package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xlh extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xlh(Function0 function0, tob1 tob1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = function0;
        this.c = tob1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        tob1 tob1Var = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                return new xlh(function0, tob1Var, lnmVar, (byte) 0);
            default:
                return new xlh(function0, tob1Var, lnmVar, (byte) 1);
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
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        tob1 tob1Var = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (((Boolean) tob1Var.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
            default:
                hm5.M(obj);
                if (((Boolean) tob1Var.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
