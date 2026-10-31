package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dzh1 implements Parcelable {
    public static final Parcelable.Creator<dzh1> CREATOR = new gwg1((byte) 19);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public dzh1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzh1)) {
            return false;
        }
        dzh1 dzh1Var = (dzh1) obj;
        return u890.j(this.a, dzh1Var.a) && u890.j(this.b, dzh1Var.b) && u890.j(this.c, dzh1Var.c) && u890.j(this.d, dzh1Var.d) && u890.j(this.e, dzh1Var.e) && u890.j(this.f, dzh1Var.f) && u890.j(this.g, dzh1Var.g) && u890.j(this.h, dzh1Var.h) && u890.j(this.i, dzh1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
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
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }

    public /* synthetic */ dzh1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, "");
    }
}
