package com.spotify.localfiles.mediastore;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.spotify.localfiles.proto.LocalFile;
import com.spotify.localfiles.proto.QueryResult;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p.ep20;
import p.ihc1;
import p.k4p1;
import p.nhc1;
import p.o7h;
import p.p7h;
import p.pze0;
import p.u890;
import p.z561;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001GB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J!\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\u001fJ!\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0082 ¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0082 ¢\u0006\u0004\b,\u0010+J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0082 ¢\u0006\u0004\b-\u0010+J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u00020\f¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b4\u0010+J\r\u00105\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u001d¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u001c\u0010?\u001a\n >*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/spotify/localfiles/mediastore/MediaStoreReader;", "", "Landroid/content/Context;", "context", "Lcom/spotify/localfiles/mediastore/MediaStoreReaderOptions;", "options", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "openedAudioFiles", "<init>", "(Landroid/content/Context;Lcom/spotify/localfiles/mediastore/MediaStoreReaderOptions;Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;)V", "Landroid/net/Uri;", "contentUri", "", "isTreeContentUri", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;Z)Landroid/database/Cursor;", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "Lcom/spotify/localfiles/proto/QueryResult$Builder;", "result", "Lp/rih1;", "queryUri", "(Landroid/media/MediaMetadataRetriever;Lcom/spotify/localfiles/proto/QueryResult$Builder;Landroid/net/Uri;)V", "fileUri", "queryFileUri", "cursor", "", "displayNameColumn", "", "displayName", "(Landroid/database/Cursor;I)Ljava/lang/String;", "titleColumn", "title", "durationColumn", "duration", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "s", "transformUnknown", "(Ljava/lang/String;)Ljava/lang/String;", "", "handle", "onChange", "(J)V", "prepareForShutdown", "freeHandle", "", "runQuery", "()[B", "cancelled", "setCancelled", "(Z)V", "startListening", "stopListening", "()V", "path", "triggerScan", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Lcom/spotify/localfiles/mediastore/MediaStoreReaderOptions;", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "contentResolver", "Landroid/content/ContentResolver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/spotify/localfiles/mediastore/MediaStoreReader$ObservedQueries;", "observedQueries", "Lcom/spotify/localfiles/mediastore/MediaStoreReader$ObservedQueries;", "ObservedQueries", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class MediaStoreReader {
    private final ContentResolver contentResolver;
    private final Context context;
    private final AtomicBoolean isCancelled = new AtomicBoolean(false);
    private ObservedQueries observedQueries;
    private final OpenedAudioFiles openedAudioFiles;
    private final MediaStoreReaderOptions options;

    public MediaStoreReader(Context context, MediaStoreReaderOptions mediaStoreReaderOptions, OpenedAudioFiles openedAudioFiles) {
        this.context = context;
        this.options = mediaStoreReaderOptions;
        this.openedAudioFiles = openedAudioFiles;
        this.contentResolver = context.getContentResolver();
    }

    private final String displayName(Cursor cursor, int displayNameColumn) {
        String string = cursor.getString(displayNameColumn);
        if (string != null) {
            return ihc1.a1(string, '.');
        }
        return null;
    }

    private final Integer duration(Cursor cursor, int durationColumn) {
        if (cursor.getType(durationColumn) == 1) {
            return Integer.valueOf(cursor.getInt(durationColumn) / 1000);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void freeHandle(long handle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void onChange(long handle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void prepareForShutdown(long handle);

    private final Cursor query(Uri contentUri, boolean isTreeContentUri) {
        if (isTreeContentUri) {
            contentUri = DocumentsContract.buildChildDocumentsUriUsingTree(contentUri, DocumentsContract.isDocumentUri(this.context, contentUri) ? DocumentsContract.getDocumentId(contentUri) : DocumentsContract.getTreeDocumentId(contentUri));
        }
        Uri uri = contentUri;
        ArrayList arrayListO = p7h.O("_id", "_display_name", "is_alarm", "is_music", "is_notification", "is_podcast", "is_ringtone", "title", MediaStoreReaderKt.access$getDURATION$p());
        if (isTreeContentUri) {
            arrayListO.addAll(p7h.M("document_id", "mime_type"));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            arrayListO.addAll(p7h.M("is_audiobook", "is_pending"));
        }
        if (i >= 30) {
            arrayListO.addAll(k4p1.x("is_trashed"));
        }
        ArrayList arrayList = new ArrayList();
        if (!this.options.getIncludeAlarms()) {
            arrayList.add("is_alarm == 0");
        }
        if (!this.options.getIncludeMusic()) {
            arrayList.add("is_music == 0");
        }
        if (!this.options.getIncludeNotifications()) {
            arrayList.add("is_notification == 0");
        }
        if (!this.options.getIncludePodcasts()) {
            arrayList.add("is_podcast == 0");
        }
        if (!this.options.getIncludeRingtones()) {
            arrayList.add("is_ringtone == 0");
        }
        if (i >= 29) {
            arrayList.add("is_pending == 0");
            if (!this.options.getIncludeAudiobooks()) {
                arrayList.add("is_audiobook == 0");
            }
        }
        if (i >= 30) {
            arrayList.add("is_trashed == 0");
        }
        if (this.options.getDurationMin() > 0) {
            arrayList.add(MediaStoreReaderKt.access$getDURATION$p() + " >= " + this.options.getDurationMin());
        }
        return this.contentResolver.query(uri, (String[]) arrayListO.toArray(new String[0]), o7h.y0(arrayList, " AND ", null, null, null, 62), null, null);
    }

    private final void queryFileUri(MediaMetadataRetriever mediaMetadataRetriever, QueryResult.Builder result, Uri fileUri) {
        Integer numC0;
        mediaMetadataRetriever.setDataSource(this.context, fileUri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(7);
        if (strExtractMetadata == null) {
            String lastPathSegment = fileUri.getLastPathSegment();
            strExtractMetadata = lastPathSegment != null ? ihc1.a1(lastPathSegment, '.') : null;
            if (strExtractMetadata == null) {
                return;
            }
        }
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(1);
        if (strExtractMetadata2 == null) {
            strExtractMetadata2 = "";
        }
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(2);
        String str = strExtractMetadata3 != null ? strExtractMetadata3 : "";
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
        if (strExtractMetadata4 == null || (numC0 = nhc1.c0(strExtractMetadata4)) == null) {
            return;
        }
        int iIntValue = numC0.intValue() / 1000;
        boolean z = mediaMetadataRetriever.getEmbeddedPicture() != null;
        LocalFile.Metadata.Builder builderNewBuilder = LocalFile.Metadata.newBuilder();
        builderNewBuilder.setTitle(strExtractMetadata);
        builderNewBuilder.setAlbum(strExtractMetadata2);
        builderNewBuilder.setArtist(str);
        builderNewBuilder.setDuration(iIntValue);
        builderNewBuilder.setImageState(z ? LocalFile.Metadata.ImageState.AVAILABLE : LocalFile.Metadata.ImageState.UNAVAILABLE);
        LocalFile.Builder builderNewBuilder2 = LocalFile.newBuilder();
        String path = fileUri.getPath();
        if (path == null) {
            return;
        }
        builderNewBuilder2.setPath(path);
        builderNewBuilder2.setMetadata(builderNewBuilder.build());
        result.addFiles(builderNewBuilder2);
    }

    private final void queryUri(MediaMetadataRetriever mediaMetadataRetriever, QueryResult.Builder result, Uri contentUri) throws IOException {
        boolean z;
        Uri uriWithAppendedId;
        MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
        Uri uri = contentUri;
        boolean zIsTreeUri = DocumentsContract.isTreeUri(uri);
        Cursor cursorQuery = query(uri, zIsTreeUri);
        if (cursorQuery == null) {
            return;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("document_id");
            int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
            int columnIndex3 = cursorQuery.getColumnIndex("_id");
            int columnIndex4 = cursorQuery.getColumnIndex("_display_name");
            int columnIndex5 = cursorQuery.getColumnIndex("title");
            int columnIndex6 = cursorQuery.getColumnIndex(MediaStoreReaderKt.access$getDURATION$p());
            LocalFile.Builder builderNewBuilder = LocalFile.newBuilder();
            LocalFile.Metadata.Builder builderNewBuilder2 = LocalFile.Metadata.newBuilder();
            while (cursorQuery.moveToNext()) {
                if (this.isCancelled.get()) {
                    cursorQuery.close();
                    return;
                }
                try {
                    if (zIsTreeUri) {
                        String string = cursorQuery.getString(columnIndex);
                        z = zIsTreeUri;
                        boolean zJ = u890.j(cursorQuery.getString(columnIndex2), "vnd.android.document/directory");
                        uriWithAppendedId = DocumentsContract.buildDocumentUriUsingTree(uri, string);
                        if (zJ) {
                            uriWithAppendedId.getClass();
                            queryUri(mediaMetadataRetriever2, result, uriWithAppendedId);
                        }
                        zIsTreeUri = z;
                    } else {
                        z = zIsTreeUri;
                        uriWithAppendedId = (DocumentsContract.isDocumentUri(this.context, uri) || !MediaStoreReaderKt.access$isInt(cursorQuery, columnIndex3)) ? uri : ContentUris.withAppendedId(uri, cursorQuery.getLong(columnIndex3));
                    }
                    mediaMetadataRetriever2.setDataSource(this.context, uriWithAppendedId);
                    String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(7);
                    String strExtractMetadata2 = mediaMetadataRetriever2.extractMetadata(1);
                    String strExtractMetadata3 = mediaMetadataRetriever2.extractMetadata(2);
                    String strExtractMetadata4 = mediaMetadataRetriever2.extractMetadata(9);
                    strExtractMetadata4.getClass();
                    int iIntValue = Integer.parseInt(strExtractMetadata4) / 1000;
                    boolean z2 = mediaMetadataRetriever2.getEmbeddedPicture() != null;
                    if (strExtractMetadata == null && (strExtractMetadata = title(cursorQuery, columnIndex5)) == null && (strExtractMetadata = displayName(cursorQuery, columnIndex4)) == null) {
                        strExtractMetadata = uriWithAppendedId.getLastPathSegment();
                    }
                    builderNewBuilder2.setTitle(strExtractMetadata);
                    builderNewBuilder2.setAlbum(strExtractMetadata2 == null ? "" : strExtractMetadata2);
                    if (strExtractMetadata3 == null) {
                        strExtractMetadata3 = "";
                    }
                    builderNewBuilder2.setArtist(strExtractMetadata3);
                    Integer numDuration = duration(cursorQuery, columnIndex6);
                    if (numDuration != null) {
                        iIntValue = numDuration.intValue();
                    }
                    builderNewBuilder2.setDuration(iIntValue);
                    builderNewBuilder2.setImageState(z2 ? LocalFile.Metadata.ImageState.AVAILABLE : LocalFile.Metadata.ImageState.UNAVAILABLE);
                } catch (Throwable unused) {
                    builderNewBuilder2.clear();
                    String strTitle = title(cursorQuery, columnIndex5);
                    if (strTitle == null && (strTitle = displayName(cursorQuery, columnIndex4)) == null) {
                        strTitle = uriWithAppendedId.getLastPathSegment();
                    }
                    builderNewBuilder2.setTitle(strTitle);
                    Integer numDuration2 = duration(cursorQuery, columnIndex6);
                    if (numDuration2 != null) {
                        builderNewBuilder2.setDuration(numDuration2.intValue());
                    }
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    uri = contentUri;
                    zIsTreeUri = z;
                }
                builderNewBuilder.setPath(uriWithAppendedId.toString());
                builderNewBuilder.setMetadata(builderNewBuilder2.build());
                result.addFiles(builderNewBuilder);
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                uri = contentUri;
                zIsTreeUri = z;
            }
            cursorQuery.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(cursorQuery, th);
                throw th2;
            }
        }
    }

    private final String title(Cursor cursor, int titleColumn) {
        if (cursor.getType(titleColumn) == 3) {
            return transformUnknown(cursor.getString(titleColumn));
        }
        return null;
    }

    private final String transformUnknown(String s) {
        return u890.j(s, "<unknown>") ? "" : s;
    }

    public final byte[] runQuery() throws IOException {
        QueryResult.Builder builderNewBuilder = QueryResult.newBuilder();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        ep20 ep20Var = new ep20(z561.Z(z561.i0(z561.h0(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI), this.openedAudioFiles.getFiles())));
        while (ep20Var.hasNext()) {
            Uri uri = (Uri) ep20Var.next();
            if (this.isCancelled.get()) {
                break;
            }
            try {
                if (u890.j(uri.getScheme(), "file") && this.options.getSupportFileUriScheme()) {
                    builderNewBuilder.getClass();
                    queryFileUri(mediaMetadataRetriever, builderNewBuilder, uri);
                } else if (!u890.j(uri.getScheme(), "file")) {
                    builderNewBuilder.getClass();
                    queryUri(mediaMetadataRetriever, builderNewBuilder, uri);
                }
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            pze0.l(mediaMetadataRetriever);
        } else {
            mediaMetadataRetriever.release();
        }
        return builderNewBuilder.build().toByteArray();
    }

    public final void setCancelled(boolean cancelled) {
        this.isCancelled.set(cancelled);
    }

    public final void startListening(long handle) {
        try {
            this.observedQueries = new ObservedQueries(p7h.N(query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, false)), handle, new startListening.1(this));
        } catch (Exception unused) {
        }
    }

    public final void stopListening() {
        ObservedQueries observedQueries = this.observedQueries;
        if (observedQueries != null) {
            observedQueries.prepareForShutdown(new stopListening.1(this));
        }
        ObservedQueries observedQueries2 = this.observedQueries;
        if (observedQueries2 != null) {
            observedQueries2.stop(new stopListening.2(this));
        }
        this.observedQueries = null;
    }

    public final void triggerScan(String path) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(path)));
        this.context.sendBroadcast(intent, null);
    }
}
