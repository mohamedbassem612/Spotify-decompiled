package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import p.cyh0;
import p.hhg1;
import p.pze0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new cyh0((byte) 0);
    public final MediaDescriptionCompat a;
    public final long b;
    public MediaSession.QueueItem c;

    public MediaSessionCompat$QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            hhg1.n("Description cannot be null");
            throw null;
        }
        if (j == -1) {
            hhg1.n("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.a = mediaDescriptionCompat;
        this.b = j;
        this.c = queueItem;
    }

    public final long a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return pze0.h(this.b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
