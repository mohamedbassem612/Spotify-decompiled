package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p.eyh0;
import p.hug0;
import p.y36;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final y36 c;
    public final Bundle a;
    public MediaMetadata b;

    static {
        y36 y36Var = new y36(0);
        c = y36Var;
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_TITLE, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ARTIST, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, 0);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_AUTHOR, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_WRITER, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_COMPOSER, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_COMPILATION, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DATE, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_YEAR, 0);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_GENRE, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, 0);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, 0);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ART, 2);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ART_URI, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ART, 2);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_USER_RATING, 3);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_RATING, 3);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 2);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 1);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, 0);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 1);
        y36Var.put("android.media.metadata.ADVERTISEMENT", 0);
        y36Var.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
        CREATOR = new hug0((byte) 25);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(eyh0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        eyh0.b(bundle2);
    }
}
