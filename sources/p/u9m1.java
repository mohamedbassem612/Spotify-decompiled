package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u9m1 implements pam1 {
    public static final u9m1 a = new u9m1();
    public static final Parcelable.Creator<u9m1> CREATOR = new w8m1((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u9m1);
    }

    public final int hashCode() {
        return 752539731;
    }

    public final String toString() {
        return "ContentReady";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
