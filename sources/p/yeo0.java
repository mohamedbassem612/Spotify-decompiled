package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yeo0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public /* synthetic */ long b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeo0(long j, lnm lnmVar) {
        super(2, lnmVar);
        this.b = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                yeo0 yeo0Var = new yeo0((afo0) this.c, lnmVar);
                yeo0Var.b = ((Number) obj).longValue();
                return yeo0Var;
            default:
                yeo0 yeo0Var2 = new yeo0(this.b, lnmVar);
                yeo0Var2.c = obj;
                return yeo0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create(Long.valueOf(((Number) obj).longValue()), (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((cu41) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        pob1 pob1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                long j = this.b;
                hm5.M(obj);
                bpb1 bpb1Var = ((afo0) this.c).z1;
                do {
                    value = bpb1Var.getValue();
                    pob1Var = (pob1) value;
                } while (!bpb1Var.k(value, new pob1(j, pob1Var.b, pob1Var.c, pob1Var.d, pob1Var.e)));
                break;
            default:
                hm5.M(obj);
                cu41 cu41Var = (cu41) this.c;
                long j2 = this.b;
                du41 du41Var = cu41Var.a;
                du41Var.d(du41Var.k, j2, 1);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeo0(afo0 afo0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = afo0Var;
    }
}
