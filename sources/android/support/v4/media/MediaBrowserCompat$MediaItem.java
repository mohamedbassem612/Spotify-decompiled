package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p.hhg1;
import p.hug0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new hug0((byte) 17);
    public final int a;
    public final MediaDescriptionCompat b;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
            hhg1.n("description must have a non-empty media id");
            throw null;
        }
        this.a = i;
        this.b = mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
