package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.widgets.widgetattributionimpl.events.proto.PlaybackFromIntent;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class npl1 implements f961 {
    public final s85 a;
    public final mr20 b;
    public final mr20 c;
    public final qy30 d;
    public final llm e;
    public xab1 f;
    public xab1 g;
    public String h;

    public npl1(s85 s85Var, mr20 mr20Var, mr20 mr20Var2, q8n q8nVar, qy30 qy30Var) {
        this.a = s85Var;
        this.b = mr20Var;
        this.c = mr20Var2;
        this.d = qy30Var;
        llm llmVarE = smo1.e(flo1.l(q8nVar, op71.f()));
        this.e = llmVarE;
        if (s85Var.a()) {
            fn31.T(llmVarE, (o8n) null, 0, new fkj1((Object) this, (lnm) null, (byte) 19), 3);
        }
    }

    public final void a(epl1 epl1Var) {
        if (this.a.a()) {
            xab1 xab1Var = this.f;
            lnm lnmVar = null;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            xab1 xab1Var2 = this.g;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            this.g = fn31.T(this.e, (o8n) null, 0, new gqj1((Object) this, (Object) epl1Var, lnmVar, (byte) 16), 3);
        }
    }

    public final void b(epl1 epl1Var) {
        if (this.a.a()) {
            xab1 xab1Var = this.f;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            xab1 xab1Var2 = this.g;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            this.f = fn31.T(this.e, (o8n) null, 0, new ukl1(this, epl1Var, (lnm) null, (byte) 1), 3);
        }
    }

    public final void c(epl1 epl1Var, PlayerState playerState) {
        if (!playerState.playbackId().c() || ((CharSequence) playerState.playbackId().b()).length() == 0) {
            return;
        }
        String str = epl1Var.a;
        if (u890.j(str, this.h)) {
            return;
        }
        String str2 = epl1Var.b;
        String strContextUri = playerState.contextUri();
        String strUri = playerState.track().c() ? ((ContextTrack) playerState.track().b()).uri() : "";
        strUri.getClass();
        String str3 = (String) playerState.playbackId().b();
        String str4 = epl1Var.c;
        t2j0 t2j0Var = this.d.a;
        f0u0 f0u0VarN = PlaybackFromIntent.n();
        f0u0VarN.n(str);
        f0u0VarN.t(str2);
        f0u0VarN.r(strContextUri);
        f0u0VarN.s(strUri);
        f0u0VarN.q(str3);
        f0u0VarN.u(str4.toLowerCase(Locale.ROOT));
        t2j0Var.a(f0u0VarN.build());
        this.h = str;
    }

    public final void shutdown() {
        smo1.p(this.e, (CancellationException) null);
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final Object getApi() {
        return this;
    }
}
