package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a571 extends o571 {
    public static final a571 d = new a571(null, "qr-code");
    public static final Parcelable.Creator<a571> CREATOR = new o471((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a571);
    }

    public final int hashCode() {
        return 496867720;
    }

    public final String toString() {
        return "QrCode";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
