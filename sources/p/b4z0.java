package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b4z0 implements Parcelable {
    public static final Parcelable.Creator<b4z0> CREATOR = new j1z0((byte) 5);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public b4z0(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4z0)) {
            return false;
        }
        b4z0 b4z0Var = (b4z0) obj;
        return u890.j(this.a, b4z0Var.a) && u890.j(this.b, b4z0Var.b) && u890.j(this.c, b4z0Var.c) && this.d == b4z0Var.d && this.e == b4z0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        int i2 = this.d;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "PRESET";
        } else if (i2 == 3) {
            str = "USER_PROFILE";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "USER";
        }
        parcel.writeString(str);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
