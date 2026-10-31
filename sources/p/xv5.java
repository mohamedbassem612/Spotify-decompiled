package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xv5 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Boolean b;
    public /* synthetic */ Boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv5(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xv5 xv5Var = new xv5(i, lnmVar, (byte) 0);
                xv5Var.b = bool;
                xv5Var.c = bool2;
                return xv5Var.invokeSuspend(rih1Var);
            default:
                xv5 xv5Var2 = new xv5(i, lnmVar, (byte) 1);
                xv5Var2.b = bool;
                xv5Var2.c = bool2;
                return xv5Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Boolean bool = this.b;
                Boolean bool2 = this.c;
                hm5.M(obj);
                return Boolean.valueOf(bool.booleanValue() && !bool2.booleanValue());
            default:
                Boolean bool3 = this.b;
                Boolean bool4 = this.c;
                hm5.M(obj);
                if (bool3.booleanValue()) {
                    return bool4.booleanValue() ? new uir0(1) : sir0.a;
                }
                return new tir0(2);
        }
    }
}
