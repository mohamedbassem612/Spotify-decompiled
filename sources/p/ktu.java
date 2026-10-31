package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ktu implements Parcelable {
    public static final ktu a = new ktu();
    public static final Parcelable.Creator<ktu> CREATOR = new zrt((byte) 22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ktu);
    }

    public final int hashCode() {
        return 586460058;
    }

    public final String toString() {
        return "DownloadCenterPageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
