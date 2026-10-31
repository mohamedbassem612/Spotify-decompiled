package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class atf implements ctf {
    public static final atf a = new atf();
    public static final Parcelable.Creator<atf> CREATOR = new zsf((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof atf);
    }

    public final int hashCode() {
        return -703071337;
    }

    public final String toString() {
        return "DM";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
