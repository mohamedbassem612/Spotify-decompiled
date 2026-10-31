package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dz implements Parcelable {
    public static final dz a = new dz();
    public static final Parcelable.Creator<dz> CREATOR = new gp((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dz);
    }

    public final int hashCode() {
        return -371711337;
    }

    public final String toString() {
        return "Dismiss";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
