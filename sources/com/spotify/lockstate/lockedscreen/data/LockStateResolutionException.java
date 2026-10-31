package com.spotify.lockstate.lockedscreen.data;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.g5d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/lockstate/lockedscreen/data/LockStateResolutionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_lockstate_lockedscreen-lockedscreen"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class LockStateResolutionException extends Exception {
    public LockStateResolutionException(int i) {
        super("Lock state resolution failed: ".concat(g5d0.t(i)));
    }
}
