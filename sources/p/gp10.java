package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gp10 implements ip10 {
    public static final Parcelable.Creator<gp10> CREATOR = new no10((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final ep10 h;
    public final String i;
    public final String t;

    public gp10(String str, String str2, String str3, Integer num, String str4, String str5, String str6, ep10 ep10Var, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = ep10Var;
        this.i = str7;
        this.t = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp10)) {
            return false;
        }
        gp10 gp10Var = (gp10) obj;
        return u890.j(this.a, gp10Var.a) && u890.j(this.b, gp10Var.b) && u890.j(this.c, gp10Var.c) && u890.j(this.d, gp10Var.d) && u890.j(this.e, gp10Var.e) && u890.j(this.f, gp10Var.f) && u890.j(this.g, gp10Var.g) && u890.j(this.h, gp10Var.h) && u890.j(this.i, gp10Var.i) && u890.j(this.t, gp10Var.t);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iHashCode = (this.h.hashCode() + cy30.d(cy30.d(cy30.d((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
    }
}
