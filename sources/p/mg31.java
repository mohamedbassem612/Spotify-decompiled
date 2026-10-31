package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mg31 extends ng31 {
    public static final Parcelable.Creator<mg31> CREATOR = new s231((byte) 18);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public final long g;

    public mg31(String str, String str2, int i, int i2, long j, int i3, long j2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = i3;
        this.g = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg31)) {
            return false;
        }
        mg31 mg31Var = (mg31) obj;
        return u890.j(this.a, mg31Var.a) && u890.j(this.b, mg31Var.b) && this.c == mg31Var.c && this.d == mg31Var.d && this.e == mg31Var.e && this.f == mg31Var.f && this.g == mg31Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ab80.k(this.f, cy30.f(kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), this.e, 31), 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        int i2 = this.f;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "CAMERA";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "LIBRARY";
        }
        parcel.writeString(str);
        parcel.writeLong(this.g);
    }
}
