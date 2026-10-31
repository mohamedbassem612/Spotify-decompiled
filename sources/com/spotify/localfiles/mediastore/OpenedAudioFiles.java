package com.spotify.localfiles.mediastore;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import com.spotify.localfiles.localfilesmonorepo.AddedLocalFile;
import com.spotify.localfiles.proto.LocalFile;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p.gvg;
import p.i46;
import p.ihc1;
import p.k4p1;
import p.n561;
import p.pze0;
import p.u890;
import p.y6b1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/spotify/localfiles/proto/LocalFile;", "Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "toAddedLocalFile", "(Lcom/spotify/localfiles/proto/LocalFile;)Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "", "toSpotifyLocalUri", "(Lcom/spotify/localfiles/proto/LocalFile;)Ljava/lang/String;", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "Landroid/net/Uri;", "uri", "path", "Lcom/spotify/localfiles/proto/LocalFile$Builder;", "file", "Lcom/spotify/localfiles/proto/LocalFile$Metadata$Builder;", "metadata", "Lp/rih1;", "decorate", "(Landroid/media/MediaMetadataRetriever;Landroid/net/Uri;Ljava/lang/String;Lcom/spotify/localfiles/proto/LocalFile$Builder;Lcom/spotify/localfiles/proto/LocalFile$Metadata$Builder;)V", "displayName", "(Landroid/net/Uri;)Ljava/lang/String;", "resolveTemporary", "(Landroid/net/Uri;)Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "registerTemporary", "(Landroid/net/Uri;)V", "removeTemporary", "toFile", "(Landroid/net/Uri;)Lcom/spotify/localfiles/proto/LocalFile;", "Landroid/content/Context;", "", "temporaryFiles", "Ljava/util/Map;", "Lp/n561;", "getFiles", "()Lp/n561;", "files", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class OpenedAudioFiles {
    private final Context context;
    private final Map<Uri, AddedLocalFile> temporaryFiles = new LinkedHashMap();

    public OpenedAudioFiles(Context context) {
        this.context = context;
    }

    private final void decorate(MediaMetadataRetriever mediaMetadataRetriever, Uri uri, String path, LocalFile.Builder file, LocalFile.Metadata.Builder metadata) {
        file.setPath(path);
        mediaMetadataRetriever.setDataSource(this.context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(7);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(1);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(2);
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
        boolean z = mediaMetadataRetriever.getEmbeddedPicture() != null;
        if (strExtractMetadata == null && (strExtractMetadata = displayName(uri)) == null) {
            strExtractMetadata = uri.getLastPathSegment();
        }
        metadata.setTitle(strExtractMetadata);
        if (strExtractMetadata2 == null) {
            strExtractMetadata2 = "";
        }
        metadata.setAlbum(strExtractMetadata2);
        if (strExtractMetadata3 == null) {
            strExtractMetadata3 = "";
        }
        metadata.setArtist(strExtractMetadata3);
        metadata.setDuration((strExtractMetadata4 != null ? Integer.parseInt(strExtractMetadata4) : 0) / 1000);
        metadata.setImageState(z ? LocalFile.Metadata.ImageState.AVAILABLE : LocalFile.Metadata.ImageState.UNAVAILABLE);
        file.setMetadata(metadata.build());
    }

    private final String displayName(Uri uri) throws IOException {
        Cursor cursorQuery = this.context.getContentResolver().query(uri, (String[]) k4p1.x("_display_name").toArray(new String[0]), null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            if (columnIndex < 0 || !cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return null;
            }
            String string = cursorQuery.getString(columnIndex);
            String strA1 = string != null ? ihc1.a1(string, '.') : null;
            cursorQuery.close();
            return strA1;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(cursorQuery, th);
                throw th2;
            }
        }
    }

    private final AddedLocalFile toAddedLocalFile(LocalFile localFile) {
        return new AddedLocalFile(localFile.getMetadata().getDuration(), localFile.getMetadata().getAlbum(), localFile.getMetadata().getArtist(), localFile.getMetadata().getTitle(), toSpotifyLocalUri(localFile));
    }

    private final String toSpotifyLocalUri(LocalFile localFile) {
        String strE = y6b1.e(localFile.getMetadata().getArtist());
        String strE2 = y6b1.e(localFile.getMetadata().getAlbum());
        String strE3 = y6b1.e(localFile.getMetadata().getTitle());
        int duration = localFile.getMetadata().getDuration();
        StringBuilder sbN = gvg.n("spotify:local:", strE, ":", strE2, ":");
        sbN.append(strE3);
        sbN.append(":");
        sbN.append(duration);
        return sbN.toString();
    }

    public final n561 getFiles() {
        return new i46(this.temporaryFiles.keySet(), (byte) 1);
    }

    public final void registerTemporary(Uri uri) {
        if (this.temporaryFiles.containsKey(uri)) {
            return;
        }
        this.temporaryFiles.put(uri, null);
    }

    public final void removeTemporary(Uri uri) {
        this.temporaryFiles.remove(uri);
    }

    public final AddedLocalFile resolveTemporary(Uri uri) throws IOException {
        AddedLocalFile addedLocalFile = this.temporaryFiles.get(uri);
        if (addedLocalFile != null) {
            return addedLocalFile;
        }
        LocalFile file = toFile(uri);
        AddedLocalFile addedLocalFile2 = file != null ? toAddedLocalFile(file) : null;
        this.temporaryFiles.put(uri, addedLocalFile2);
        return addedLocalFile2;
    }

    public final LocalFile toFile(Uri uri) throws IOException {
        String string;
        LocalFile localFile = null;
        if (u890.j(uri.getScheme(), "file")) {
            string = uri.getPath();
            if (string == null) {
                return null;
            }
        } else {
            string = uri.toString();
            string.getClass();
        }
        String str = string;
        LocalFile.Builder builderNewBuilder = LocalFile.newBuilder();
        LocalFile.Metadata.Builder builderNewBuilder2 = LocalFile.Metadata.newBuilder();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            builderNewBuilder.getClass();
            builderNewBuilder2.getClass();
            decorate(mediaMetadataRetriever, uri, str, builderNewBuilder, builderNewBuilder2);
            localFile = (LocalFile) builderNewBuilder.build();
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            pze0.l(mediaMetadataRetriever);
        } else {
            mediaMetadataRetriever.release();
        }
        return localFile;
    }
}
