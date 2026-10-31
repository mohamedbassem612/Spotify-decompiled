package p;

import android.content.Context;
import com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService;
import com.spotify.share.resultreceiver.api.ShareResultReceiver;
import com.spotify.widgets.npvwidget.PlaybackCommandHandlerService;
import com.spotify.widgets.npvwidget.k;
import com.spotify.widgets.npvwidget.m;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n0q implements dl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ n0q(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 2:
                PlaybackCommandHandlerService playbackCommandHandlerService = (PlaybackCommandHandlerService) obj;
                playbackCommandHandlerService.b = new ae5((t2j0) daqVar.f2.get());
                y610 y610Var = (y610) daqVar.Tf.get();
                ruz ruzVarQ = f2u0.q(xqu.a(daqVar.Hg), new cve0((yqg) daqVar.J1.get()));
                m mVar = new m((i8h1) daqVar.A5.get(), (mwn0) daqVar.Wd.get());
                y210 y210Var = new y210((g510) daqVar.L5.get(), (q8n) daqVar.E1.get());
                Context context = (Context) daqVar.x1.a;
                playbackCommandHandlerService.a = new k(y610Var, ruzVarQ, mVar, y210Var, context, new vnr(context), new ae5((t2j0) daqVar.f2.get()), new gal((Context) daqVar.x1.a, (oj3) daqVar.u8.get(), (byte) 17), (xm41) daqVar.l5.get(), (q8n) daqVar.E1.get());
                break;
            case 3:
                ((ShareResultReceiver) obj).b = (m771) daqVar.Ho.get();
                break;
            default:
                SpotifyMediaRouteProviderService spotifyMediaRouteProviderService = (SpotifyMediaRouteProviderService) obj;
                g3e g3eVar = (g3e) ((b8p) daqVar.f4.get()).O.get();
                c8o.m(g3eVar);
                spotifyMediaRouteProviderService.g = g3eVar;
                spotifyMediaRouteProviderService.h = new bn(((b8p) daqVar.f4.get()).y1, (byte) 4);
                bwh0 bwh0Var = (bwh0) ((b8p) daqVar.f4.get()).t0.get();
                c8o.m(bwh0Var);
                spotifyMediaRouteProviderService.i = bwh0Var;
                break;
        }
    }

    public /* synthetic */ n0q(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}
