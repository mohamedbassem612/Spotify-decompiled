package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x69 implements Parcelable {
    public static final Parcelable.Creator<x69> CREATOR = new so8((byte) 16);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;
    public final w69 f;
    public final int g;

    public x69(double d, double d2, double d3, double d4, int i, w69 w69Var, int i2) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = i;
        this.f = w69Var;
        this.g = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x69)) {
            return false;
        }
        x69 x69Var = (x69) obj;
        return Double.compare(this.a, x69Var.a) == 0 && Double.compare(this.b, x69Var.b) == 0 && Double.compare(this.c, x69Var.c) == 0 && Double.compare(this.d, x69Var.d) == 0 && this.e == x69Var.e && u890.j(this.f, x69Var.f) && this.g == x69Var.g;
    }

    public final int hashCode() {
        return l1d.C(this.g) + ((this.f.hashCode() + ab80.k(this.e, xcg1.e(this.d, xcg1.e(this.c, xcg1.e(this.b, Double.hashCode(this.a) * 31, 31), 31), 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        int i2 = this.e;
        if (i2 == 1) {
            str = "Linear";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "SignedGeometric";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.f, i);
        int i3 = this.g;
        if (i3 == 1) {
            str2 = "Unspecified";
        } else if (i3 == 2) {
            str2 = "LowPass";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "HighPass";
        }
        parcel.writeString(str2);
    }
}
