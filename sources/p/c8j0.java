package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c8j0 implements f8j0 {
    public static final c8j0 a = new c8j0();
    public static final Parcelable.Creator<c8j0> CREATOR = new rqi0((byte) 22);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c8j0);
    }

    public final int hashCode() {
        return 72846059;
    }

    public final String toString() {
        return "Allowed";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
