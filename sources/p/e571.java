package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e571 extends o571 {
    public static final e571 d = new e571(12, "sms");
    public static final Parcelable.Creator<e571> CREATOR = new o471(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e571);
    }

    public final int hashCode() {
        return -1987364417;
    }

    public final String toString() {
        return "Sms";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
