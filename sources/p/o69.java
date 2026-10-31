package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o69 implements h79 {
    public static final Parcelable.Creator<o69> CREATOR = new so8((byte) 10);
    public final double a;
    public final double b;

    public o69(double d, double d2) {
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
        if (!(obj instanceof o69)) {
            return false;
        }
        o69 o69Var = (o69) obj;
        return Double.compare(this.a, o69Var.a) == 0 && Double.compare(this.b, o69Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
    }
}
