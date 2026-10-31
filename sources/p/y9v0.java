package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y9v0 implements Parcelable {
    public static final Parcelable.Creator<y9v0> CREATOR = new g0v0(5);
    public final double a;
    public final double b;

    public y9v0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9v0)) {
            return false;
        }
        y9v0 y9v0Var = (y9v0) obj;
        return Double.compare(this.a, y9v0Var.a) == 0 && Double.compare(this.b, y9v0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
    }
}
