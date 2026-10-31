package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v69 implements w69 {
    public static final Parcelable.Creator<v69> CREATOR = new so8((byte) 15);
    public final double a;

    public v69(double d) {
        this.a = d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v69) && Double.compare(this.a, ((v69) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
    }
}
