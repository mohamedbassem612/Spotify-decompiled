package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lp2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ fq2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp2(fq2 fq2Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = fq2Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        fq2 fq2Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new lp2(fq2Var, lnmVar, (byte) 0);
            case 1:
                return new lp2(fq2Var, lnmVar, (byte) 1);
            case 2:
                return new lp2(fq2Var, lnmVar, (byte) 2);
            default:
                return new lp2(fq2Var, lnmVar, (byte) 3);
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
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fq2 fq2Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Set set = fq2.c0;
                    return fq2Var.v(false, this) == d9nVar ? d9nVar : rih1Var;
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
                    this.b = true;
                    Set set2 = fq2.c0;
                    return fq2Var.v(false, this) == d9nVar ? d9nVar : rih1Var;
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
                    this.b = true;
                    Set set3 = fq2.c0;
                    return fq2Var.v(false, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    Set set4 = fq2.c0;
                    return fq2Var.v(false, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
