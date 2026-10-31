package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.Credits;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lj11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContextTrack b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj11(ContextTrack contextTrack, byte b) {
        super(1);
        this.a = b;
        this.b = contextTrack;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ContextTrack contextTrack = this.b;
        switch (b) {
            case 0:
                return l4o1.l(contextTrack);
            default:
                m6o m6oVarQ = Credits.q();
                m6oVarQ.q(contextTrack.uri());
                m6oVarQ.n(l4o1.n(contextTrack));
                ((bf51) obj).t((Credits) m6oVarQ.build());
                return rih1.a;
        }
    }
}
