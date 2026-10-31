package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u8d1 extends w8d1 {
    public static final Parcelable.Creator<u8d1> CREATOR = new pxc1((byte) 23);
    public final String a;
    public final boolean b;
    public final String c;
    public final Uri d;
    public final int e;

    public u8d1(String str, boolean z, String str2, Uri uri, int i) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = uri;
        this.e = i;
    }

    public final String a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8d1)) {
            return false;
        }
        u8d1 u8d1Var = (u8d1) obj;
        return u890.j(this.a, u8d1Var.a) && this.b == u8d1Var.b && u890.j(this.c, u8d1Var.c) && u890.j(this.d, u8d1Var.d) && this.e == u8d1Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + hrt.h(this.d, cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        int i2 = this.e;
        if (i2 == 1) {
            str = "PLAYING";
        } else if (i2 == 2) {
            str = "PAUSE";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "STOPPED";
        }
        parcel.writeString(str);
    }
}
