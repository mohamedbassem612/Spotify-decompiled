package p;

import android.view.View;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n4c0 implements Connectable {
    public final ynb0 a;
    public final dg30 b;
    public final x390 c;
    public final ozx d;
    public final h21 e;
    public final idd1 f = new idd1(new nzb0(this, (byte) 3));
    public m42 g;

    public n4c0(ynb0 ynb0Var, dg30 dg30Var, x390 x390Var, ozx ozxVar, h21 h21Var) {
        this.a = ynb0Var;
        this.b = dg30Var;
        this.c = x390Var;
        this.d = ozxVar;
        this.e = h21Var;
    }

    public final Connection L(Consumer consumer) {
        this.c.s();
        this.g = new m42(consumer, (byte) 20);
        return new n1b0(this, (byte) 2);
    }

    public final void a(n3u n3uVar) {
        ((View) this.f.getValue()).setVisibility(8);
        dg30 dg30Var = this.b;
        th30 th30VarE0 = dg30Var.e0();
        if (th30VarE0.U() || dg30Var.e0().G("EndlessErrorDialogFragment") != null) {
            return;
        }
        b0y b0yVarU = crm0.u(this.e, n3uVar);
        b0yVarU.j1(new m4c0(n3uVar, this));
        b0yVarU.i1(new m4c0(this, n3uVar));
        b0yVarU.g1(th30VarE0, "EndlessErrorDialogFragment");
        this.c.r(n3uVar.a());
    }
}
