package p;

import android.app.Activity;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lo60 implements lzn0 {
    public final lzn0 a;
    public final dt71 b = mgo1.e(0, 1, 0, 5);

    public lo60(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    @Override // p.lzn0
    public final void a(String str, tv80 tv80Var, Bundle bundle) {
        Object next;
        Set set = s4b1.f;
        if (ko60.a[uic.x(str).c.ordinal()] != 1) {
            this.a.a(str, tv80Var, bundle);
            return;
        }
        Iterator it = ihc1.P0(str, new char[]{'&'}, 6).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ihc1.h0((String) next, "facet", false));
        String str2 = (String) next;
        String str3 = str2 != null ? (String) o7h.C0(ihc1.P0(str2, new char[]{'='}, 6)) : null;
        if (str3 == null) {
            str3 = "";
        }
        this.b.a(new jo60(str3, str, tv80Var));
    }

    @Override // p.lzn0
    public final void b(b3i1 b3i1Var) {
        this.a.b(b3i1Var);
    }

    @Override // p.lzn0
    public final void c() {
        this.a.c();
    }

    @Override // p.lzn0
    public final void d(blc0 blc0Var) {
        this.a.d(blc0Var);
    }

    @Override // p.lzn0
    public final void e() {
        this.a.e();
    }

    @Override // p.lzn0
    public final void f(dwn0 dwn0Var) {
        this.a.f(dwn0Var);
    }

    @Override // p.lzn0
    public final void g(Bundle bundle, String str) {
        this.a.g(bundle, str);
    }

    @Override // p.lzn0
    public final void h(String str) {
        this.a.h(str);
    }

    @Override // p.lzn0
    public final void i(dwn0 dwn0Var, Bundle bundle) {
        this.a.i(dwn0Var, bundle);
    }

    @Override // p.lzn0
    public final boolean j(Activity activity) {
        return this.a.j(activity);
    }
}
