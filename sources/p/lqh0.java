package p;

import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lqh0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oqh0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqh0(oqh0 oqh0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = oqh0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        oqh0 oqh0Var = this.c;
        switch (b) {
            case 0:
                lqh0 lqh0Var = new lqh0(oqh0Var, lnmVar, (byte) 0);
                lqh0Var.b = obj;
                return lqh0Var;
            default:
                lqh0 lqh0Var2 = new lqh0(oqh0Var, lnmVar, (byte) 1);
                lqh0Var2.b = obj;
                return lqh0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((kmo) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oqh0 oqh0Var = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj2;
                hm5.M(obj);
                bqh0 bqh0Var = oqh0Var.d;
                kph0 kph0VarN = oqh0Var.n();
                if (!list.equals(bqh0Var.b)) {
                    bqh0Var.b = list;
                    bqh0Var.a(kph0VarN);
                }
                break;
            default:
                kmo kmoVar = (kmo) obj2;
                hm5.M(obj);
                x5b1 x5b1Var = oqh0Var.a;
                x5b1Var.getClass();
                if (!u890.j(Looper.myLooper(), x5b1Var.c)) {
                    x5b1Var.k.post(new aih0(x5b1Var, kmoVar, false, (byte) 26));
                } else {
                    x5b1Var.o = kmoVar;
                    tv81 tv81VarA = x5b1Var.l.a();
                    x5b1.x1(tv81VarA, kmoVar);
                    x5b1Var.l = new uv81(tv81VarA);
                    x5b1Var.q1();
                }
                break;
        }
        return rih1Var;
    }
}
