package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hfk1 implements Parcelable {
    public static final Parcelable.Creator<hfk1> CREATOR = new nhj1((byte) 19);
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final rfk1 f;

    public hfk1(String str, ArrayList arrayList, String str2, String str3, String str4, rfk1 rfk1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = rfk1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfk1)) {
            return false;
        }
        hfk1 hfk1Var = (hfk1) obj;
        return u890.j(this.a, hfk1Var.a) && this.b.equals(hfk1Var.b) && u890.j(this.c, hfk1Var.c) && u890.j(this.d, hfk1Var.d) && u890.j(this.e, hfk1Var.e) && u890.j(this.f, hfk1Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d(p3d1.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        String str2 = this.d;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        rfk1 rfk1Var = this.f;
        return iHashCode2 + (rfk1Var != null ? rfk1Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        rfk1 rfk1Var = this.f;
        if (rfk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rfk1Var.writeToParcel(parcel, i);
        }
    }
}
