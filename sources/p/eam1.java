package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eam1 implements pam1 {
    public static final eam1 a = new eam1();
    public static final Parcelable.Creator<eam1> CREATOR = new w8m1((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eam1);
    }

    public final int hashCode() {
        return 69208569;
    }

    public final String toString() {
        return "PlayAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
