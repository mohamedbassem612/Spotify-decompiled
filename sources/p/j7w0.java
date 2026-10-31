package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j7w0 implements Parcelable {
    public static final j7w0 a = new j7w0();
    public static final Parcelable.Creator<j7w0> CREATOR = new g0v0((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j7w0);
    }

    public final int hashCode() {
        return 374582988;
    }

    public final String toString() {
        return "ConfirmationResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
