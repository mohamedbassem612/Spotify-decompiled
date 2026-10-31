package p;

import java.util.List;
import java.util.Set;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sel {
    public final zel a;
    public final bel b;

    public sel(zel zelVar, bel belVar) {
        this.a = zelVar;
        this.b = belVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(lnm lnmVar) throws HttpException {
        rel relVar;
        yel yelVar;
        w7x w7xVarP1;
        yel yelVar2 = this.a.a;
        if (lnmVar instanceof rel) {
            relVar = (rel) lnmVar;
            int i = relVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                relVar.d = i - Integer.MIN_VALUE;
            } else {
                relVar = new rel(this, lnmVar);
            }
        } else {
            relVar = new rel(this, lnmVar);
        }
        Object objA = relVar.b;
        int i2 = relVar.d;
        if (i2 == 0) {
            hm5.M(objA);
            relVar.a = yelVar2;
            relVar.d = 1;
            objA = this.b.a(relVar);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
            yelVar = yelVar2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yel yelVar3 = relVar.a;
            hm5.M(objA);
            yelVar = yelVar3;
        }
        List list = (List) objA;
        if (yelVar2.equals(vel.a)) {
            w7xVarP1 = w7x.a;
        } else if (yelVar2 instanceof xel) {
            w7xVarP1 = o7h.p1(((xel) yelVar2).b);
        } else {
            if (!(yelVar2 instanceof wel)) {
                eg.o();
                return null;
            }
            w7xVarP1 = o7h.p1(((wel) yelVar2).a);
        }
        return new uel(yelVar, list, w7xVarP1, (Set) null, 24);
    }

    public final o6e0 b() {
        return new o6e0(new ptj(1, this, sel.class, "load", "load(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 6), f46.I(new p6e0[]{new p6e0()}));
    }
}
