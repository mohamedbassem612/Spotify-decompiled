package com.spotify.carapplibrary.app.imageloading;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import p.nvc;
import p.sjo0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/carapplibrary/app/imageloading/CalImageProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "src_main_java_com_spotify_carapplibrary_app-app"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CalImageProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        return new String[]{"image/png"};
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "image/png";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        Context context = getContext();
        if (context == null || context.getCacheDir() == null) {
            return null;
        }
        nvc nvcVarV = sjo0.v();
        if (nvcVarV != null) {
            return nvcVarV.a(uri);
        }
        throw new FileNotFoundException("CAL session not initialized yet");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
