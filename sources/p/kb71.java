package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kb71 extends bc71 {
    public static final kb71 a = new kb71();
    public static final Parcelable.Creator<kb71> CREATOR = new v871((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kb71);
    }

    public final int hashCode() {
        return -629392669;
    }

    public final String toString() {
        return "ExternalLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
