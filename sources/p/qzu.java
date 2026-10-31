package p;

import com.spotify.listplatform.contextmenu.ItemUnavailableException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qzu extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ szu c;
    public final /* synthetic */ d0r d;
    public final /* synthetic */ hti0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qzu(szu szuVar, d0r d0rVar, hti0 hti0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = szuVar;
        this.d = d0rVar;
        this.e = hti0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new qzu(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new qzu(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.listplatform.contextmenu.ItemUnavailableException */
    public final Object invokeSuspend(Object obj) throws ItemUnavailableException {
        byte b = this.a;
        hti0 hti0Var = this.e;
        d0r d0rVar = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str = hti0Var.a;
                this.b = true;
                Object objN = vby0.n(d3p1.F(d0rVar, w3p1.o(new l4r(hvm.b, 1, wvu.a1, new j4r(wvu.c1), wvu.b1), wvu.d1), str), this);
                return objN == d9nVar ? d9nVar : objN;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str2 = hti0Var.a;
                this.b = true;
                Object objN2 = vby0.n(d3p1.F(d0rVar, w3p1.o(new l4r(b2v.a, 1, wvu.e1, new j4r(nzu.c), nzu.b), nzu.d), str2), this);
                return objN2 == d9nVar ? d9nVar : objN2;
        }
    }
}
