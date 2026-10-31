package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rg90 implements sg90 {
    public static final rg90 a = new rg90();
    public static final Parcelable.Creator<rg90> CREATOR = new qg90((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rg90);
    }

    public final int hashCode() {
        return 471216646;
    }

    public final String toString() {
        return "Skipped";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
