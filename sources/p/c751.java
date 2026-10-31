package p;

import android.os.Bundle;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c751 extends x7e0 implements b031 {
    public final sco0 N0;
    public final iac0 O0;
    public final Scheduler P0;
    public final ct6 Q0 = new ct6(this, (byte) 12);
    public MobiusLoop R0;
    public Disposable S0;
    public llm T0;
    public boolean U0;
    public wb51 V0;
    public volatile z551 W0;
    public final y451 X;
    public final bbc X0;
    public final hc51 Y;
    public final bpb1 Y0;
    public final y751 Z;
    public final bbc Z0;
    public z651 a1;
    public final bpb1 b1;
    public final mfe c1;
    public final p551 d;
    public final ov41 e;
    public final ly41 f;
    public final y441 g;
    public final yrg0 h;
    public final jb51 i;
    public final y651 t;

    public c751(p551 p551Var, ov41 ov41Var, ly41 ly41Var, y441 y441Var, yrg0 yrg0Var, jb51 jb51Var, y651 y651Var, y451 y451Var, hc51 hc51Var, y751 y751Var, sco0 sco0Var, iac0 iac0Var, Scheduler scheduler) {
        this.d = p551Var;
        this.e = ov41Var;
        this.f = ly41Var;
        this.g = y441Var;
        this.h = yrg0Var;
        this.i = jb51Var;
        this.t = y651Var;
        this.X = y451Var;
        this.Y = hc51Var;
        this.Z = y751Var;
        this.N0 = sco0Var;
        this.O0 = iac0Var;
        this.P0 = scheduler;
        z551 z551Var = z551.P0;
        this.W0 = z551Var;
        this.X0 = mno1.a(-2, 0, 6);
        gyh gyhVar = null;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.Y0 = bpb1VarB;
        bbc bbcVarA = mno1.a(64, 0, 6);
        this.Z0 = bbcVarA;
        gyh gyhVar2 = y651Var.f;
        this.a1 = new z651(gyhVar2 == null, gyhVar2 == null);
        this.b1 = bpb1VarB;
        this.c1 = k4p1.B(bbcVarA);
        String str = y651Var.c;
        String str2 = str != null ? str : "";
        String str3 = str != null ? str : "";
        gyh gyhVar3 = y651Var.f;
        if (gyhVar3 != null && str != null && str.length() != 0) {
            gyhVar = gyhVar3;
        }
        this.W0 = z551.a(z551Var, str2, str3, 0, null, null, null, null, null, null, 0, null, null, false, new h1z0(gyhVar), false, 24572);
    }

    public final void a(Bundle bundle) {
        z551 z551VarA;
        od51 od51Var;
        h1z0 h1z0Var;
        String string = bundle.getString("query");
        if (string == null) {
            return;
        }
        this.a1 = new z651(bundle.getBoolean("isSearchFieldFocused", this.a1.a), bundle.getBoolean("isKeyboardVisible", this.a1.b));
        h1z0 h1z0Var2 = (h1z0) bundle.getParcelable("queryState");
        z551 z551Var = this.i.a.b;
        od51 od51Var2 = null;
        if (z551Var == null || string.length() <= 0 || !u890.j(z551Var.a, string) || (h1z0Var2 != null && !u890.j(z551Var.N0, h1z0Var2))) {
            z551Var = null;
        }
        if (z551Var == null) {
            z551 z551Var2 = z551.P0;
            if (h1z0Var2 == null) {
                gyh gyhVar = this.t.f;
                if (gyhVar == null || string.length() == 0) {
                    gyhVar = null;
                }
                h1z0Var = new h1z0(gyhVar);
            } else {
                h1z0Var = h1z0Var2;
            }
            z551VarA = z551.a(z551Var2, string, string, 0, null, null, null, null, null, null, 0, null, null, false, h1z0Var, false, 24572);
        } else {
            z551VarA = z551Var;
        }
        this.W0 = z551VarA;
        bpb1 bpb1Var = this.Y0;
        if (z551Var != null && (od51Var = this.i.a.a) != null && u890.j(od51Var.c, z551Var.b)) {
            od51Var2 = od51Var;
        }
        bpb1Var.l(od51Var2);
    }

    public final void e() {
        byte b = 2;
        byte b2 = 1;
        if (!this.U0) {
            this.U0 = true;
            int i = this.t.f == null ? 1 : 3;
            hc51 hc51Var = this.Y;
            hc51Var.getClass();
            hc51Var.e(new p4g0(2, (byte) 20));
            this.V0 = this.Y.d(i);
            int length = this.W0.a.length();
            sco0 sco0Var = this.N0;
            if (length == 0) {
                sco0Var.getClass();
            } else {
                sco0Var.getClass();
            }
        }
        this.O0.getLifecycle().a(this.Q0);
        MobiusLoop mobiusLoopG = gvg.d("Search-Mobius-Flow", Mobius.d(this.d, RxConnectables.a(this.f.a(new a751(this, b2)))).b(new dr41(this, b)).d(new ep31(this, (byte) 5))).e(this.e).g(this.W0);
        this.R0 = mobiusLoopG;
        this.S0 = mobiusLoopG.b(new a751(this, (byte) 0));
        llm llmVarE = smo1.e(flo1.l(guo1.B(), w0h1.h(this.P0)));
        fn31.T(llmVarE, (o8n) null, 0, new b751(this, null, (byte) 0), 3);
        fn31.T(llmVarE, (o8n) null, 0, new lc41(this, (lnm) null, (byte) 15), 3);
        this.T0 = llmVarE;
        i();
    }

    public final void f() {
        this.O0.getLifecycle().d(this.Q0);
        this.Y.a(this.V0);
        llm llmVar = this.T0;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.T0 = null;
        Disposable disposable = this.S0;
        if (disposable != null) {
            disposable.dispose();
        }
        this.S0 = null;
        MobiusLoop mobiusLoop = this.R0;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            u890.C("loop");
            throw null;
        }
    }

    public final Bundle serialize() {
        z551 z551Var = this.W0;
        od51 od51Var = (od51) this.Y0.getValue();
        z651 z651Var = this.a1;
        this.i.a.b = z551Var;
        if (od51Var != null) {
            if (!u890.j(od51Var.c, z551Var.b)) {
                od51Var = null;
            }
            if (od51Var != null) {
                this.i.a.a = od51Var;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("query", z551Var.a);
        bundle.putParcelable("queryState", z551Var.N0);
        bundle.putBoolean("isSearchFieldFocused", z651Var.a);
        bundle.putBoolean("isKeyboardVisible", z651Var.b);
        return bundle;
    }
}
