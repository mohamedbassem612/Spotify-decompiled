package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g62 implements o4p0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ g62(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.o4p0
    public final n4p0 a(q2p0 q2p0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new z52(new wxo(((e62) obj).mo875create(), q2p0Var).y, (byte) 0);
            case 1:
                return new oas(xqu.a((d7p) new uap(((qas) obj).mo907create(), q2p0Var).j0), (byte) 0);
            case 2:
                return new oas(xqu.a(new iip(((gm30) obj).mo912create(), q2p0Var).f0), (byte) 2);
            default:
                return new oas(xqu.a(new fyp(((j5v0) obj).mo906create(), q2p0Var).k0), (byte) 3);
        }
    }

    @Override // p.o4p0
    public final boolean b(PlayerState playerState, Map map) {
        switch (this.a) {
            case 0:
                return l4o1.E((ContextTrack) playerState.track().b());
            case 1:
                return true;
            case 2:
                return !y7y0.L(map);
            default:
                return l4o1.P((ContextTrack) playerState.track().b()) || l4o1.N((ContextTrack) playerState.track().b()) || Boolean.parseBoolean((String) ((ContextTrack) playerState.track().b()).metadata().get(ContextTrack$Metadata.KEY_IS_AUDIOBOOK_RECAP));
        }
    }
}
