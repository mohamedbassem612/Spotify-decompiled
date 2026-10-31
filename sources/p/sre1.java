package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sre1 implements ure1 {
    public static final sre1 a = new sre1();
    public static final Parcelable.Creator<sre1> CREATOR = new pwd1((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sre1);
    }

    public final int hashCode() {
        return -1337174305;
    }

    public final String toString() {
        return "HttpError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
