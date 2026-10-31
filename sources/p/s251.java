package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s251 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ y7e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s251(iu30 iu30Var, y7e1 y7e1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = iu30Var;
        this.c = y7e1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        y7e1 y7e1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new s251(iu30Var, y7e1Var, lnmVar, (byte) 0);
            default:
                return new s251(iu30Var, y7e1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y7e1 y7e1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                iu30Var.invoke(y7e1Var.d().d.toString());
                break;
            default:
                hm5.M(obj);
                iu30Var.invoke(new i2f1(y7e1Var.d().d.toString()));
                break;
        }
        return rih1Var;
    }
}
