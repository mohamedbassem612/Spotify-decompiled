package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nut extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ sut c;
    public final /* synthetic */ cut d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nut(sut sutVar, cut cutVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = sutVar;
        this.d = cutVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new nut(this.c, this.d, lnmVar, (byte) 0);
            default:
                return new nut(this.c, this.d, lnmVar, (byte) 1);
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

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        cut cutVar = this.d;
        d9n d9nVar = d9n.a;
        sut sutVar = this.c;
        lnm lnmVar = null;
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
                ht20 ht20VarC = sutVar.c();
                String str = cutVar.a;
                this.b = true;
                Object objL = b5p1.l(new pzs(ht20VarC, str.toLowerCase(Locale.ROOT), (byte) 4), new jte(2, (lnm) null, (byte) 26), this);
                return objL == d9nVar ? d9nVar : objL;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    long jB = sutVar.f.b();
                    this.b = true;
                    if (hap1.i(jB, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                bvt bvtVar = sutVar.d;
                out outVar = new out(sutVar, cutVar, null);
                if (bvtVar.b.c()) {
                    fn31.T(bvtVar.c, (o8n) null, 0, new p1r(bvtVar, outVar, lnmVar, (byte) 9), 3);
                }
                return rih1.a;
        }
    }
}
