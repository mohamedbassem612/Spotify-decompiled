package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q730 implements Parcelable {
    public static final Parcelable.Creator<q730> CREATOR = new ix20((byte) 9);
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    public q730(int i, int i2, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
    }

    public static q730 a(q730 q730Var, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = q730Var.a;
        }
        boolean z2 = q730Var.b;
        int i3 = q730Var.c;
        if ((i2 & 8) != 0) {
            i = q730Var.d;
        }
        q730Var.getClass();
        return new q730(i3, i, z, z2);
    }

    public final boolean b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q730)) {
            return false;
        }
        q730 q730Var = (q730) obj;
        return this.a == q730Var.a && this.b == q730Var.b && this.c == q730Var.c && this.d == q730Var.d;
    }

    public final int g() {
        return this.c;
    }

    public final boolean h() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final int j() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public /* synthetic */ q730(int i, int i2) {
        this((i2 & 4) != 0 ? 0 : i, 0, false, false);
    }
}
