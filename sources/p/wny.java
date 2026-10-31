package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wny extends yny {
    public static final wny a = new wny();
    public static final Parcelable.Creator<wny> CREATOR = new jhy((byte) 4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wny);
    }

    public final int hashCode() {
        return 1559627669;
    }

    public final String toString() {
        return "Squared";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
