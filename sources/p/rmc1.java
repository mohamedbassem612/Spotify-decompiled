package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rmc1 implements Parcelable {
    public static final Parcelable.Creator<rmc1> CREATOR = new y7c1((byte) 22);
    public final String a;
    public final String b;
    public final String c;
    public final dxr0 d;
    public final yxa0 e;
    public final String f;
    public final yq00 g;

    public rmc1(String str, String str2, String str3, dxr0 dxr0Var, yxa0 yxa0Var, String str4, yq00 yq00Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dxr0Var;
        this.e = yxa0Var;
        this.f = str4;
        this.g = yq00Var;
    }

    public final yxa0 a() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmc1)) {
            return false;
        }
        rmc1 rmc1Var = (rmc1) obj;
        return u890.j(this.a, rmc1Var.a) && u890.j(this.b, rmc1Var.b) && u890.j(this.c, rmc1Var.c) && u890.j(this.d, rmc1Var.d) && u890.j(this.e, rmc1Var.e) && u890.j(this.f, rmc1Var.f) && u890.j(this.g, rmc1Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        yq00 yq00Var = this.g;
        return iHashCode2 + (yq00Var != null ? yq00Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
    }
}
