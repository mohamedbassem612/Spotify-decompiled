package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pk71 extends qk71 {
    public static final pk71 a = new pk71();
    public static final Parcelable.Creator<pk71> CREATOR = new ff71((byte) 18);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pk71);
    }

    public final int hashCode() {
        return 1994305729;
    }

    public final String toString() {
        return "Uninitialized";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
