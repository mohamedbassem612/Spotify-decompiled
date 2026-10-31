package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.hovercraftasr.v1.AsrStreamResponse;
import com.spotify.hovercraftasr.v1.TranscriptionUpdate;
import com.spotify.messages.DjInteractivityConnectionClosed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dv81 extends bmq0 {
    public boolean b;
    public final /* synthetic */ l811 c;
    public final /* synthetic */ ev81 d;
    public final /* synthetic */ okl1 e;
    public final /* synthetic */ ssw0 f;

    public dv81(l811 l811Var, ev81 ev81Var, okl1 okl1Var, ssw0 ssw0Var) {
        this.c = l811Var;
        this.d = ev81Var;
        this.e = okl1Var;
        this.f = ssw0Var;
    }

    public final void N(int i, String str) {
        Logger.g(ab80.n("WebSocket connection closed: ", " / ", i, str), new Object[0]);
        t8r0 t8r0Var = this.d.e;
        String str2 = this.e.a;
        boolean z = this.b;
        bnu bnuVarN = DjInteractivityConnectionClosed.n();
        bnuVarN.n(str2);
        bnuVarN.s(i);
        bnuVarN.q(z);
        bnuVarN.r(str);
        DjInteractivityConnectionClosed djInteractivityConnectionClosedBuild = bnuVarN.build();
        t2j0 t2j0Var = (t2j0) t8r0Var.a;
        djInteractivityConnectionClosedBuild.getClass();
        t2j0Var.a(djInteractivityConnectionClosedBuild);
        this.f.H(this.b ? null : new IllegalStateException("End of Speech not received"));
    }

    public final void O(ig01 ig01Var, int i, String str) {
        ig01Var.b(i, str);
    }

    public final void P(Throwable th, ry21 ry21Var) {
        Logger.e(th, "WebSocket connection failed: " + ry21Var, new Object[0]);
        this.c.a = true;
        this.d.e.i(this.e, 2, ry21Var != null ? ry21Var.d : 0, th.getMessage());
        if (ry21Var != null && ry21Var.d == 401) {
            th = new pq8();
        }
        this.f.H(th);
    }

    public final void R(rhc rhcVar) {
        Object xu81Var;
        AsrStreamResponse asrStreamResponseP = AsrStreamResponse.p(rhcVar.q());
        Logger.g("Websocket response message: " + asrStreamResponseP, new Object[0]);
        int iN = asrStreamResponseP.n();
        int i = iN == 0 ? -1 : cv81.a[l1d.C(iN)];
        if (i == 1) {
            TranscriptionUpdate transcriptionUpdateO = asrStreamResponseP.o();
            xu81Var = transcriptionUpdateO.o() ? new xu81(transcriptionUpdateO.p()) : new yu81(transcriptionUpdateO.p());
        } else if (i != 2) {
            hhg1.g(asrStreamResponseP, "Unexpected response: ");
            return;
        } else {
            this.b = true;
            xu81Var = su81.a;
        }
        this.f.l(xu81Var);
    }

    public final void S(ig01 ig01Var, ry21 ry21Var) {
        Logger.g("WebSocket connection opened", new Object[0]);
        this.c.a = true;
        ev81 ev81Var = this.d;
        ev81Var.f = ig01Var;
        ev81Var.e.i(this.e, 1, ry21Var.d, ry21Var.c);
        this.f.l(wu81.a);
    }
}
