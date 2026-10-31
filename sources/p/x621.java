package p;

import android.view.View;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x621 {
    public final kt91 a;
    public final dg30 b;
    public final Flowable c;
    public final j0a1 d;
    public final q8n e;
    public xab1 f;

    public x621(kt91 kt91Var, dg30 dg30Var, Flowable flowable, j0a1 j0a1Var, q8n q8nVar) {
        this.a = kt91Var;
        this.b = dg30Var;
        this.c = flowable;
        this.d = j0a1Var;
        this.e = q8nVar;
    }

    public final jhm a(String str, String str2) {
        return new jhm("profile_remove_follower", (hux) bpx.c, (fhm) null, (Integer) 2131959452, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(i021.S0, new q4z0(str, (byte) 24)), new ozu0(this, str2, str, (byte) 28)), 244);
    }

    public final void b() {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961137});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.a.k(new er91((fs91) null, "", 2131961137, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }
}
