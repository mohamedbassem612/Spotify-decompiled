package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wx81 implements xx81 {
    public static final wx81 a = new wx81();
    public static final Parcelable.Creator<wx81> CREATOR = new ro71((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wx81);
    }

    public final int hashCode() {
        return 901095673;
    }

    public final String toString() {
        return "Unavailable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
