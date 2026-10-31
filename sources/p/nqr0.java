package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nqr0 implements Parcelable {
    public static final Parcelable.Creator<nqr0> CREATOR = new elr0((byte) 12);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;

    public nqr0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = str6;
        this.h = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqr0)) {
            return false;
        }
        nqr0 nqr0Var = (nqr0) obj;
        return u890.j(this.a, nqr0Var.a) && u890.j(this.b, nqr0Var.b) && u890.j(this.c, nqr0Var.c) && u890.j(this.d, nqr0Var.d) && this.e == nqr0Var.e && u890.j(this.f, nqr0Var.f) && u890.j(this.g, nqr0Var.g) && this.h == nqr0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cy30.d(cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
