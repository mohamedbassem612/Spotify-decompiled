package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ive extends lve {
    public static final ive a = new ive();
    public static final Parcelable.Creator<ive> CREATOR = new zge((byte) 23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ive);
    }

    public final int hashCode() {
        return 40240583;
    }

    public final String toString() {
        return "ChatDeleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
