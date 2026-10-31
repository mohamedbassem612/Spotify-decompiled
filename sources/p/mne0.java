package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mne0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yge0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mne0(yge0 yge0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = yge0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        yge0 yge0Var = this.b;
        switch (b) {
            case 0:
                return new mne0(yge0Var, lnmVar, (byte) 0);
            default:
                return new mne0(yge0Var, lnmVar, (byte) 1);
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
        yge0 yge0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                yge0Var.g().f(((p2m0) yge0Var.c).e(), (Set) null);
                break;
            default:
                hm5.M(obj);
                i8h1 i8h1VarG = yge0Var.g();
                p2m0 p2m0Var = (p2m0) yge0Var.c;
                x6h1 x6h1VarC = p2m0Var.b.c();
                x6h1VarC.i.add(new a7h1("current_location_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = p2m0Var.c.c;
                i8h1VarG.f(k7h1Var.a(), (Set) null);
                break;
        }
        return rih1Var;
    }
}
