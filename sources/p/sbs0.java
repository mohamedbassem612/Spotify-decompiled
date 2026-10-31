package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sbs0 implements Parcelable {
    public static final Parcelable.Creator<sbs0> CREATOR = new agm0((byte) 6);
    public final double a;
    public final String b;

    public sbs0(String str, double d) {
        this.a = d;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbs0)) {
            return false;
        }
        sbs0 sbs0Var = (sbs0) obj;
        return Double.compare(this.a, sbs0Var.a) == 0 && u890.j(this.b, sbs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeString(this.b);
    }
}
