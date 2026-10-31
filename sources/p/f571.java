package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f571 extends o571 {
    public static final f571 d = new f571(0, "snapchat");
    public static final Parcelable.Creator<f571> CREATOR = new o471((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f571);
    }

    public final int hashCode() {
        return 1543889276;
    }

    public final String toString() {
        return "Snapchat";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
