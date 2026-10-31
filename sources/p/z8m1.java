package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z8m1 implements d9m1 {
    public static final z8m1 a = new z8m1();
    public static final Parcelable.Creator<z8m1> CREATOR = new w8m1(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z8m1);
    }

    public final int hashCode() {
        return -910262598;
    }

    public final String toString() {
        return "PlayAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
