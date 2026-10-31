package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mom implements nom {
    public static final Parcelable.Creator<mom> CREATOR = new ezl((byte) 21);
    public final long a;

    public mom(long j) {
        this.a = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mom) && this.a == ((mom) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
