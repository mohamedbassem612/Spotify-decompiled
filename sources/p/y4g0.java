package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y4g0 implements o6g0 {
    public static final Parcelable.Creator<y4g0> CREATOR = new isf0((byte) 14);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public y4g0(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static y4g0 a(y4g0 y4g0Var, boolean z, boolean z2, boolean z3, int i) {
        String str = y4g0Var.a;
        String str2 = y4g0Var.b;
        String str3 = y4g0Var.c;
        String str4 = y4g0Var.d;
        if ((i & 16) != 0) {
            z = y4g0Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = y4g0Var.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = y4g0Var.g;
        }
        return new y4g0(str, str2, str3, str4, z4, z5, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4g0)) {
            return false;
        }
        y4g0 y4g0Var = (y4g0) obj;
        return u890.j(this.a, y4g0Var.a) && u890.j(this.b, y4g0Var.b) && u890.j(this.c, y4g0Var.c) && u890.j(this.d, y4g0Var.d) && this.e == y4g0Var.e && this.f == y4g0Var.f && this.g == y4g0Var.g;
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
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
