package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h85 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f85(this, (byte) 1));

    public h85(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        h85 h85Var = (h85) this.c.getValue();
        return h85Var != null ? h85Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("show_animated_educational_message", "android-widget-educationalmessage", a()));
    }
}
