package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m4j0 implements q4j0 {
    public static final m4j0 a = new m4j0();
    public static final Parcelable.Creator<m4j0> CREATOR = new rqi0((byte) 15);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m4j0);
    }

    public final int hashCode() {
        return 1133754131;
    }

    public final String toString() {
        return "Dialog";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
