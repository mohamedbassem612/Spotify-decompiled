package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lby implements Parcelable {
    public static final Parcelable.Creator<lby> CREATOR = new utx(17);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ei90 e;
    public final fby f;
    public final o940 g;

    public lby(String str, String str2, String str3, String str4, ei90 ei90Var, fby fbyVar, o940 o940Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ei90Var;
        this.f = fbyVar;
        this.g = o940Var;
    }

    public static lby a(lby lbyVar, String str, jjf1 jjf1Var, int i) {
        String str2 = lbyVar.a;
        String str3 = lbyVar.b;
        String str4 = lbyVar.d;
        ei90 ei90Var = jjf1Var;
        if ((i & 16) != 0) {
            ei90Var = lbyVar.e;
        }
        return new lby(str2, str3, str, str4, ei90Var, lbyVar.f, lbyVar.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lby)) {
            return false;
        }
        lby lbyVar = (lby) obj;
        return u890.j(this.a, lbyVar.a) && u890.j(this.b, lbyVar.b) && u890.j(this.c, lbyVar.c) && u890.j(this.d, lbyVar.d) && u890.j(this.e, lbyVar.e) && u890.j(this.f, lbyVar.f) && u890.j(this.g, lbyVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        fby fbyVar = this.f;
        int iHashCode2 = (iHashCode + (fbyVar == null ? 0 : fbyVar.hashCode())) * 31;
        o940 o940Var = this.g;
        return iHashCode2 + (o940Var != null ? o940Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        o940 o940Var = this.g;
        if (o940Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o940Var.writeToParcel(parcel, i);
        }
    }
}
