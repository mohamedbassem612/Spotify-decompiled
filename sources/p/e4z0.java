package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e4z0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h4z0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4z0(h4z0 h4z0Var, byte b) {
        super(3);
        this.a = b;
        this.b = h4z0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h4z0 h4z0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uwr uwrVar = cbx.a;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                klx klxVar = h4z0Var.f() ? klx.c : tlx.c;
                if (h4z0Var.f()) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(1480097129);
                    j = cbx.a(x340Var2).c.f;
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(1480098728);
                    j = cbx.a(x340Var3).c.b;
                    x340Var3.r(false);
                }
                long j2 = j;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(klxVar, isl.a, u291.r(nim0.a, 24.0f), j2, 0L, false, x340Var, 56, 48);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String text = h4z0Var.getText();
                uwr uwrVar2 = cbx.a;
                uwo1.e(text, null, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, null, null, 0, false, null, 0, null, b0kVar, 0, 0, 2034);
                break;
        }
        return rih1Var;
    }
}
