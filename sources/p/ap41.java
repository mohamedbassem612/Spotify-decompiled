package p;

import androidx.car.app.b;
import androidx.car.app.model.Action;
import androidx.car.app.model.TemplateWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ap41 implements iac0 {
    public final androidx.car.app.k a;
    public final tac0 b = new tac0(this, true);
    public final f341 c = new f341((byte) 5);
    public String d;
    public TemplateWrapper e;
    public boolean f;

    public ap41(androidx.car.app.k kVar) {
        Objects.requireNonNull(kVar);
        this.a = kVar;
    }

    public final void b(k8c0 k8c0Var) {
        sge1.b(new zyh0((Object) this, (Object) k8c0Var, (byte) 26));
    }

    public final void c() {
        if (this.b.i.a(w8c0.d)) {
            ((b) this.a.e(b.class)).c.a("app", "invalidate", new um5((byte) 15));
        }
    }

    public sxd1 d() {
        androidx.car.app.k kVar = this.a;
        c6j0 c6j0Var = new c6j0(kVar.getString(2131951738));
        c6j0Var.a = true;
        c6j0Var.b(x1p1.r(kVar.getString(2131951766), Action.BACK, (smc0) null, 4));
        return c6j0Var.a();
    }

    public final x8c0 getLifecycle() {
        return this.b;
    }
}
