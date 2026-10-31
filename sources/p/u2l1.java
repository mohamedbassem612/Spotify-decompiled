package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u2l1 implements Parcelable {
    public static final Parcelable.Creator<u2l1> CREATOR = new ylk1(10);
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public u2l1(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2l1)) {
            return false;
        }
        u2l1 u2l1Var = (u2l1) obj;
        return u890.j(this.a, u2l1Var.a) && this.b == u2l1Var.b && u890.j(this.c, u2l1Var.c) && u890.j(this.d, u2l1Var.d) && this.e == u2l1Var.e && this.f == u2l1Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return l1d.C(this.f) + xcg1.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        int i2 = this.f;
        if (i2 == 1) {
            str = "PORTRAIT";
        } else if (i2 == 2) {
            str = "LANDSCAPE";
        } else if (i2 == 3) {
            str = "SCREEN_ORIENTATION_LOCKED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "NONE";
        }
        parcel.writeString(str);
    }
}
