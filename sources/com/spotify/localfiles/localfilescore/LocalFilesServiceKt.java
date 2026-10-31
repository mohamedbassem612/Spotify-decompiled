package com.spotify.localfiles.localfilescore;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createLocalFilesService", "Lcom/spotify/localfiles/localfilescore/LocalFilesService;", "dependencies", "Lcom/spotify/localfiles/localfilescore/LocalFilesServiceDependencies;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, k = 2, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class LocalFilesServiceKt {
    public static final LocalFilesService createLocalFilesService(LocalFilesServiceDependencies localFilesServiceDependencies) {
        return DaggerLocalFilesServiceFactoryComponent.factory().create(localFilesServiceDependencies).localFilesService();
    }
}
