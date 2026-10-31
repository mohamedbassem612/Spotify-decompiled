package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h8u0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8u0 b;
    public final /* synthetic */ llm c;

    public /* synthetic */ h8u0(i8u0 i8u0Var, llm llmVar, byte b) {
        this.a = b;
        this.b = i8u0Var;
        this.c = llmVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ngv ngvVar = ngv.d;
        i8u0 i8u0Var = this.b;
        llm llmVar = this.c;
        switch (b) {
            case 0:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                if (strUri != null) {
                    String strK = nzy.k(strUri);
                    int i = i8u0.o;
                    x2p1 x2p1Var = i8u0Var.a;
                    if (x2p1Var instanceof e8u0) {
                        str = ((e8u0) x2p1Var).c;
                    } else {
                        if (!(x2p1Var instanceof d8u0)) {
                            eg.o();
                            return null;
                        }
                        str = ((d8u0) x2p1Var).c;
                    }
                    if (strK.equals(nzy.k(str))) {
                        boolean z = playerState.isPlaying() && !playerState.isPaused();
                        spq0 spq0VarDuration = playerState.duration();
                        if (spq0VarDuration.c()) {
                            Long l = (Long) spq0VarDuration.b();
                            if (l.longValue() > 0) {
                                ytw0 ytw0Var = jfv.b;
                                i8u0Var.i = new jfv(fdg1.l0(l.longValue(), ngvVar));
                            }
                        }
                        if (z) {
                            i8u0Var.d(llmVar);
                            return rih1Var;
                        }
                        if (i8u0Var.f != 2) {
                            return rih1Var;
                        }
                        i8u0Var.a();
                        i8u0Var.h = null;
                        xab1 xab1Var = i8u0Var.k;
                        if (xab1Var != null) {
                            xab1Var.d((CancellationException) null);
                        }
                        i8u0Var.k = null;
                        i8u0Var.e(llmVar);
                        return rih1Var;
                    }
                }
                int i2 = i8u0Var.f;
                if (i2 != 2 || i2 != 2) {
                    return rih1Var;
                }
                i8u0Var.a();
                i8u0Var.h = null;
                xab1 xab1Var2 = i8u0Var.k;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                i8u0Var.k = null;
                i8u0Var.c();
                i8u0Var.b();
                return rih1Var;
            default:
                i091 i091Var = (i091) obj;
                long j = i091Var.e;
                if (j > 0) {
                    ytw0 ytw0Var2 = jfv.b;
                    i8u0Var.i = new jfv(fdg1.l0(j, ngvVar));
                }
                o091 o091Var = i091Var.h;
                if (o091Var instanceof n091) {
                    int i3 = i8u0.o;
                    i8u0Var.d(llmVar);
                    return rih1Var;
                }
                if (!(o091Var instanceof m091) && !(o091Var instanceof j091) && !(o091Var instanceof l091) && !(o091Var instanceof k091)) {
                    eg.o();
                    return null;
                }
                int i4 = i8u0.o;
                if (i8u0Var.f != 2) {
                    return rih1Var;
                }
                i8u0Var.a();
                i8u0Var.h = null;
                xab1 xab1Var3 = i8u0Var.k;
                if (xab1Var3 != null) {
                    xab1Var3.d((CancellationException) null);
                }
                i8u0Var.k = null;
                i8u0Var.e(llmVar);
                return rih1Var;
        }
    }
}
