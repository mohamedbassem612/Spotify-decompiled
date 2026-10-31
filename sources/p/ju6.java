package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ju6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ tbr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju6(AtomicBoolean atomicBoolean, tbr0 tbr0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = atomicBoolean;
        this.c = tbr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ju6(this.b, this.c, lnmVar, (byte) 0);
            default:
                return new ju6(this.b, this.c, lnmVar, (byte) 1);
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
        l231 l231Var = l231.a;
        tbr0 tbr0Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                if (atomicBoolean.compareAndSet(false, true)) {
                    tbr0Var.a(l231Var);
                }
                break;
            default:
                hm5.M(obj);
                if (atomicBoolean.compareAndSet(false, true)) {
                    tbr0Var.a(l231Var);
                }
                break;
        }
        return rih1Var;
    }
}
