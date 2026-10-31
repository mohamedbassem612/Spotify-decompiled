package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r01 extends b611 {
    public boolean a = true;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ z511 c;
    public final /* synthetic */ Function0 d;

    public r01(Function0 function0, iu30 iu30Var, z511 z511Var) {
        this.b = iu30Var;
        this.c = z511Var;
        this.d = function0;
    }

    public final void a() {
        h();
    }

    public final void b(int i, int i2) {
        h();
    }

    public final void c(int i, int i2, Object obj) {
        h();
    }

    public final void d(int i, int i2) {
        h();
    }

    public final void e(int i, int i2) {
        h();
    }

    public final void f(int i, int i2) {
        h();
    }

    public final void h() {
        z511 z511Var = this.c;
        if (((Boolean) this.b.invoke(Integer.valueOf(z511Var.e()))).booleanValue()) {
            if (this.a) {
                this.a = false;
                z511Var.z(this);
            }
            this.d.invoke();
        }
    }
}
