package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class to20 extends wo20 {
    public static final Parcelable.Creator<to20> CREATOR = new qe20((byte) 13);
    public final int a;

    public to20(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to20) && this.a == ((to20) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "VIDEOS";
        } else if (i2 == 2) {
            str = "PODCAST_AND_EPISODES";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "LIVE_EVENTS";
        }
        parcel.writeString(str);
    }
}
