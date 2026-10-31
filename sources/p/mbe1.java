package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mbe1 implements Parcelable {
    public static final Parcelable.Creator<mbe1> CREATOR = new pwd1((byte) 8);
    public final int a;
    public final int b;
    public final int c;

    public mbe1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static mbe1 a(mbe1 mbe1Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = mbe1Var.a;
        }
        int i4 = mbe1Var.b;
        if ((i3 & 4) != 0) {
            i2 = mbe1Var.c;
        }
        mbe1Var.getClass();
        return new mbe1(i, i4, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbe1)) {
            return false;
        }
        mbe1 mbe1Var = (mbe1) obj;
        return this.a == mbe1Var.a && this.b == mbe1Var.b && this.c == mbe1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
