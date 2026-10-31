package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class syu extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ tv80 b;
    public final /* synthetic */ vyu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ syu(vyu vyuVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = vyuVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vyu vyuVar = this.c;
        tv80 tv80Var = (tv80) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                syu syuVar = new syu(vyuVar, lnmVar, (byte) 0);
                syuVar.b = tv80Var;
                syuVar.invokeSuspend(rih1Var);
                break;
            default:
                syu syuVar2 = new syu(vyuVar, lnmVar, (byte) 1);
                syuVar2.b = tv80Var;
                syuVar2.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vyu vyuVar = this.c;
        tv80 tv80Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                vyuVar.e.a(vyu.f, tv80Var, (Bundle) null);
                break;
            default:
                hm5.M(obj);
                vyuVar.e.a(vyu.f, tv80Var, (Bundle) null);
                break;
        }
        return rih1Var;
    }
}
