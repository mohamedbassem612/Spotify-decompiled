package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fnt extends jnt {
    public static final fnt a = new fnt();
    public static final Parcelable.Creator<fnt> CREATOR = new qms((byte) 23);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fnt);
    }

    public final int hashCode() {
        return 1637619011;
    }

    public final String toString() {
        return "CampfireDisabled";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
