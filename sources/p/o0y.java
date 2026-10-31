package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o0y implements o4p0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ o0y(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.o4p0
    public final n4p0 a(q2p0 q2p0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new z52(new gdp(((m0y) obj).mo878create(), q2p0Var).M, (byte) 2);
            case 1:
                return new oas(xqu.a(new u9p(((xs10) obj).mo908create(), q2p0Var).W), (byte) 1);
            case 2:
                return new z52((chp) new voa(((ue50) obj).mo879create(), q2p0Var).E, (byte) 3);
            case 3:
                return new oas(xqu.a(new ynq(((th11) obj).mo915create(), q2p0Var).o0), (byte) 4);
            default:
                return new oas(xqu.a(new cyo(((emj1) obj).mo876create(), q2p0Var).r0), (byte) 5);
        }
    }

    @Override // p.o4p0
    public final boolean b(PlayerState playerState, Map map) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((i0y) obj).getClass();
                return o4p1.u(playerState) && !l4o1.Y((ContextTrack) playerState.track().b());
            case 1:
                us10 us10Var = (us10) obj;
                us10Var.getClass();
                if (!l4o1.Y((ContextTrack) playerState.track().b())) {
                    if (us10Var.a.a(playerState) || aqz0.b(playerState.contextUri())) {
                        return true;
                    }
                    String strContextUri = playerState.contextUri();
                    if ((strContextUri != null && strContextUri.startsWith("spotify:radio:")) || l4o1.I((ContextTrack) playerState.track().b())) {
                        return true;
                    }
                }
                return false;
            case 2:
                return ((Boolean) playerState.track().i(new we50((s6z0) obj, (byte) 0)).e(Boolean.FALSE)).booleanValue();
            case 3:
                ((rh11) obj).getClass();
                return rh11.c(map);
            default:
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                contextTrack.getClass();
                return s3o1.v(contextTrack, false) || (((un4) obj).c() && o4p1.v(playerState) && !l4o1.F(contextTrack));
        }
    }
}
