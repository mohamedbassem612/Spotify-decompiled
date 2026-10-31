package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ox31 implements px31 {
    public static final ox31 a = new ox31();
    public static final Parcelable.Creator<ox31> CREATOR = new xw31((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ox31);
    }

    public final int hashCode() {
        return -2047554587;
    }

    public final String toString() {
        return "Enabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
