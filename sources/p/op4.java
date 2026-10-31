package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class op4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new lp4(this, (byte) 2));

    public op4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        op4 op4Var = (op4) this.e.getValue();
        return op4Var != null ? op4Var.a() : this.a;
    }

    public final boolean b() {
        op4 op4Var = (op4) this.e.getValue();
        return op4Var != null ? op4Var.b() : this.b;
    }

    public final boolean c() {
        op4 op4Var = (op4) this.e.getValue();
        return op4Var != null ? op4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("search_entrypoint_enabled", "android-list-ux-platform-consumers-extender", a()), new fpb("use_kodiak_for_recommendations", "android-list-ux-platform-consumers-extender", b()), new fpb("use_mixed_list_endpoint", "android-list-ux-platform-consumers-extender", c())});
    }
}
