package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cz2 implements o4p0 {
    public final az2 a;
    public final ev4 b;
    public final un4 c;
    public final eg0 d;

    public cz2(az2 az2Var, ev4 ev4Var, un4 un4Var, eg0 eg0Var) {
        this.a = az2Var;
        this.b = ev4Var;
        this.c = un4Var;
        this.d = eg0Var;
    }

    @Override // p.o4p0
    public final n4p0 a(q2p0 q2p0Var) {
        return new z52(new cyo(this.a.create(), q2p0Var).r0, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    @Override // p.o4p0
    public final boolean b(PlayerState playerState, Map map) {
        boolean z;
        if (this.b.a()) {
            ContextTrack contextTrack = (ContextTrack) playerState.track().b();
            if (this.c.c() && o4p1.v(playerState)) {
                contextTrack.getClass();
                if (l4o1.F(contextTrack)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            contextTrack.getClass();
            if ((s3o1.v(contextTrack, false) || z) && !xoi1.a(this.d.a)) {
                return true;
            }
        }
        return false;
    }
}
