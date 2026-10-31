package p;

import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zyf extends kj30 {
    public final zhq0 d;
    public final lyf e;
    public final FrameLayout f;

    public zyf(cir0 cir0Var, zhq0 zhq0Var, lyf lyfVar, Bundle bundle) {
        super(((FrameLayout) zhq0Var.c).getId(), bundle);
        this.d = zhq0Var;
        this.e = lyfVar;
        FrameLayout frameLayout = (FrameLayout) zhq0Var.b;
        this.f = frameLayout;
        cir0Var.j(new pd8(this, (byte) 2));
        n4b n4bVar = new n4b(this, (byte) 8);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(frameLayout, n4bVar);
    }

    @Override // p.kj30
    public final void d(yf30 yf30Var) {
        th30 th30VarB = b();
        if (th30VarB == null) {
            hhg1.n("Required value was null.");
            return;
        }
        zf30 zf30VarA = th30VarB.N().a(th30VarB.x.e.getClassLoader(), pyf.class.getName());
        pyf.m2.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("checkout_web_view_args", this.e);
        zf30VarA.T0(bundle);
        if (yf30Var != null) {
            zf30VarA.V0(yf30Var);
        }
        nu9 nu9Var = new nu9(th30VarB);
        nu9Var.k(((FrameLayout) this.d.c).getId(), zf30VarA, (String) null, 1);
        nu9Var.h();
    }

    public final Object getView() {
        return this.f;
    }
}
