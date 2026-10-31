package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gfa1 implements Parcelable {
    public static final gfa1 a = new gfa1();
    public static final Parcelable.Creator<gfa1> CREATOR = new yx81((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gfa1);
    }

    public final int hashCode() {
        return 1842196779;
    }

    public final String toString() {
        return "SongDnaUnavailablePageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
