package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class do8 implements nb10 {
    public static final do8 a = new do8();
    public static final Parcelable.Creator<do8> CREATOR = new bu7((byte) 29);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof do8);
    }

    public final int hashCode() {
        return -1401812709;
    }

    public final String toString() {
        return "AuthorExtraInfo";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
