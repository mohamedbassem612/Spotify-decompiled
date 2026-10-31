package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class dr51 {
    public static final boolean a(ContextTrack contextTrack) {
        return contextTrack.metadata().containsKey("narration.intro.ssml") || contextTrack.metadata().containsKey("narration.intro.uri") || contextTrack.metadata().containsKey("narration.jump.ssml") || contextTrack.metadata().containsKey("narration.jump.uri");
    }

    public static final boolean b(ContextTrack contextTrack) {
        return u890.j(contextTrack.metadata().get("jump_track"), "true");
    }

    public static final ayx0 c(el81 el81Var) {
        int iOrdinal = el81Var.ordinal();
        if (iOrdinal == 0) {
            return ayx0.c;
        }
        if (iOrdinal == 1) {
            return ayx0.b;
        }
        if (iOrdinal == 2) {
            return ayx0.d;
        }
        eg.o();
        return null;
    }
}
