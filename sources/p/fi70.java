package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fi70 extends ji70 {
    public static final fi70 c = new fi70(22, 1);
    public static final Parcelable.Creator<fi70> CREATOR = new ai70((byte) 4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fi70);
    }

    public final int hashCode() {
        return 1449961153;
    }

    public final String toString() {
        return "AskToJoinJamFullError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
