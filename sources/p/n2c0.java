package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n2c0 implements Parcelable {
    public static final Parcelable.Creator<n2c0> CREATOR = new cwb0((byte) 2);
    public final int a;
    public final int b;
    public final tpw0 c;
    public final yxa0 d;
    public final yq00 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public n2c0(int i, int i2, tpw0 tpw0Var, yxa0 yxa0Var, yq00 yq00Var, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = tpw0Var;
        this.d = yxa0Var;
        this.e = yq00Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static n2c0 a(n2c0 n2c0Var, boolean z, boolean z2, int i) {
        int i2 = n2c0Var.a;
        int i3 = n2c0Var.b;
        tpw0 tpw0Var = n2c0Var.c;
        yxa0 yxa0Var = n2c0Var.d;
        yq00 yq00Var = n2c0Var.e;
        boolean z3 = (i & 32) != 0 ? n2c0Var.f : true;
        if ((i & 64) != 0) {
            z = n2c0Var.g;
        }
        boolean z4 = z;
        if ((i & 128) != 0) {
            z2 = n2c0Var.h;
        }
        return new n2c0(i2, i3, tpw0Var, yxa0Var, yq00Var, z3, z4, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2c0)) {
            return false;
        }
        n2c0 n2c0Var = (n2c0) obj;
        return this.a == n2c0Var.a && this.b == n2c0Var.b && this.c == n2c0Var.c && u890.j(this.d, n2c0Var.d) && u890.j(this.e, n2c0Var.e) && this.f == n2c0Var.f && this.g == n2c0Var.g && this.h == n2c0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
