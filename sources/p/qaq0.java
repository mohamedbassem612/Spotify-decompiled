package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qaq0 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new u6j0(this, (byte) 20));

    public qaq0(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public static qaq0 d(aey0 aey0Var) {
        return new qaq0(aey0Var.c("on-tour:enable_concert_w_friends_overlay", false), aey0Var.c("on-tour:enable_reranked_on_tour_card", false), null);
    }

    public final boolean b() {
        qaq0 qaq0Var = (qaq0) this.d.getValue();
        return qaq0Var != null ? qaq0Var.b() : this.a;
    }

    public final boolean c() {
        qaq0 qaq0Var = (qaq0) this.d.getValue();
        return qaq0Var != null ? qaq0Var.c() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_concert_w_friends_overlay", "on-tour", b()), new fpb("enable_reranked_on_tour_card", "on-tour", c())});
    }
}
