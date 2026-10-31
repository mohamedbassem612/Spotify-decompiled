package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vk21 implements Function0 {
    public final dt30 a;
    public final Function0 b;
    public final gw91 c;
    public final v3v0 d;

    public vk21(dt30 dt30Var, Function0 function0) {
        boolean z;
        this.a = dt30Var;
        this.b = function0;
        gw91 gw91Var = new gw91(ma21.Z0);
        gw91Var.e();
        this.c = gw91Var;
        v3v0 v3v0Var = new v3v0(1, this, vk21.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0, (byte) 21);
        this.d = v3v0Var;
        synchronized (dt30Var.c) {
            if (dt30Var.f) {
                z = true;
            } else {
                dt30Var.g.add(this);
                z = false;
            }
        }
        if (z) {
            invoke();
        }
        if (dt30Var.c()) {
            return;
        }
        dt30Var.a();
        l811 l811Var = new l811();
        gw91Var.d(function0, v3v0Var, new uk21(l811Var, function0, (byte) 0));
        if (l811Var.a) {
            gw91Var.b(function0);
            if (!dt30Var.c()) {
                dt30Var.d();
            }
            gw91Var.a();
            gw91Var.f();
        }
    }

    public final Object invoke() {
        gw91 gw91Var = this.c;
        gw91Var.a();
        gw91Var.f();
        return rih1.a;
    }
}
