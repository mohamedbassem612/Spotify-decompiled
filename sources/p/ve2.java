package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ve2 extends we2 {
    public static final ve2 b = new ve2("https://age-assurance.spotify.com/collect/start");
    public static final Parcelable.Creator<ve2> CREATOR = new ue2((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ve2);
    }

    public final int hashCode() {
        return -143828148;
    }

    public final String toString() {
        return "Collect";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
