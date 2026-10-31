package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class th2 implements Parcelable {
    public static final Parcelable.Creator<th2> CREATOR = new ue2((byte) 9);
    public final int a;
    public final int b;
    public final int c;
    public final yj2 d;
    public final boolean e;
    public final boolean f;

    public th2(int i, int i2, int i3, yj2 yj2Var, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = yj2Var;
        this.e = z;
        this.f = z2;
    }

    public static th2 a(th2 th2Var, int i, int i2, int i3, yj2 yj2Var, boolean z, boolean z2, int i4) {
        if ((i4 & 1) != 0) {
            i = th2Var.a;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            i2 = th2Var.b;
        }
        int i6 = i2;
        if ((i4 & 4) != 0) {
            i3 = th2Var.c;
        }
        int i7 = i3;
        if ((i4 & 8) != 0) {
            yj2Var = th2Var.d;
        }
        yj2 yj2Var2 = yj2Var;
        if ((i4 & 16) != 0) {
            z = th2Var.e;
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = th2Var.f;
        }
        th2Var.getClass();
        return new th2(i5, i6, i7, yj2Var2, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th2)) {
            return false;
        }
        th2 th2Var = (th2) obj;
        return this.a == th2Var.a && this.b == th2Var.b && this.c == th2Var.c && u890.j(this.d, th2Var.d) && this.e == th2Var.e && this.f == th2Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g((this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
