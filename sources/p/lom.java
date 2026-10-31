package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lom implements nom {
    public static final Parcelable.Creator<lom> CREATOR = new ezl((byte) 20);
    public final long a;

    public lom(long j) {
        this.a = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lom) && this.a == ((lom) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
