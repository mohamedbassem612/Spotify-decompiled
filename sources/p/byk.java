package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class byk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ yyk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byk(yyk yykVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = yykVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        yyk yykVar = this.c;
        switch (b) {
            case 0:
                return new byk(yykVar, lnmVar, (byte) 0);
            default:
                return new byk(yykVar, lnmVar, (byte) 1);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public final Object invokeSuspend(Object obj) throws HttpException {
        byte b = this.a;
        yyk yykVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                boolean z2 = false;
                try {
                    if (!z) {
                        hm5.M(obj);
                        Single singleC = yykVar.k.c(mmq0.g, 3, nik1.t6.a);
                        this.b = true;
                        obj = fc11.j(singleC, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    z2 = ((rmq0) obj).a && yykVar.l.a.g(yykVar.m);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z2);
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    bel belVar = yykVar.n;
                    this.b = true;
                    obj = belVar.a(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new bwk(new lel((List) obj));
        }
    }
}
