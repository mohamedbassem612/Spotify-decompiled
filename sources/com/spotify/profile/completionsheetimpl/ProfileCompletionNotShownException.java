package com.spotify.profile.completionsheetimpl;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/profile/completionsheetimpl/ProfileCompletionNotShownException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "src_main_java_com_spotify_profile_completionsheetimpl-completionsheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class ProfileCompletionNotShownException extends IllegalStateException {
    public ProfileCompletionNotShownException(String str) {
        super("Profile completion should not be shown for: ".concat(str));
    }
}
