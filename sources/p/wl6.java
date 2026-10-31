package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wl6 implements Parcelable {
    public static final Parcelable.Creator<wl6> CREATOR = new fp5((byte) 8);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final tl6 t;

    public wl6(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, tl6 tl6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.t = tl6Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl6)) {
            return false;
        }
        wl6 wl6Var = (wl6) obj;
        return u890.j(this.a, wl6Var.a) && u890.j(this.b, wl6Var.b) && u890.j(this.c, wl6Var.c) && this.d == wl6Var.d && this.e == wl6Var.e && this.f == wl6Var.f && this.g == wl6Var.g && this.h == wl6Var.h && this.i == wl6Var.i && u890.j(this.t, wl6Var.t);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        tl6 tl6Var = this.t;
        return iG + (tl6Var != null ? tl6Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        tl6 tl6Var = this.t;
        if (tl6Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tl6Var.writeToParcel(parcel, i);
        }
    }
}
