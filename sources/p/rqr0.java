package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rqr0 implements Parcelable.Creator {
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        String string = parcel.readString();
        string.getClass();
        if (string != null) {
            if (string.equals("UNKNOWN")) {
                i = 1;
            } else if (string.equals("CONTROL")) {
                i = 2;
            } else if (string.equals("LISTEN_AND_CONTROL")) {
                i = 3;
            } else {
                hhg1.n("No enum constant com.spotify.jam.jam.Jam.AvailableJam.PlaybackControl.".concat(string));
            }
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new sqr0(new no90(i, new lo90(z), new oo90(parcel.readByte() != 0)));
        }
        bhn0.i("Name is null");
        i = 0;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new sqr0(new no90(i, new lo90(z), new oo90(parcel.readByte() != 0)));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new sqr0[i];
    }
}
