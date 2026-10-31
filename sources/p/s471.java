package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s471 extends o571 {
    public static final s471 d = new s471(7, "facebook-stories");
    public static final Parcelable.Creator<s471> CREATOR = new o471((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s471);
    }

    public final int hashCode() {
        return 1051911699;
    }

    public final String toString() {
        return "FacebookStories";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
