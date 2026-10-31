package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lhj1 implements phj1 {
    public static final lhj1 a = new lhj1();
    public static final Parcelable.Creator<lhj1> CREATOR = new xbi1((byte) 28);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lhj1);
    }

    public final int hashCode() {
        return 1920895217;
    }

    public final String toString() {
        return "Error";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
