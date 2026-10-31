package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xny extends yny {
    public static final xny a = new xny();
    public static final Parcelable.Creator<xny> CREATOR = new jhy((byte) 5);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xny);
    }

    public final int hashCode() {
        return 571155852;
    }

    public final String toString() {
        return "Template";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
