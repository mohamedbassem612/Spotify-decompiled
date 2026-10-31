package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nkm0 extends okm0 {
    public static final Parcelable.Creator<nkm0> CREATOR = new fgm0((byte) 17);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nkm0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkm0)) {
            return false;
        }
        nkm0 nkm0Var = (nkm0) obj;
        return u890.j(this.a, nkm0Var.a) && u890.j(this.b, nkm0Var.b) && u890.j(this.c, nkm0Var.c) && u890.j(this.d, nkm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
