package com.spotify.localfiles.mediastore;

import android.database.Cursor;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0002\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"MILLISECONDS_IN_SECOND", "", "DURATION", "", "isInt", "", "Landroid/database/Cursor;", "col", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class MediaStoreReaderKt {
    private static String DURATION = "duration";
    private static final int MILLISECONDS_IN_SECOND = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInt(Cursor cursor, int i) {
        return cursor.getType(i) == 1;
    }
}
