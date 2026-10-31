package p;

import androidx.car.app.k;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class xvc extends ap41 implements o5s {
    public final k g;
    public final qzn0 h;
    public final t64 i;
    public final wvc t;

    public xvc(k kVar, i8h1 i8h1Var, qzn0 qzn0Var, t64 t64Var) {
        super(kVar);
        this.g = kVar;
        this.h = qzn0Var;
        this.i = t64Var;
        this.t = new wvc(this, i8h1Var);
        fn31.T(cto1.q(this), (o8n) null, 0, new bu(this, null, (byte) 6), 3);
    }

    public abstract Function0 e();

    public abstract wqn0 f();

    public final void onDestroy(iac0 iac0Var) {
        ((ap41) this).b.d(this);
    }

    public void onPause(iac0 iac0Var) {
        this.t.e();
    }

    public void onResume(iac0 iac0Var) {
        this.g.a.b(this.t);
    }
}
