package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l571 extends o571 {
    public static final l571 d = new l571(2, "whatsapp");
    public static final Parcelable.Creator<l571> CREATOR = new o471((byte) 22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l571);
    }

    public final int hashCode() {
        return -1100694292;
    }

    public final String toString() {
        return "Whatsapp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
