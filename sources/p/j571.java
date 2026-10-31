package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j571 extends o571 {
    public static final j571 d = new j571(14, "tiktok-messages");
    public static final Parcelable.Creator<j571> CREATOR = new o471((byte) 20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j571);
    }

    public final int hashCode() {
        return 463004736;
    }

    public final String toString() {
        return "TiktokMessages";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
