package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q7r0 {
    public final ien0 a;
    public final idd1 b;
    public final idd1 c;
    public final /* synthetic */ s7r0 d;

    public q7r0(s7r0 s7r0Var) {
        this.d = s7r0Var;
        this.a = new ien0(s7r0Var.f);
        this.b = new idd1(new u6j0((Object) s7r0Var, (byte) 24));
        this.c = new idd1(new gyq0(s7r0Var, (byte) 10));
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Object b(Class cls) {
        return ((b8r0) this.d.a()).f(cls);
    }

    public final void c(String str) {
        this.d.g.h(str);
    }

    public final void d(String str, tv80 tv80Var, Bundle bundle) {
        this.d.g.a(str, tv80Var, bundle);
    }

    public final Object e(Class cls) {
        Object objA = this.d.e.a(cls);
        if (objA != null) {
            return objA;
        }
        hhg1.o(cls, "Unsupported page accessory: ");
        return null;
    }
}
