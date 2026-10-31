package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j1g1 implements p1g1 {
    public static final j1g1 a = new j1g1();
    public static final Parcelable.Creator<j1g1> CREATOR = new r8f1((byte) 25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j1g1);
    }

    public final int hashCode() {
        return -1027554108;
    }

    public final String toString() {
        return "AudioWithVideo";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
