package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u69 implements w69 {
    public static final Parcelable.Creator<u69> CREATOR = new so8((byte) 14);
    public final double a;

    public u69(double d) {
        this.a = d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u69) && Double.compare(this.a, ((u69) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
    }
}
