package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class um71 extends xm71 {
    public static final um71 b = new um71("header_action");
    public static final Parcelable.Creator<um71> CREATOR = new ff71((byte) 25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof um71);
    }

    public final int hashCode() {
        return 916525835;
    }

    public final String toString() {
        return "HeaderAction";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
