package p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hi11 implements byf0, iac0 {
    public dxy X;
    public final zeu0 a;
    public final rh11 b;
    public final sor c;
    public final fiq d;
    public final u5l e;
    public faa0 f;
    public faa0 g;
    public final llm h;
    public final tac0 i;
    public final gf81 t;

    public hi11(zeu0 zeu0Var, q8n q8nVar, rh11 rh11Var, pux0 pux0Var, sor sorVar, fiq fiqVar, u5l u5lVar) {
        this.a = zeu0Var;
        this.b = rh11Var;
        this.c = sorVar;
        this.d = fiqVar;
        this.e = u5lVar;
        this.h = smo1.e(q8nVar);
        tac0 tac0Var = new tac0(this, true);
        this.i = tac0Var;
        this.t = pux0Var.g(tac0Var);
    }

    public static String a(PlayerState playerState) {
        j380 j380VarMetadata;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null) {
            return null;
        }
        return (String) j380VarMetadata.get("interaction_id");
    }

    @Override // p.byf0
    public final void c() {
        k8c0 k8c0Var = k8c0.ON_START;
        tac0 tac0Var = this.i;
        tac0Var.g(k8c0Var);
        tac0Var.g(k8c0.ON_RESUME);
        faa0 faa0Var = this.f;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        vse0 vse0Var = new vse0(this, (lnm) null, (byte) 17);
        llm llmVar = this.h;
        this.f = c921.y(llmVar, (o8n) null, 0, vse0Var, 3);
        faa0 faa0Var2 = this.g;
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
        this.g = c921.y(llmVar, (o8n) null, 0, new ic01(this, (lnm) null, (byte) 11), 3);
    }

    @Override // p.byf0
    public final void d() {
        k8c0 k8c0Var = k8c0.ON_PAUSE;
        tac0 tac0Var = this.i;
        tac0Var.g(k8c0Var);
        tac0Var.g(k8c0.ON_STOP);
        this.t.c.c();
        dxy dxyVar = this.X;
        if (dxyVar == null) {
            u890.C("handler");
            throw null;
        }
        dxyVar.P();
        faa0 faa0Var = this.f;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        faa0 faa0Var2 = this.g;
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
    }

    @Override // p.byf0
    public final void g(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(2131431013);
        thq thqVar = this.d.a;
        this.X = new dxy((krh) thq.b(thqVar).y5.get(), (giq) thq.d(thqVar).b.C8.get(), (hiq) thq.d(thqVar).b.D8.get(), (iiq) thq.d(thqVar).b.H8.get(), (liq) thq.d(thqVar).b.I8.get(), viewFindViewById, this.t);
    }

    public final x8c0 getLifecycle() {
        return this.i;
    }
}
