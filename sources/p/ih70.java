package p;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ih70 implements lh70 {
    public final IBinder a;

    public ih70(IBinder iBinder) {
        this.a = iBinder;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final PlaybackStateCompat getPlaybackState() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(28, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (PlaybackStateCompat) vyo1.z(parcelObtain2, PlaybackStateCompat.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
