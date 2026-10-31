package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dnf0 extends enf0 {
    public static final Parcelable.Creator<dnf0> CREATOR = new j7f0((byte) 23);
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public dnf0(long j, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    public static dnf0 a(dnf0 dnf0Var, int i, int i2, int i3, long j, int i4) {
        if ((i4 & 1) != 0) {
            i = dnf0Var.a;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            i2 = dnf0Var.b;
        }
        int i6 = i2;
        if ((i4 & 4) != 0) {
            i3 = dnf0Var.c;
        }
        int i7 = i3;
        if ((i4 & 8) != 0) {
            j = dnf0Var.d;
        }
        return new dnf0(j, i5, i6, i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnf0)) {
            return false;
        }
        dnf0 dnf0Var = (dnf0) obj;
        return this.a == dnf0Var.a && this.b == dnf0Var.b && this.c == dnf0Var.c && this.d == dnf0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
    }

    public /* synthetic */ dnf0() {
        this(0L, -1, -1, 0);
    }
}
