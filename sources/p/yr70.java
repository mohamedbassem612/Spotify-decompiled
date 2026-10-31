package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yr70 implements Parcelable {
    public static final Parcelable.Creator<yr70> CREATOR = new mj70((byte) 7);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Double g;
    public final boolean h;
    public final String i;

    public yr70(int i, String str, String str2, String str3, String str4, String str5, Double d, boolean z, String str6) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = d;
        this.h = z;
        this.i = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr70)) {
            return false;
        }
        yr70 yr70Var = (yr70) obj;
        return this.a == yr70Var.a && u890.j(this.b, yr70Var.b) && u890.j(this.c, yr70Var.c) && u890.j(this.d, yr70Var.d) && u890.j(this.e, yr70Var.e) && u890.j(this.f, yr70Var.f) && u890.j(this.g, yr70Var.g) && this.h == yr70Var.h && u890.j(this.i, yr70Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.g;
        int iG = xcg1.g((iHashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31, this.h);
        String str3 = this.i;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        Double d = this.g;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
    }
}
