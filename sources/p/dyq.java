package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dyq extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xxq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dyq(xxq xxqVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = xxqVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xxq xxqVar = this.b;
        switch (b) {
            case 0:
                return new dyq(xxqVar, lnmVar, (byte) 0);
            case 1:
                return new dyq(xxqVar, lnmVar, (byte) 1);
            default:
                return new dyq(xxqVar, lnmVar, (byte) 2);
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
            case 1:
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
        xxq xxqVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                i8h1 i8h1VarA = xxqVar.a();
                x6h1 x6h1VarC = xxqVar.b.b.c();
                x6h1VarC.i.add(new a7h1("request_data_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1VarA.f(k7h1Var.a(), (Set) null);
                break;
            case 1:
                hm5.M(obj);
                xxqVar.a().f(xxqVar.c.e(), (Set) null);
                break;
            default:
                hm5.M(obj);
                xxqVar.a().f(xxqVar.c.e(), (Set) null);
                break;
        }
        return rih1Var;
    }
}
