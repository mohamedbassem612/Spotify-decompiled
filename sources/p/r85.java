package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r85 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new f85(this, (byte) 9));

    public r85(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        r85 r85Var = (r85) this.c.getValue();
        return r85Var != null ? r85Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("is_transsion_widget_enabled", "android-widgets-transsioncardwidget", a()));
    }
}
