package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hu4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new st4(this, (byte) 12));

    public hu4(int i, luk lukVar, boolean z) {
        this.a = i;
        this.b = z;
        this.c = lukVar;
    }

    public final int a() {
        hu4 hu4Var = (hu4) this.d.getValue();
        return hu4Var != null ? hu4Var.a() : this.a;
    }

    public final boolean b() {
        hu4 hu4Var = (hu4) this.d.getValue();
        return hu4Var != null ? hu4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("max_same_intent_handle_count_threshold", "android-musicappplatform-navigation", a(), 0, 200), new fpb("use_cloned_intent_for_routing_and_handling", "android-musicappplatform-navigation", b()));
    }
}
