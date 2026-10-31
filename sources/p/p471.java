package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p471 extends o571 {
    public static final p471 d = new p471(18, "download-copy-link");
    public static final Parcelable.Creator<p471> CREATOR = new o471((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p471);
    }

    public final int hashCode() {
        return -1607656478;
    }

    public final String toString() {
        return "Download";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
