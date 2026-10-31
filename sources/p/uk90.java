package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uk90 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk90(ven0 ven0Var, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.c = ven0Var;
        this.b = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                return new uk90(ven0Var, function0, lnmVar);
            case 1:
                return new uk90(function0, ven0Var, lnmVar, (byte) 1);
            default:
                return new uk90(function0, ven0Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                ven0Var.setValue(function0.invoke());
                break;
            case 1:
                hm5.M(obj);
                function0.invoke();
                ven0Var.setValue(Boolean.TRUE);
                break;
            default:
                hm5.M(obj);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk90(Function0 function0, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = function0;
        this.c = ven0Var;
    }
}
