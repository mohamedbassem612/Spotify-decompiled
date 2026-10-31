package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class epy implements Parcelable {
    public static final epy a = new epy();
    public static final Parcelable.Creator<epy> CREATOR = new jhy(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof epy);
    }

    public final int hashCode() {
        return 752561654;
    }

    public final String toString() {
        return "RecentSearch";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
