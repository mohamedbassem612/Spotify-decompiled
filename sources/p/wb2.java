package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wb2 implements vb2 {
    public final dg30 b;
    public final lzn0 c;
    public final i3j0 d;
    public final kly0 e;

    public wb2(dg30 dg30Var, lzn0 lzn0Var, i3j0 i3j0Var, kly0 kly0Var) {
        this.b = dg30Var;
        this.c = lzn0Var;
        this.d = i3j0Var;
        this.e = kly0Var;
    }

    public final void c(we2 we2Var, boolean z, tv80 tv80Var, Intent intent) {
        dg30 dg30Var = this.b;
        if (!z) {
            int i = AgeAssuranceWebViewActivity.n1;
            dg30Var.startActivity(sj1.t(dg30Var, we2Var, tv80Var, intent));
            return;
        }
        lik1 lik1Var = bc2.b;
        String str = xa4.t().a;
        Bundle bundleD = b6j0.d(we2Var, intent);
        if (!this.c.j(dg30Var)) {
            a1r0.m((a1r0) this.e.get(), str, tv80Var, bundleD, 8);
        } else if (tv80Var != null) {
            c921.y(cto1.q(dg30Var), (o8n) null, 0, new bh(this, str, tv80Var, bundleD, (lnm) null, (byte) 6), 3);
        } else {
            c921.y(cto1.q(dg30Var), (o8n) null, 0, new c6(this, str, bundleD, (lnm) null, (byte) 13), 3);
        }
    }
}
