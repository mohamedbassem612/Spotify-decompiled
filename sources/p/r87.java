package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r87 implements Parcelable {
    public static final Parcelable.Creator<r87> CREATOR = new f67((byte) 2);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public /* synthetic */ r87(int i) {
        this(10, 100, 20, (i & 8) != 0 ? 3 : 2, 40);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r87)) {
            return false;
        }
        r87 r87Var = (r87) obj;
        return this.a == r87Var.a && this.b == r87Var.b && this.c == r87Var.c && this.d == r87Var.d && this.e == r87Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public r87(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }
}
