package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w2j0 implements y2j0 {
    public static final w2j0 a = new w2j0();
    public static final Parcelable.Creator<w2j0> CREATOR = new rqi0((byte) 7);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w2j0);
    }

    public final int hashCode() {
        return 1276674255;
    }

    public final String toString() {
        return "AppOperation";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
