package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i4g extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ l4g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4g(l4g l4gVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = l4gVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        l4g l4gVar = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new i4g(l4gVar, lnmVar, (byte) 0);
            case 1:
                return new i4g(l4gVar, lnmVar, (byte) 1);
            default:
                return new i4g(l4gVar, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        l4g l4gVar = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                o95 o95Var = l4gVar.c;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    Float f = new Float(0.7f);
                    pxg1 pxg1VarO0 = irn1.o0(120, 0, mlv.c, 2);
                    this.b = (byte) 1;
                    if (o95.b(o95Var, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f2 = new Float(1.0f);
                n8b1 n8b1VarL0 = irn1.l0(1.0f, 132.0f, null, 4);
                this.b = (byte) 2;
                if (o95.b(o95Var, f2, n8b1VarL0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.b = (byte) 1;
                    if (hap1.i(50L, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var2 = l4gVar.e;
                Float f3 = new Float(1.0f);
                this.b = (byte) 2;
                if (o95Var2.g(f3, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                o95 o95Var3 = l4gVar.c;
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    Float f4 = new Float(0.88f);
                    pxg1 pxg1VarO1 = irn1.o0(80, 0, mlv.c, 2);
                    this.b = (byte) 1;
                    if (o95.b(o95Var3, f4, pxg1VarO1, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f5 = new Float(1.0f);
                n8b1 n8b1VarL1 = irn1.l0(1.0f, 132.0f, null, 4);
                this.b = (byte) 2;
                if (o95.b(o95Var3, f5, n8b1VarL1, (Float) null, (iu30) null, this, 12) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
