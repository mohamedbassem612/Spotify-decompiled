package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ixl extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o7h1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixl(o7h1 o7h1Var, String str, String str2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = o7h1Var;
        this.c = str;
        this.d = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ixl(this.b, this.c, this.d, lnmVar, (byte) 0);
            default:
                return new ixl(this.b, this.c, this.d, lnmVar, (byte) 1);
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
        String str = this.c;
        o7h1 o7h1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                o7h1Var.getClass();
                r6h1 r6h1Var = r6h1.c;
                String strPath = o7h1Var.a.path();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-readalong";
                x6h1VarI.f = "13.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = strPath;
                x6h1VarI.c = 0;
                x6h1VarI.d = str;
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("artwork_view", "images", (Integer) null, this.d, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                o7h1Var.b.f(k7h1Var.a(), (Set) null);
                break;
            default:
                hm5.M(obj);
                o7h1Var.getClass();
                r6h1 r6h1Var2 = r6h1.c;
                String strPath2 = o7h1Var.a.path();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-readalong";
                x6h1VarI2.f = "13.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.b = strPath2;
                x6h1VarI2.c = 0;
                x6h1VarI2.d = str;
                x6h1 x6h1VarC2 = x6h1VarI2.a().c();
                x6h1VarC2.i.add(new a7h1("artwork_view", "video", (Integer) null, this.d, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = r6h1Var2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                o7h1Var.b.f(k7h1Var2.a(), (Set) null);
                break;
        }
        return rih1Var;
    }
}
