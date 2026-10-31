package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m471 extends o571 {
    public static final m471 d = new m471(16, "copy-link");
    public static final Parcelable.Creator<m471> CREATOR = new hs61(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m471);
    }

    public final int hashCode() {
        return 753296489;
    }

    public final String toString() {
        return "CopyLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
