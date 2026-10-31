package p;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vb6 extends j1o implements b031 {
    public final LinkedHashSet N0;
    public final xe01 O0;
    public cdr0 P0;
    public final bpb1 Q0;
    public final bpb1 R0;
    public final bpb1 S0;
    public final bpb1 T0;
    public final llm U0;
    public faa0 V0;
    public faa0 W0;
    public final f8b X;
    public xab1 X0;
    public final xev0 Y;
    public final gev0 Z;
    public final xrc0 d;
    public final w6e0 e;
    public final String f;
    public final mr20 g;
    public final l1o h;
    public final bdr0 i;
    public final Set t;

    public vb6(xrc0 xrc0Var, w6e0 w6e0Var, String str, mr20 mr20Var, l1o l1oVar, bdr0 bdr0Var, t380 t380Var, f8b f8bVar, q8n q8nVar, xev0 xev0Var, gev0 gev0Var, LinkedHashSet linkedHashSet) {
        this.d = xrc0Var;
        this.e = w6e0Var;
        this.f = str;
        this.g = mr20Var;
        this.h = l1oVar;
        this.i = bdr0Var;
        this.t = t380Var;
        this.X = f8bVar;
        this.Y = xev0Var;
        this.Z = gev0Var;
        this.N0 = linkedHashSet;
        this.O0 = w6e0Var.n();
        bpb1 bpb1VarB = gio1.b(new ob6(this, (byte) 0));
        this.Q0 = bpb1VarB;
        this.R0 = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(Boolean.FALSE);
        this.S0 = bpb1VarB2;
        this.T0 = bpb1VarB2;
        this.U0 = smo1.e(q8nVar);
        j();
    }

    public final void a(Bundle bundle) {
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((b031) it.next()).a(bundle);
        }
    }

    public final void e() {
        j();
        this.Y.b();
        this.Z.b();
        this.V0 = c921.y(this.U0, (o8n) null, 0, new k96(this, (lnm) null, (byte) 2), 3);
    }

    public final void f() {
        faa0 faa0Var = this.V0;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        faa0 faa0Var2 = this.W0;
        if (faa0Var2 != null) {
            faa0Var2.d((CancellationException) null);
        }
        xab1 xab1Var = this.X0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        cdr0 cdr0Var = this.P0;
        if (cdr0Var != null) {
            cdr0Var.stop();
        }
        this.Y.c();
        this.Z.c();
    }

    @Override // p.j1o
    public final bpb1 k() {
        return this.T0;
    }

    @Override // p.j1o
    public final zob1 l() {
        return this.O0;
    }

    @Override // p.j1o
    public final bpb1 m() {
        return this.R0;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            bundle.putAll(((b031) it.next()).serialize());
        }
        return bundle;
    }
}
