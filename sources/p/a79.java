package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a79 implements c79 {
    public static final Parcelable.Creator<a79> CREATOR = new so8((byte) 19);
    public final double a;

    public a79(double d) {
        this.a = d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a79) && Double.compare(this.a, ((a79) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
    }
}
