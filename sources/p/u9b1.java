package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u9b1 implements n2r0 {
    public static final u9b1 a = new u9b1();
    public static final Parcelable.Creator<u9b1> CREATOR = new nja1((byte) 15);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u9b1);
    }

    public final int hashCode() {
        return 1440769281;
    }

    public final String toString() {
        return "Stack";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
