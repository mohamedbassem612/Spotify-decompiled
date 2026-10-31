package com.spotify.localfiles.localfilescore;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bc\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/spotify/localfiles/localfilescore/LocalFilesServiceFactoryComponent;", "", "localFilesService", "Lcom/spotify/localfiles/localfilescore/LocalFilesService;", "Factory", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
interface LocalFilesServiceFactoryComponent {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/spotify/localfiles/localfilescore/LocalFilesServiceFactoryComponent$Factory;", "", "create", "Lcom/spotify/localfiles/localfilescore/LocalFilesServiceFactoryComponent;", "dependencies", "Lcom/spotify/localfiles/localfilescore/LocalFilesServiceDependencies;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public interface Factory {
        LocalFilesServiceFactoryComponent create(LocalFilesServiceDependencies dependencies);
    }

    LocalFilesService localFilesService();
}
