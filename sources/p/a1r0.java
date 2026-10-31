package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface a1r0 {
    static /* synthetic */ void e(a1r0 a1r0Var, dwn0 dwn0Var, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        a1r0Var.f(dwn0Var, bundle, false);
    }

    static /* synthetic */ void i(a1r0 a1r0Var, String str, String str2, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        a1r0Var.a(str, str2, bundle);
    }

    static /* synthetic */ void j(a1r0 a1r0Var, String str, String str2, Bundle bundle, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        a1r0Var.n(str, str2, bundle, z);
    }

    static /* synthetic */ void m(a1r0 a1r0Var, String str, tv80 tv80Var, Bundle bundle, int i) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        a1r0Var.k(str, tv80Var, bundle, false);
    }

    void a(String str, String str2, Bundle bundle);

    void c();

    void d(blc0 blc0Var);

    void f(dwn0 dwn0Var, Bundle bundle, boolean z);

    void g();

    boolean h(Activity activity);

    void k(String str, tv80 tv80Var, Bundle bundle, boolean z);

    void l();

    void n(String str, String str2, Bundle bundle, boolean z);

    default void b(b3i1 b3i1Var) {
    }
}
