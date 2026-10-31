package com.spotify.profile.profilelist;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/spotify/profile/profilelist/ProfileListPage$FailLoadingProfileListException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "src_main_java_com_spotify_profile_profilelist-profilelist"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class ProfileListPage$FailLoadingProfileListException extends RuntimeException {
    public ProfileListPage$FailLoadingProfileListException() {
        super("Failed loading profile list");
    }
}
