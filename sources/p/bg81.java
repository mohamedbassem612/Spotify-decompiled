package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bg81 implements cg81 {
    public static final bg81 a = new bg81();
    public static final Parcelable.Creator<bg81> CREATOR = new ro71((byte) 12);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bg81);
    }

    public final int hashCode() {
        return 1722040262;
    }

    public final String toString() {
        return "Loading";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
