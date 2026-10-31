package p;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class rvh0 {
    public final Context a;
    public final hod0 b;
    public final nj7 c = new nj7(this, (byte) 6);
    public jmo1 d;
    public hvh0 e;
    public boolean f;
    public jqd0 g;
    public boolean h;

    public rvh0(Context context, hod0 hod0Var) {
        if (context == null) {
            hhg1.n("context must not be null");
            throw null;
        }
        this.a = context;
        if (hod0Var == null) {
            this.b = new hod0(new ComponentName(context, getClass()), (byte) 13);
        } else {
            this.b = hod0Var;
        }
    }

    public mvh0 a(String str) {
        if (str != null) {
            return null;
        }
        hhg1.n("initialMemberRouteId cannot be null.");
        return null;
    }

    public mvh0 b(String str, ovh0 ovh0Var) {
        return a(str);
    }

    public nvh0 c(String str) {
        if (str != null) {
            return null;
        }
        hhg1.n("routeId cannot be null");
        return null;
    }

    public nvh0 d(String str, String str2) {
        if (str == null) {
            hhg1.n("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return e(str, ovh0.b);
        }
        hhg1.n("routeGroupId cannot be null");
        return null;
    }

    public nvh0 e(String str, ovh0 ovh0Var) {
        return c(str);
    }

    public abstract void f(hvh0 hvh0Var);

    public final void g(jqd0 jqd0Var) {
        owh0.b();
        if (this.g != jqd0Var) {
            this.g = jqd0Var;
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.sendEmptyMessage(1);
        }
    }

    public final void h(hvh0 hvh0Var) {
        owh0.b();
        if (n8p1.o(this.e, hvh0Var)) {
            return;
        }
        this.e = hvh0Var;
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.sendEmptyMessage(2);
    }
}
