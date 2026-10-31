package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class si71 extends wi71 {
    public static final si71 a = new si71();
    public static final Parcelable.Creator<si71> CREATOR = new ff71((byte) 10);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof si71);
    }

    public final int hashCode() {
        return 1838264687;
    }

    public final String toString() {
        return "Error";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
