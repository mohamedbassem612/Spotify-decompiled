package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v8m1 implements d9m1 {
    public static final v8m1 a = new v8m1();
    public static final Parcelable.Creator<v8m1> CREATOR = new ylk1((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v8m1);
    }

    public final int hashCode() {
        return -546610165;
    }

    public final String toString() {
        return "NavigateToNextItemEffect";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
