package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c5c0 extends d6c0 {
    public static final c5c0 b = new c5c0(true);
    public static final Parcelable.Creator<c5c0> CREATOR = new cwb0((byte) 11);

    public final List a() {
        return z6x.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c5c0);
    }

    public final int hashCode() {
        return -158750343;
    }

    public final String toString() {
        return "AllFolders";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
