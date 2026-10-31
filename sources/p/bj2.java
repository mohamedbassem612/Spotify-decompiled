package p;

import android.content.pm.PackageManager;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bj2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ dj2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj2(dj2 dj2Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = dj2Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        dj2 dj2Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new bj2(dj2Var, lnmVar, (byte) 0);
            default:
                return new bj2(dj2Var, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
        byte b = this.a;
        dj2 dj2Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objB = dj2Var.b(this);
                    return objB == d9nVar ? d9nVar : objB;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hj2 hj2Var = (hj2) dj2Var.b;
                this.b = true;
                Object objA = hj2Var.a(this);
                return objA == d9nVar ? d9nVar : objA;
        }
    }
}
