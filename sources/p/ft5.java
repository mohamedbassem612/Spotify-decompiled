package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ft5 extends cv5 {
    public static final et5 Companion = new et5();
    public String b;
    public String c;
    public Boolean d;
    public Boolean e;

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Illegal instructions before constructor call */
    public ft5(PlayerState playerState) {
        String strUri;
        boolean z;
        spq0 spq0VarTrack;
        ContextTrack contextTrack;
        j380 j380VarMetadata;
        String str;
        ContextTrack contextTrack2;
        j380 j380VarMetadata2;
        String str2;
        ContextTrack contextTrack3;
        if (playerState == null || (spq0VarTrack = playerState.track()) == null) {
            strUri = null;
        } else {
            spq0 spq0VarTrack2 = spq0VarTrack2.c() ? spq0VarTrack2 : null;
            if (spq0VarTrack2 == null || (contextTrack3 = (ContextTrack) spq0VarTrack2.b()) == null) {
                strUri = null;
            } else {
                strUri = contextTrack3.uri();
            }
        }
        boolean z2 = false;
        if (playerState == null || (spq0VarTrack = playerState.track()) == null) {
            z = false;
        } else {
            spq0 spq0VarTrack3 = spq0VarTrack3.c() ? spq0VarTrack3 : null;
            if (spq0VarTrack3 == null || (contextTrack2 = (ContextTrack) spq0VarTrack3.b()) == null || (j380VarMetadata2 = contextTrack2.metadata()) == null || (str2 = (String) j380VarMetadata2.get("collection.in_collection")) == null) {
                z = false;
            } else {
                z = Boolean.parseBoolean(str2);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (playerState != null && (spq0VarTrack = playerState.track()) != null) {
            spq0 spq0Var = spq0VarTrack.c() ? spq0VarTrack : null;
            if (spq0Var != null && (contextTrack = (ContextTrack) spq0Var.b()) != null && (j380VarMetadata = contextTrack.metadata()) != null && (str = (String) j380VarMetadata.get("collection.can_add")) != null) {
                z2 = Boolean.parseBoolean(str);
            }
        }
        this(strUri, boolValueOf, Boolean.valueOf(z2));
        if (playerState == null) {
            this.d = Boolean.FALSE;
            return;
        }
        spq0 spq0VarTrack4 = playerState.track();
        if (!spq0VarTrack4.c()) {
            this.d = Boolean.FALSE;
            return;
        }
        ContextTrack contextTrack4 = (ContextTrack) spq0VarTrack4.b();
        this.b = contextTrack4.uri();
        this.d = Boolean.valueOf(Boolean.parseBoolean((String) contextTrack4.metadata().get("collection.in_collection")));
        this.e = Boolean.valueOf(Boolean.parseBoolean((String) contextTrack4.metadata().get("collection.can_add")));
    }

    public ft5(String str, Boolean bool, Boolean bool2) {
        this.b = str;
        this.c = null;
        this.d = bool;
        this.e = bool2;
    }
}
