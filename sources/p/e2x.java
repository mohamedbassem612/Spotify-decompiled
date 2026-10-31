package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e2x extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2x(Function0 function0, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = function0;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                return new e2x(function0, lnmVar, (byte) 0);
            default:
                return new e2x(function0, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                return z5d1.a;
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                function0.invoke();
                return z5d1.a;
            default:
                hm5.M(obj);
                function0.invoke();
                return rih1.a;
        }
    }
}
