package p;

import app.p000rive.ViewModelInstance;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xj31 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ zj31 c;
    public final /* synthetic */ ViewModelInstance d;
    public final /* synthetic */ jj31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj31(zj31 zj31Var, ViewModelInstance viewModelInstance, jj31 jj31Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = zj31Var;
        this.d = viewModelInstance;
        this.e = jj31Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new xj31(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new xj31(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        jj31 jj31Var = this.e;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    mm31 mm31Var = this.c.d;
                    vj31 vj31Var = jj31Var.g;
                    this.b = true;
                    Object objS = smo1.s(new c6h0(vj31Var, mm31Var, this.d, (lnm) null, (byte) 24), this);
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Map map = jj31Var.h;
                    this.b = true;
                    Object objS2 = smo1.s(new i3y0(map, this.d, (lnm) null, (byte) 18), this);
                    if (objS2 != d9nVar) {
                        objS2 = rih1Var;
                    }
                    if (objS2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
