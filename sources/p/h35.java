package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h35 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new k25(this, (byte) 12));

    public h35(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        h35 h35Var = (h35) this.c.getValue();
        return h35Var != null ? h35Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("max_number_of_tracks", "android-system-offline-playablecacheimpl", a(), 0, 100000));
    }
}
