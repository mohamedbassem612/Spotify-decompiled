package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;
import io.reactivex.rxjava3.functions.Consumer;
import java.net.URL;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gdu0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gdu0(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                BetamaxPlaybackException betamaxPlaybackException = new BetamaxPlaybackException("Playback stuck", xjz.ERROR_PLAYBACK_STUCK, null);
                Logger.l(betamaxPlaybackException, "Timed out after stalling for %d second(s)", new Object[]{Long.valueOf(j)});
                m9n m9nVar = ((hdu0) obj3).Y;
                m9nVar.b.accept(m9nVar.a.c(i3p1.x(betamaxPlaybackException, (m0u0) obj2)));
                break;
            default:
                iq51 iq51Var = (iq51) obj3;
                String str = iq51Var.c;
                URL[] urlArr = iq51Var.d;
                long j2 = ((o811) obj2).a;
                StringBuilder sbT = l1d.t("Error requesting segment ", str, " with baseUrls ");
                sbT.append(urlArr);
                sbT.append(" from ");
                sbT.append(j2);
                sbT.append(" to ");
                sbT.append(j);
                Logger.d(sbT.toString(), new Object[]{(Throwable) obj});
                break;
        }
    }
}
