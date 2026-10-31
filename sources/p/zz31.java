package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zz31 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ l041 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz31(l041 l041Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = l041Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        l041 l041Var = this.c;
        switch (b) {
            case 0:
                return new zz31(l041Var, str, lnmVar, (byte) 0);
            case 1:
                return new zz31(l041Var, str, lnmVar, (byte) 1);
            case 2:
                return new zz31(l041Var, str, lnmVar, (byte) 2);
            case 3:
                return new zz31(l041Var, str, lnmVar, (byte) 3);
            case 4:
                return new zz31(l041Var, str, lnmVar, (byte) 4);
            case 5:
                return new zz31(l041Var, str, lnmVar, (byte) 5);
            default:
                return new zz31(l041Var, str, lnmVar, (byte) 6);
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
            case 5:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        String str = this.d;
        l041 l041Var = this.c;
        d9n d9nVar = d9n.a;
        List list = null;
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
                this.b = true;
                vp70 vp70Var = l041.h;
                Object objF = l041Var.f(new e041(l041Var, str, null, (byte) 1), this);
                return objF == d9nVar ? d9nVar : objF;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return list;
                }
                hm5.M(obj);
                long j = l041.g;
                zz31 zz31Var = new zz31(l041Var, str, list, (byte) 0);
                this.b = true;
                obj = rc2.P(j, zz31Var, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                h120 h120Var = (h120) obj;
                list = h120Var != null ? h120Var.c : null;
                if (list == null) {
                    return z6xVar;
                }
                return list;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xaz0 xaz0Var = l041Var.c;
                this.b = true;
                Object objD = xaz0Var.d(str, this);
                return objD == d9nVar ? d9nVar : objD;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                vp70 vp70Var2 = l041.h;
                Object objE = l041Var.e(str, this);
                return objE == d9nVar ? d9nVar : objE;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    long j2 = l041.g;
                    zz31 zz31Var2 = new zz31(l041Var, str, list, (byte) 3);
                    this.b = true;
                    obj = rc2.P(j2, zz31Var2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                List list2 = (List) obj;
                return list2 == null ? z6xVar : list2;
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                vp70 vp70Var3 = l041.h;
                Object objF2 = l041Var.f(new e041(l041Var, str, null, (byte) 1), this);
                return objF2 == d9nVar ? d9nVar : objF2;
            default:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                long j3 = l041.g;
                zz31 zz31Var3 = new zz31(l041Var, str, list, (byte) 5);
                this.b = true;
                Object objP = rc2.P(j3, zz31Var3, this);
                return objP == d9nVar ? d9nVar : objP;
        }
    }
}
