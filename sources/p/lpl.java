package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lpl implements upl {
    public static final Parcelable.Creator<lpl> CREATOR = new pol((byte) 5);
    public final String a;
    public final bc71 b;
    public final String c;
    public final kpl d;
    public final hmp0 e;
    public final String f;
    public final String g;

    public /* synthetic */ lpl(String str, bc71 bc71Var, String str2, kpl kplVar, hmp0 hmp0Var, String str3, String str4, int i) {
        this(str, (i & 2) != 0 ? kb71.a : bc71Var, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : kplVar, (i & 16) != 0 ? null : hmp0Var, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpl)) {
            return false;
        }
        lpl lplVar = (lpl) obj;
        return u890.j(this.a, lplVar.a) && u890.j(this.b, lplVar.b) && u890.j(this.c, lplVar.c) && u890.j(this.d, lplVar.d) && u890.j(this.e, lplVar.e) && u890.j(this.f, lplVar.f) && u890.j(this.g, lplVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        kpl kplVar = this.d;
        int iHashCode3 = (iHashCode2 + (kplVar == null ? 0 : kplVar.hashCode())) * 31;
        hmp0 hmp0Var = this.e;
        int iHashCode4 = (iHashCode3 + (hmp0Var == null ? 0 : hmp0Var.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        hmp0 hmp0Var = this.e;
        if (hmp0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hmp0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public lpl(String str, bc71 bc71Var, String str2, kpl kplVar, hmp0 hmp0Var, String str3, String str4) {
        this.a = str;
        this.b = bc71Var;
        this.c = str2;
        this.d = kplVar;
        this.e = hmp0Var;
        this.f = str3;
        this.g = str4;
    }
}
