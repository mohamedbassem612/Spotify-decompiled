package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e5e0 implements n5e0 {
    public static final e5e0 a = new e5e0();
    public static final Parcelable.Creator<e5e0> CREATOR = new qod0((byte) 12);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e5e0);
    }

    public final int hashCode() {
        return 189758483;
    }

    public final String toString() {
        return "Loaded";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
