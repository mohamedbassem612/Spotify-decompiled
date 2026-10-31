package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e8z implements yt11 {
    public final /* synthetic */ yt11 a;
    public final lik1 b;
    public final aas c;
    public final q8n d;
    public final vu1 e;
    public final b7r0 f;
    public final r9d1 g;

    public e8z(yzc0 yzc0Var, lik1 lik1Var, aas aasVar, q8n q8nVar, vu1 vu1Var, pep pepVar, b7r0 b7r0Var, np4 np4Var, t3x t3xVar) {
        this.a = pepVar.a(t3xVar, yzc0Var, lik1Var);
        this.b = lik1Var;
        this.c = aasVar;
        this.d = q8nVar;
        this.e = vu1Var;
        this.f = b7r0Var;
        this.g = np4Var.a() ? new r9d1(new ks11(vjx.c, new lh2(3, this, e8z.class, "addToQueue", "addToQueue(Lcom/spotify/creativeworkplatform/releaserowelement/ReleaseStructuredData;Lcom/spotify/ubi/logger/InteractionLoggingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 5)), new ks11(irx.c, new lh2(3, this, e8z.class, "addToPlaylist", "addToPlaylist(Lcom/spotify/creativeworkplatform/releaserowelement/ReleaseStructuredData;Lcom/spotify/ubi/logger/InteractionLoggingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 6))) : null;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        return this.a.a(unb1Var, tv80Var, onmVar);
    }

    public final s9d1 b() {
        return this.g;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        return this.a.c(unb1Var, tv80Var, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(uv11 uv11Var, tv80 tv80Var, lnm lnmVar) {
        d8z d8zVar;
        ou80 ou80Var;
        if (lnmVar instanceof d8z) {
            d8zVar = (d8z) lnmVar;
            int i = d8zVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d8zVar.c = i - Integer.MIN_VALUE;
            } else {
                d8zVar = new d8z(this, lnmVar);
            }
        } else {
            d8zVar = new d8z(this, lnmVar);
        }
        Object obj = d8zVar.a;
        int i2 = d8zVar.c;
        String str = null;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                aas aasVar = this.c;
                String str2 = uv11Var.a;
                y6r0 y6r0Var = this.f.get();
                String str3 = y6r0Var != null ? y6r0Var.a : null;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                    str = ou80Var.a;
                }
                if (str != null) {
                    str4 = str;
                }
                CompletableObserveOn completableObserveOnB = aasVar.b(str2, str3, 2, str4);
                d8zVar.c = 1;
                Object objI = fc11.i(completableObserveOnB, d8zVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "EpisodePlaylistRowEventsHandler failed to add episode to queue.", new Object[0]);
        }
        return rih1.a;
    }
}
