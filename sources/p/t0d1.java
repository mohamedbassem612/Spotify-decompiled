package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t0d1 implements Parcelable {
    public static final Parcelable.Creator<t0d1> CREATOR = new pxc1((byte) 5);
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public t0d1(int i, String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0d1)) {
            return false;
        }
        t0d1 t0d1Var = (t0d1) obj;
        return u890.j(this.a, t0d1Var.a) && this.b == t0d1Var.b && u890.j(this.c, t0d1Var.c) && this.d == t0d1Var.d && this.e == t0d1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
