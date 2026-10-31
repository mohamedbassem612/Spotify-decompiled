package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u9o1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public zwo1 b;
    public byte c;
    public final /* synthetic */ zwo1 d;
    public final /* synthetic */ oao1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9o1(oao1 oao1Var, zwo1 zwo1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = oao1Var;
        this.d = zwo1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        oao1 oao1Var = this.e;
        zwo1 zwo1Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new u9o1(oao1Var, zwo1Var, lnmVar);
            default:
                return new u9o1(zwo1Var, oao1Var, lnmVar);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oao1 oao1Var = this.e;
        zwo1 zwo1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    oao1Var.b = e2x0.a1;
                    this.b = zwo1Var;
                    this.c = (byte) 1;
                    obj = oao1Var.c();
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                zwo1Var = this.b;
                hm5.M(obj);
                this.b = null;
                this.c = (byte) 2;
                if (((qwo1) obj).a.invoke(zwo1Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.c;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.b = zwo1Var;
                    this.c = (byte) 1;
                    obj = flo1.x(38, 2, new fkj1(oao1Var, (lnm) null, (byte) 29));
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                zwo1Var = this.b;
                hm5.M(obj);
                this.b = null;
                this.c = (byte) 2;
                if (zwo1Var.b((nwo1) obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9o1(zwo1 zwo1Var, oao1 oao1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = zwo1Var;
        this.e = oao1Var;
    }
}
