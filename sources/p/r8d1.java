package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r8d1 extends w8d1 {
    public static final Parcelable.Creator<r8d1> CREATOR = new pxc1((byte) 20);
    public final String a;
    public final boolean b;
    public final String c;
    public final Uri d;

    public r8d1(String str, boolean z, String str2, Uri uri) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = uri;
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
        if (!(obj instanceof r8d1)) {
            return false;
        }
        r8d1 r8d1Var = (r8d1) obj;
        return u890.j(this.a, r8d1Var.a) && this.b == r8d1Var.b && u890.j(this.c, r8d1Var.c) && u890.j(this.d, r8d1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
