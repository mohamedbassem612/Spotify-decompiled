package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wo2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo2(Function0 function0, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = function0;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Function0 function0 = this.c;
        switch (b) {
            case 0:
                wo2 wo2Var = new wo2(function0, lnmVar, (byte) 0);
                wo2Var.b = obj;
                return wo2Var;
            default:
                wo2 wo2Var2 = new wo2(function0, lnmVar, (byte) 1);
                wo2Var2.b = obj;
                return wo2Var2;
        }
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((wo2) create((mw2) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                break;
            default:
                ((wo2) create((ebr) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mw2 mw2Var = (mw2) obj2;
                hm5.M(obj);
                if ((mw2Var instanceof lw2) || (mw2Var instanceof kw2)) {
                    function0.invoke();
                }
                break;
            default:
                ebr ebrVar = (ebr) obj2;
                hm5.M(obj);
                if ((ebrVar instanceof cbr) || (ebrVar instanceof bbr)) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
