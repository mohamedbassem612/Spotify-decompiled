package p;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ana extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cna c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ana(cna cnaVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cnaVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        cna cnaVar = this.c;
        switch (b) {
            case 0:
                return new ana(cnaVar, lnmVar, (byte) 0);
            default:
                return new ana(cnaVar, lnmVar, (byte) 1);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        byte b = 0;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                d9n d9nVar = rih1.a;
                d9n d9nVar2 = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    cna cnaVar = this.c;
                    this.b = true;
                    try {
                        qvr qvrVar = ((xxu) cnaVar.a.b).b;
                        qvrVar.b();
                        pvr pvrVar = new pvr(qvrVar.c(qvr.g(new int[0]), (String[]) null));
                        while (pvrVar.moveToNext()) {
                            try {
                                op71.x(getContext());
                                kru kruVarE = qvr.e(pvrVar.a);
                                String str = kruVarE.a.a;
                                cnaVar.g.compute(str, new bna(cnaVar, str, kruVarE));
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    u890.p(pvrVar, th);
                                    throw th2;
                                }
                            }
                        }
                        pvrVar.close();
                    } catch (IOException e) {
                        Logger.e(e, "Failed to load downloads", new Object[0]);
                    }
                    if (d9nVar == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            default:
                d9n d9nVar3 = d9n.a;
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        cna cnaVar2 = this.c;
                        dqu dquVar = cnaVar2.a;
                        zma zmaVar = cnaVar2.f;
                        xxu xxuVar = (xxu) dquVar.b;
                        xxuVar.getClass();
                        xxuVar.e.add(zmaVar);
                        this.c.i = true;
                        cna cnaVar3 = this.c;
                        q8n q8nVar = cnaVar3.d;
                        ana anaVar = new ana(cnaVar3, lnmVar, b);
                        this.b = true;
                        if (fn31.Y(q8nVar, anaVar, this) == d9nVar3) {
                            return d9nVar3;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    this.c.i = false;
                    this = this.c.j;
                    this.clear();
                    return rih1.a;
                } catch (Throwable th3) {
                    this.c.i = false;
                    this.c.j.clear();
                    throw th3;
                }
        }
    }
}
