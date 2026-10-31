package p;

import com.spotify.audiorecognition.v1.AudioRecognitionResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q28 extends bmq0 {
    public final /* synthetic */ ssw0 b;
    public final /* synthetic */ AtomicReference c;
    public final /* synthetic */ m441 d;
    public final /* synthetic */ AtomicBoolean e;

    public q28(ssw0 ssw0Var, AtomicReference atomicReference, m441 m441Var, AtomicBoolean atomicBoolean) {
        this.b = ssw0Var;
        this.c = atomicReference;
        this.d = m441Var;
        this.e = atomicBoolean;
    }

    public final void N(int i, String str) {
        Logger.g("AudioRecognition WebSocket closed: %d / %s", new Object[]{Integer.valueOf(i), str});
        this.b.H(this.e.get() ? null : new IllegalStateException("AudioRecognition WebSocket closed before a result"));
    }

    public final void O(ig01 ig01Var, int i, String str) {
        ig01Var.b(i, str);
    }

    public final void P(Throwable th, ry21 ry21Var) {
        Logger.e(th, "AudioRecognition WebSocket failed: %s", new Object[]{ry21Var == null ? "" : ry21Var});
        if (ry21Var != null && ry21Var.d == 401) {
            th = new qq8();
        }
        this.b.H(th);
    }

    public final void R(rhc rhcVar) {
        String strP;
        ssw0 ssw0Var = this.b;
        try {
            AudioRecognitionResponse audioRecognitionResponseR = AudioRecognitionResponse.r(rhcVar.q());
            audioRecognitionResponseR.getClass();
            int iQ = audioRecognitionResponseR.q();
            int i = iQ == 0 ? -1 : r28.a[l1d.C(iQ)];
            if (i == 1 || i == 2 || i == 3) {
                this.e.set(true);
            } else if (i != 4 && i != 5) {
                eg.o();
                return;
            }
            Integer numValueOf = Integer.valueOf(rhcVar.d());
            String strP2 = audioRecognitionResponseR.p();
            int iQ2 = audioRecognitionResponseR.q();
            int i2 = iQ2 != 0 ? r28.a[l1d.C(iQ2)] : -1;
            if (i2 == 1) {
                strP = cy30.p("MATCH(response_uri=", audioRecognitionResponseR.o().o(), ", playlist_uri=", audioRecognitionResponseR.o().getPlaylistUri(), ")");
            } else if (i2 == 2) {
                strP = "NO_MATCH";
            } else if (i2 == 3) {
                strP = f4i1.f("ERROR(", audioRecognitionResponseR.n().getMessage(), ")");
            } else if (i2 == 4) {
                strP = "PROCESSING";
            } else {
                if (i2 != 5) {
                    eg.o();
                    return;
                }
                strP = "RESULT_NOT_SET";
            }
            Logger.g("AudioRecognition <- recv %d bytes: request_id=%s %s", new Object[]{numValueOf, strP2, strP});
            ssw0Var.l(new n28(audioRecognitionResponseR));
        } catch (Throwable th) {
            ssw0Var.H(th);
        }
    }

    public final void S(ig01 ig01Var, ry21 ry21Var) {
        Logger.g("AudioRecognition WebSocket opened", new Object[0]);
        m441 m441Var = this.d;
        ssw0 ssw0Var = this.b;
        xab1 xab1VarT = fn31.T(ssw0Var, (o8n) null, 2, new wc5(m441Var, ssw0Var, ig01Var, (lnm) null, (byte) 19), 1);
        AtomicReference atomicReference = this.c;
        atomicReference.set(xab1VarT);
        if (!(ssw0Var.l(o28.a) instanceof pge)) {
            xab1VarT.start();
            return;
        }
        while (!atomicReference.compareAndSet(xab1VarT, null) && atomicReference.get() == xab1VarT) {
        }
        xab1VarT.d((CancellationException) null);
        ig01Var.b(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, "error");
    }
}
