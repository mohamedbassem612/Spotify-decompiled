package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class obx0 implements v9x0 {
    public static final Parcelable.Creator<obx0> CREATOR = new wvw0((byte) 10);
    public final Integer X;
    public final int Y;
    public final nbx0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final q730 f;
    public final String g;
    public final String h;
    public final Long i;
    public final boolean t;

    public /* synthetic */ obx0(nbx0 nbx0Var, String str, String str2, String str3, String str4, q730 q730Var, String str5, int i) {
        this(nbx0Var, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? new q730(0, 15) : q730Var, null, (i & 128) != 0 ? null : str5, null, false, null, 1);
    }

    public static obx0 a(obx0 obx0Var, nbx0 nbx0Var, String str, String str2, String str3, q730 q730Var, Integer num, int i, int i2) {
        nbx0 nbx0Var2 = (i2 & 1) != 0 ? obx0Var.a : nbx0Var;
        String str4 = obx0Var.b;
        String str5 = (i2 & 4) != 0 ? obx0Var.c : str;
        String str6 = (i2 & 8) != 0 ? obx0Var.d : str2;
        String str7 = (i2 & 16) != 0 ? obx0Var.e : str3;
        q730 q730Var2 = (i2 & 32) != 0 ? obx0Var.f : q730Var;
        String str8 = obx0Var.g;
        String str9 = obx0Var.h;
        Long l = obx0Var.i;
        boolean z = obx0Var.t;
        Integer num2 = (i2 & 1024) != 0 ? obx0Var.X : num;
        int i3 = (i2 & 2048) != 0 ? obx0Var.Y : i;
        obx0Var.getClass();
        return new obx0(nbx0Var2, str4, str5, str6, str7, q730Var2, str8, str9, l, z, num2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obx0)) {
            return false;
        }
        obx0 obx0Var = (obx0) obj;
        return u890.j(this.a, obx0Var.a) && u890.j(this.b, obx0Var.b) && u890.j(this.c, obx0Var.c) && u890.j(this.d, obx0Var.d) && u890.j(this.e, obx0Var.e) && u890.j(this.f, obx0Var.f) && u890.j(this.g, obx0Var.g) && u890.j(this.h, obx0Var.h) && u890.j(this.i, obx0Var.i) && this.t == obx0Var.t && u890.j(this.X, obx0Var.X) && this.Y == obx0Var.Y;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.i;
        int iG = xcg1.g((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31, 31, this.t);
        Integer num = this.X;
        return l1d.C(this.Y) + ((iG + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        Long l = this.i;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeInt(this.t ? 1 : 0);
        Integer num = this.X;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        switch (this.Y) {
            case 1:
                str = "NONE";
                break;
            case 2:
                str = "FRIEND";
                break;
            case 3:
                str = "INVITED";
                break;
            case 4:
                str = "SUGGESTED";
                break;
            case 5:
                str = "REQUESTED";
                break;
            case 6:
                str = "PENDING";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }

    public obx0(nbx0 nbx0Var, String str, String str2, String str3, String str4, q730 q730Var, String str5, String str6, Long l, boolean z, Integer num, int i) {
        this.a = nbx0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = q730Var;
        this.g = str5;
        this.h = str6;
        this.i = l;
        this.t = z;
        this.X = num;
        this.Y = i;
    }
}
