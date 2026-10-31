package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g44 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new g82(this, (byte) 25));

    public g44(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        g44 g44Var = (g44) this.c.getValue();
        return g44Var != null ? g44Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_out_of_focus_when_in_picture_in_picture_mode", "android-adsdisplay-ads", a()));
    }
}
