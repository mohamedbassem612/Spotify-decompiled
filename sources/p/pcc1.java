package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pcc1 implements Parcelable {
    public static final Parcelable.Creator<pcc1> CREATOR = new y7c1((byte) 5);
    public final lik1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public pcc1(String str, String str2, String str3, String str4, String str5, lik1 lik1Var) {
        this.a = lik1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final lik1 a() {
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
        if (!(obj instanceof pcc1)) {
            return false;
        }
        pcc1 pcc1Var = (pcc1) obj;
        return u890.j(this.a, pcc1Var.a) && u890.j(this.b, pcc1Var.b) && u890.j(this.c, pcc1Var.c) && u890.j(this.d, pcc1Var.d) && u890.j(this.e, pcc1Var.e) && u890.j(this.f, pcc1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
