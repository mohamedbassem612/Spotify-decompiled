package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q85 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new f85(this, (byte) 8));

    public q85(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        q85 q85Var = (q85) this.c.getValue();
        return q85Var != null ? q85Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("material_system_theme_unauth", "android-widgets-npvwidget", a()));
    }
}
