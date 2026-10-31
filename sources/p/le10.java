package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class le10 implements Parcelable {
    public static final Parcelable.Creator<le10> CREATOR = new qn00((byte) 15);
    public final boolean X;
    public final je10 Y;
    public final List Z;
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final xd10 f;
    public final int g;
    public final String h;
    public final String i;
    public final String t;

    public le10(String str, String str2, String str3, Integer num, String str4, xd10 xd10Var, int i, String str5, String str6, String str7, boolean z, je10 je10Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = xd10Var;
        this.g = i;
        this.h = str5;
        this.i = str6;
        this.t = str7;
        this.X = z;
        this.Y = je10Var;
        this.Z = list;
    }

    public static le10 a(le10 le10Var, String str, String str2, Integer num, String str3, xd10 xd10Var, int i, String str4, String str5, String str6, boolean z, je10 je10Var, List list, int i2) {
        String str7 = str;
        String str8 = le10Var.a;
        if ((i2 & 2) != 0) {
            str7 = le10Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = le10Var.c;
        }
        if ((i2 & 8) != 0) {
            num = le10Var.d;
        }
        if ((i2 & 16) != 0) {
            str3 = le10Var.e;
        }
        if ((i2 & 32) != 0) {
            xd10Var = le10Var.f;
        }
        if ((i2 & 64) != 0) {
            i = le10Var.g;
        }
        if ((i2 & 128) != 0) {
            str4 = le10Var.h;
        }
        if ((i2 & 256) != 0) {
            str5 = le10Var.i;
        }
        if ((i2 & 512) != 0) {
            str6 = le10Var.t;
        }
        if ((i2 & 1024) != 0) {
            z = le10Var.X;
        }
        if ((i2 & 2048) != 0) {
            je10Var = le10Var.Y;
        }
        if ((i2 & 4096) != 0) {
            list = le10Var.Z;
        }
        List list2 = list;
        je10 je10Var2 = je10Var;
        boolean z2 = z;
        String str9 = str6;
        String str10 = str5;
        String str11 = str4;
        int i3 = i;
        xd10 xd10Var2 = xd10Var;
        String str12 = str3;
        Integer num2 = num;
        return new le10(str8, str7, str2, num2, str12, xd10Var2, i3, str11, str10, str9, z2, je10Var2, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le10)) {
            return false;
        }
        le10 le10Var = (le10) obj;
        return u890.j(this.a, le10Var.a) && u890.j(this.b, le10Var.b) && u890.j(this.c, le10Var.c) && u890.j(this.d, le10Var.d) && u890.j(this.e, le10Var.e) && u890.j(this.f, le10Var.f) && this.g == le10Var.g && u890.j(this.h, le10Var.h) && u890.j(this.i, le10Var.i) && u890.j(this.t, le10Var.t) && this.X == le10Var.X && u890.j(this.Y, le10Var.Y) && u890.j(this.Z, le10Var.Z);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        int iK = ab80.k(this.g, (this.f.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        String str3 = this.h;
        int iHashCode3 = (iK + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.t;
        return this.Z.hashCode() + ((this.Y.hashCode() + xcg1.g((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.X)) * 31);
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
        parcel.writeParcelable(this.f, i);
        parcel.writeString(bb00.t(this.g));
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeParcelable(this.Y, i);
        parcel.writeStringList(this.Z);
    }
}
