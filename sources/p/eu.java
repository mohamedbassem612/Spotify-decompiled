package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eu extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu(gu guVar, byte b) {
        super(0);
        this.a = b;
        this.b = guVar;
    }

    public final Object invoke() {
        byte b = this.a;
        gu guVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Observable observable = guVar.e;
                List list = null;
                byte b2 = 1;
                fu20 fu20Var = new fu20(h5p1.q(yoi1.g(observable), hu20.e(yoi1.g(observable), new qt((lnm) list, (Object) guVar, b2)), h4p1.g(new q4(guVar, (lnm) null, (byte) 5)), rqt0.u(((ca40) guVar.h.get()).b.a("parental-pin-required", false)), guVar.j.a(), new du(null, (byte) 0)), new k2(guVar, list, b2), (byte) 1);
                u9c0 u9c0VarQ = cto1.q(guVar.b);
                alb1 alb1Var = new alb1(1000L, Long.MAX_VALUE);
                dma1 dma1Var = guVar.f.a;
                int iL = dma1Var.l(kq.b, 0);
                return d5p1.t(fu20Var, u9c0VarQ, alb1Var, new au(null, iL <= 0 ? z6x.a : null, iL, dma1Var.h(kq.c, true), dma1Var.h(kq.d, false)));
            case 1:
                return (lr) guVar.g.get();
            default:
                return (es) guVar.i.get();
        }
    }
}
