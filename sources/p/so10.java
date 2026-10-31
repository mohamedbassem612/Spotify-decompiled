package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class so10 implements vo10 {
    public static final Parcelable.Creator<so10> CREATOR = new no10((byte) 2);
    public final mo10 X;
    public final boolean Y;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;
    public final qo10 t;

    public so10(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, qo10 qo10Var, mo10 mo10Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.t = qo10Var;
        this.X = mo10Var;
        this.Y = z;
    }

    public static so10 a(so10 so10Var, qo10 qo10Var, boolean z, int i) {
        String str = so10Var.a;
        String str2 = so10Var.b;
        String str3 = so10Var.c;
        String str4 = so10Var.d;
        String str5 = so10Var.e;
        Integer num = so10Var.f;
        String str6 = so10Var.g;
        String str7 = so10Var.h;
        String str8 = so10Var.i;
        if ((i & 512) != 0) {
            qo10Var = so10Var.t;
        }
        return new so10(str, str2, str3, str4, str5, num, str6, str7, str8, qo10Var, so10Var.X, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so10)) {
            return false;
        }
        so10 so10Var = (so10) obj;
        return u890.j(this.a, so10Var.a) && u890.j(this.b, so10Var.b) && u890.j(this.c, so10Var.c) && u890.j(this.d, so10Var.d) && u890.j(this.e, so10Var.e) && u890.j(this.f, so10Var.f) && u890.j(this.g, so10Var.g) && u890.j(this.h, so10Var.h) && u890.j(this.i, so10Var.i) && u890.j(this.t, so10Var.t) && u890.j(this.X, so10Var.X) && this.Y == so10Var.Y;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iD2 = cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.Y) + ((this.X.hashCode() + ((this.t.hashCode() + cy30.d(cy30.d(cy30.d((iD2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeParcelable(this.t, i);
        parcel.writeParcelable(this.X, i);
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
