package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fy91 {
    public static final Set b = f46.S0(new rqb1[]{rqb1.g, rqb1.U0});
    public final lx91 a;

    public fy91(lx91 lx91Var) {
        this.a = lx91Var;
    }

    public final kge a() {
        xx91 xx91Var = this.a;
        r1a1 r1a1Var = xx91Var.j;
        return hu20.d(new mr20[]{new cy91(yoi1.g(r1a1Var.b.subscribeOn(r1a1Var.a)), this, (byte) 0), new wzv0(new cy91(yoi1.g(xx91Var.k.f().distinctUntilChanged()), this, (byte) 1), (byte) 29)});
    }
}
