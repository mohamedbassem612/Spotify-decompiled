package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m8g1 implements okf1 {
    public final n8g1 a;

    public m8g1(n8g1 n8g1Var) {
        this.a = n8g1Var;
    }

    @Override // p.okf1
    public final nkf1 a(q2p0 q2p0Var) {
        return this.a.g(q2p0Var).k();
    }

    @Override // p.okf1
    public final boolean b(kkf1 kkf1Var) {
        ContextTrack contextTrack = kkf1Var.a;
        return l4o1.P(contextTrack) && !l4o1.X(contextTrack) && ((Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_HAS_TRANSCRIPTS)) && !Boolean.parseBoolean((String) contextTrack.metadata().get("transcripts_disallowed_in_content_layer"))) || Boolean.parseBoolean((String) contextTrack.metadata().get("has_companion_content")));
    }
}
