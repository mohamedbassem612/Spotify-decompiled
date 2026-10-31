package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qcy0 extends tcy0 {
    public static final Parcelable.Creator<qcy0> CREATOR = new zzx0((byte) 18);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final boolean i;
    public final boolean t;

    public qcy0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = num;
        this.i = z;
        this.t = z2;
    }

    public static qcy0 b(qcy0 qcy0Var, String str, Integer num, boolean z, boolean z2, int i) {
        String str2 = qcy0Var.a;
        String str3 = qcy0Var.b;
        String str4 = qcy0Var.c;
        String str5 = qcy0Var.d;
        String str6 = qcy0Var.e;
        String str7 = qcy0Var.f;
        if ((i & 64) != 0) {
            str = qcy0Var.g;
        }
        String str8 = str;
        if ((i & 128) != 0) {
            num = qcy0Var.h;
        }
        Integer num2 = num;
        if ((i & 256) != 0) {
            z = qcy0Var.i;
        }
        boolean z3 = z;
        boolean z4 = (i & 512) != 0 ? qcy0Var.t : z2;
        qcy0Var.getClass();
        return new qcy0(str2, str3, str4, str5, str6, str7, str8, num2, z3, z4);
    }

    @Override // p.tcy0
    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcy0)) {
            return false;
        }
        qcy0 qcy0Var = (qcy0) obj;
        return u890.j(this.a, qcy0Var.a) && u890.j(this.b, qcy0Var.b) && u890.j(this.c, qcy0Var.c) && u890.j(this.d, qcy0Var.d) && u890.j(this.e, qcy0Var.e) && u890.j(this.f, qcy0Var.f) && u890.j(this.g, qcy0Var.g) && u890.j(this.h, qcy0Var.h) && this.i == qcy0Var.i && this.t == qcy0Var.t;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.h;
        return Boolean.hashCode(this.t) + xcg1.g((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        Integer num = this.h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
    }
}
