package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ncb1 implements pcb1 {
    public static final ncb1 a = new ncb1();
    public static final Parcelable.Creator<ncb1> CREATOR = new nja1((byte) 21);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ncb1);
    }

    public final int hashCode() {
        return 1128484562;
    }

    public final String toString() {
        return "None";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
