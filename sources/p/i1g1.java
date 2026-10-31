package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i1g1 implements p1g1 {
    public static final i1g1 a = new i1g1();
    public static final Parcelable.Creator<i1g1> CREATOR = new r8f1((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i1g1);
    }

    public final int hashCode() {
        return -440504099;
    }

    public final String toString() {
        return "AudioOnly";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
