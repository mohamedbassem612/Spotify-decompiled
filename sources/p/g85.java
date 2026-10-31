package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g85 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f85(this, (byte) 0));

    public g85(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        g85 g85Var = (g85) this.c.getValue();
        return g85Var != null ? g85Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_active_device_id_saver", "android-where-to-play", a()));
    }
}
