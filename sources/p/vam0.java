package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vam0 {
    public final nzl1 a;
    public final MobiusLoop.Controller b;
    public final yjq c;
    public Consumer d;

    public vam0(nzl1 nzl1Var, MobiusLoop.Controller controller, yjq yjqVar) {
        this.a = nzl1Var;
        this.b = controller;
        this.c = yjqVar;
    }

    public final nzl1 a() {
        return this.a;
    }

    public final boolean b() {
        return ((s1m1) this.b.a()).b == 5;
    }

    public final void c() {
        ku1 ku1Var = new ku1(this, (byte) 22);
        MobiusLoop.Controller controller = this.b;
        controller.c(ku1Var);
        controller.start();
    }

    public final void d(li20 li20Var) {
        Consumer consumer = this.d;
        if (consumer != null) {
            consumer.accept(new o1m1(li20Var));
        }
        MobiusLoop.Controller controller = this.b;
        controller.stop();
        controller.disconnect();
        this.d = null;
        s1m1 s1m1Var = (s1m1) controller.a();
        if (s1m1Var.b != 1) {
            this.c.u(new wzl1(s1m1Var.a, li20Var, s1m1Var.c));
        }
    }
}
