package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pz9 implements Parcelable {
    public static final Parcelable.Creator<pz9> CREATOR = new ux9(5);
    public final vz9 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ pz9(vz9 vz9Var, String str, String str2, int i) {
        this((i & 1) != 0 ? sz9.a : vz9Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz9)) {
            return false;
        }
        pz9 pz9Var = (pz9) obj;
        return u890.j(this.a, pz9Var.a) && u890.j(this.b, pz9Var.b) && u890.j(this.c, pz9Var.c) && u890.j(this.d, pz9Var.d) && u890.j(this.e, pz9Var.e) && u890.j(this.f, pz9Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
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

    public pz9(vz9 vz9Var, String str, String str2, String str3, String str4, String str5) {
        this.a = vz9Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }
}
