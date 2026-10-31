package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fqa0 extends a8d1 implements vu30 {
    public final /* synthetic */ dua0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqa0(dua0 dua0Var, int i, int i2, Function0 function0, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = dua0Var;
        this.b = i;
        this.c = i2;
        this.d = function0;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new fqa0(this.a, this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        fqa0 fqa0VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        fqa0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        krm0 krm0Var = (krm0) this.e.getValue();
        krm0 krm0Var2 = krm0.a;
        dua0 dua0Var = this.a;
        if (krm0Var != krm0Var2) {
            dua0Var.a = false;
        } else {
            boolean z = dua0Var.a;
            int i = this.b;
            int i2 = this.c;
            if (z && i > 0 && i2 == 0) {
                dua0Var.a = false;
                this.d.invoke();
            } else if (i2 > 0) {
                dua0Var.a = true;
            } else if (i == 0) {
                dua0Var.a = false;
            }
        }
        return rih1.a;
    }
}
