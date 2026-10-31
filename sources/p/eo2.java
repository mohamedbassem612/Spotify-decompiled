package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eo2 extends a8d1 implements vu30 {
    public final /* synthetic */ em0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Bundle c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo2(em0 em0Var, long j, Bundle bundle, lnm lnmVar) {
        super(2, lnmVar);
        this.a = em0Var;
        this.b = j;
        this.c = bundle;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new eo2(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        eo2 eo2VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        eo2VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        em0 em0Var = this.a;
        boolean z = ((yo2) em0Var.b).s.a.getValue() instanceof gre;
        rih1 rih1Var = rih1.a;
        if (!z && ((Number) ((yo2) em0Var.b).H.a.getValue()).longValue() == this.b) {
            a1r0.j((a1r0) em0Var.e, nik1.w6.a, (String) null, this.c, false, 10);
        }
        return rih1Var;
    }
}
