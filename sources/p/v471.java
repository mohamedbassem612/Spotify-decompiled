package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v471 extends o571 {
    public static final v471 d = new v471(6, "instagram-notes");
    public static final Parcelable.Creator<v471> CREATOR = new o471((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v471);
    }

    public final int hashCode() {
        return -1010156023;
    }

    public final String toString() {
        return "InstagramNotes";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
