package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wgu extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ygu c;
    public final /* synthetic */ xgu d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wgu(ygu yguVar, xgu xguVar, ViewGroup viewGroup, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = yguVar;
        this.d = xguVar;
        this.e = viewGroup;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new wgu(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new wgu(this.c, this.d, this.e, lnmVar, (byte) 1);
            case 2:
                return new wgu(this.c, this.d, this.e, lnmVar, (byte) 2);
            case 3:
                return new wgu(this.c, this.d, this.e, lnmVar, (byte) 3);
            case 4:
                return new wgu(this.c, this.d, this.e, lnmVar, (byte) 4);
            default:
                return new wgu(this.c, this.d, this.e, lnmVar, (byte) 5);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ViewGroup viewGroup = this.e;
        xgu xguVar = this.d;
        ygu yguVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    bn60 bn60Var = bn60.e;
                    this.b = true;
                    return xgu.b(yguVar, xguVar, viewGroup, bn60Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    zm60 zm60Var = zm60.e;
                    this.b = true;
                    return xgu.b(yguVar, xguVar, viewGroup, zm60Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    an60 an60Var = an60.e;
                    this.b = true;
                    return xgu.b(yguVar, xguVar, viewGroup, an60Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    ym60 ym60Var = ym60.e;
                    this.b = true;
                    return xgu.b(yguVar, xguVar, viewGroup, ym60Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    cn60 cn60Var = cn60.e;
                    this.b = true;
                    return xgu.b(yguVar, xguVar, viewGroup, cn60Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    wm60 wm60Var = wm60.e;
                    this.b = true;
                    return xgu.b(yguVar, xguVar, viewGroup, wm60Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
