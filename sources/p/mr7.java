package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mr7 implements nr7 {
    public static final mr7 a = new mr7();
    public static final Parcelable.Creator<mr7> CREATOR = new f67((byte) 25);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mr7);
    }

    public final int hashCode() {
        return 472027483;
    }

    public final String toString() {
        return "Loading";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
