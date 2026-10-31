package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zw31 implements jx31 {
    public static final Parcelable.Creator<zw31> CREATOR = new xw31((byte) 1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public zw31(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw31)) {
            return false;
        }
        zw31 zw31Var = (zw31) obj;
        return u890.j(this.a, zw31Var.a) && u890.j(this.b, zw31Var.b) && u890.j(this.c, zw31Var.c) && u890.j(this.d, zw31Var.d) && u890.j(this.e, zw31Var.e) && u890.j(this.f, zw31Var.f) && u890.j(this.g, zw31Var.g) && u890.j(this.h, zw31Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.h.hashCode() + cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
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
    }
}
