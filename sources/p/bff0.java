package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bff0 implements Parcelable {
    public static final Parcelable.Creator<bff0> CREATOR = new j7f0(12);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public bff0(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bff0)) {
            return false;
        }
        bff0 bff0Var = (bff0) obj;
        return this.a == bff0Var.a && this.b == bff0Var.b && this.c == bff0Var.c && this.d == bff0Var.d && this.e == bff0Var.e && this.f == bff0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
