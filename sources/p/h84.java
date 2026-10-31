package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h84 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final luk f;
    public final idd1 g;

    public h84(boolean z, boolean z2, int i, int i2, int i3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = lukVar;
        this.g = new idd1(new u74(this, (byte) 2));
    }

    public final boolean a() {
        h84 h84Var = (h84) this.g.getValue();
        return h84Var != null ? h84Var.a() : this.a;
    }

    public final boolean b() {
        h84 h84Var = (h84) this.g.getValue();
        return h84Var != null ? h84Var.b() : this.b;
    }

    public final int c() {
        h84 h84Var = (h84) this.g.getValue();
        return h84Var != null ? h84Var.c() : this.c;
    }

    public final int d() {
        h84 h84Var = (h84) this.g.getValue();
        return h84Var != null ? h84Var.d() : this.d;
    }

    public final int e() {
        h84 h84Var = (h84) this.g.getValue();
        return h84Var != null ? h84Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_app_scoped_permission_state", "android-btpermissions", a()), new fpb("enable_new_app_startup", "android-btpermissions", b()), new fpb("min_active_session_days", "android-btpermissions", c(), 0, 30), new fpb("prompt_count_threshold", "android-btpermissions", d(), 0, Integer.MAX_VALUE), new fpb("prompt_time_threshold", "android-btpermissions", e(), 0, Integer.MAX_VALUE));
    }

    public h84(luk lukVar) {
        this(false, true, 7, 3, 604800, lukVar);
    }
}
