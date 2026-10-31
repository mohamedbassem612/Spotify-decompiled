package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l861 extends a8d1 implements zu30 {
    public /* synthetic */ rob1 a;
    public /* synthetic */ l500 b;
    public /* synthetic */ tqw c;
    public final /* synthetic */ ve51 d;
    public final /* synthetic */ j861 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l861(ve51 ve51Var, j861 j861Var, lnm lnmVar) {
        super(4, lnmVar);
        this.d = ve51Var;
        this.e = j861Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        l861 l861Var = new l861(this.d, this.e, (lnm) obj4);
        l861Var.a = (rob1) obj;
        l861Var.b = (l500) obj2;
        l861Var.c = (tqw) obj3;
        rih1 rih1Var = rih1.a;
        l861Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        rob1 rob1Var = this.a;
        l500 l500Var = this.b;
        tqw tqwVar = this.c;
        hm5.M(obj);
        if ((l500Var instanceof l500) && (rob1Var instanceof hmb1) && tqwVar != null) {
            ve51.f(this.d).a(this.e.a(), n3o1.y(tqwVar), (Bundle) null);
        }
        return rih1.a;
    }
}
