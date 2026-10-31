package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b79 implements c79 {
    public static final Parcelable.Creator<b79> CREATOR = new so8((byte) 20);
    public final double a;
    public final double b;

    public b79(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b79)) {
            return false;
        }
        b79 b79Var = (b79) obj;
        return Double.compare(this.a, b79Var.a) == 0 && Double.compare(this.b, b79Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
    }
}
