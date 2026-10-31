package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jve extends lve {
    public static final jve a = new jve();
    public static final Parcelable.Creator<jve> CREATOR = new zge((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jve);
    }

    public final int hashCode() {
        return -165217852;
    }

    public final String toString() {
        return "GroupChatLeft";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
