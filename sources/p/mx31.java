package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mx31 extends nx31 {
    public static final mx31 a = new mx31();
    public static final Parcelable.Creator<mx31> CREATOR = new xw31((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mx31);
    }

    public final int hashCode() {
        return 1136849707;
    }

    public final String toString() {
        return "RemoteDownloadsDisabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
