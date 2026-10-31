package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kcf extends mcf {
    public static final kcf a = new kcf();
    public static final Parcelable.Creator<kcf> CREATOR = new zbf((byte) 10);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kcf);
    }

    public final int hashCode() {
        return 1815809048;
    }

    public final String toString() {
        return "Loaded";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
