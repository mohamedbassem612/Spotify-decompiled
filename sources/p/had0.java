package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class had0 implements rad0 {
    public static final Parcelable.Creator<had0> CREATOR = new bzc0((byte) 26);
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;

    public had0(Long l, String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof had0)) {
            return false;
        }
        had0 had0Var = (had0) obj;
        return u890.j(this.a, had0Var.a) && u890.j(this.b, had0Var.b) && u890.j(this.c, had0Var.c) && u890.j(this.d, had0Var.d) && this.e == had0Var.e && u890.j(this.f, had0Var.f) && u890.j(this.g, had0Var.g) && u890.j(this.h, had0Var.h);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iG = xcg1.g((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        String str4 = this.f;
        int iHashCode4 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
