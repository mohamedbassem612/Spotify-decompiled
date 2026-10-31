package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bim implements iim {
    public static final bim a = new bim();
    public static final Parcelable.Creator<bim> CREATOR = new ezl((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bim);
    }

    public final int hashCode() {
        return -1218959109;
    }

    public final String toString() {
        return "MainMenu";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
