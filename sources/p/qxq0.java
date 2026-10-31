package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qxq0 implements sxq0 {
    public static final qxq0 a = new qxq0();
    public static final Parcelable.Creator<qxq0> CREATOR = new p7q0((byte) 22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qxq0);
    }

    public final int hashCode() {
        return -2143884223;
    }

    public final String toString() {
        return "Hidden";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
