package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xdd0 implements Parcelable {
    public static final Parcelable.Creator<xdd0> CREATOR = new lad0(23);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public xdd0(String str, String str2, String str3, boolean z, long j, boolean z2, boolean z3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = z2;
        this.g = z3;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdd0)) {
            return false;
        }
        xdd0 xdd0Var = (xdd0) obj;
        return u890.j(this.a, xdd0Var.a) && u890.j(this.b, xdd0Var.b) && u890.j(this.c, xdd0Var.c) && this.d == xdd0Var.d && this.e == xdd0Var.e && this.f == xdd0Var.f && this.g == xdd0Var.g && u890.j(this.h, xdd0Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iG = xcg1.g(xcg1.g(cy30.f(xcg1.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), this.e, 31), 31, this.f), 31, this.g);
        String str3 = this.h;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
    }
}
