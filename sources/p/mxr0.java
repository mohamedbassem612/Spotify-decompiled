package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mxr0 implements o6g0 {
    public static final Parcelable.Creator<mxr0> CREATOR = new zsr0((byte) 9);
    public final String a;
    public final String b;
    public final g4a c;
    public final boolean d;
    public final boolean e;

    public mxr0(String str, String str2, g4a g4aVar, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = g4aVar;
        this.d = z;
        this.e = z2;
    }

    public static mxr0 a(mxr0 mxr0Var, boolean z, boolean z2, int i) {
        String str = mxr0Var.a;
        String str2 = mxr0Var.b;
        g4a g4aVar = mxr0Var.c;
        if ((i & 8) != 0) {
            z = mxr0Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = mxr0Var.e;
        }
        return new mxr0(str, str2, g4aVar, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxr0)) {
            return false;
        }
        mxr0 mxr0Var = (mxr0) obj;
        return u890.j(this.a, mxr0Var.a) && u890.j(this.b, mxr0Var.b) && this.c == mxr0Var.c && this.d == mxr0Var.d && this.e == mxr0Var.e;
    }

    @Override // p.o6g0
    public final String getUri() {
        return this.b;
    }

    @Override // p.o6g0
    public final String getUuid() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
