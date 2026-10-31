package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tae0 implements xbe0 {
    public static final tae0 a = new tae0();
    public static final Parcelable.Creator<tae0> CREATOR = new qod0((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tae0);
    }

    public final int hashCode() {
        return -461221908;
    }

    public final String toString() {
        return "BackendError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
