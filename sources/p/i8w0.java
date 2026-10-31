package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i8w0 implements Parcelable {
    public static final i8w0 a = new i8w0();
    public static final Parcelable.Creator<i8w0> CREATOR = new w7w0((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i8w0);
    }

    public final int hashCode() {
        return 773143011;
    }

    public final String toString() {
        return "PresetListPageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
