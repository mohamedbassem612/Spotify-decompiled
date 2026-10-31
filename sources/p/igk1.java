package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class igk1 implements jgk1 {
    public static final Parcelable.Creator<igk1> CREATOR = new tfk1((byte) 13);
    public final String a;
    public final yfk1 b;
    public final pqe1 c;
    public final vfk1 d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;

    public igk1(String str, yfk1 yfk1Var, pqe1 pqe1Var, vfk1 vfk1Var, List list, String str2, String str3, String str4) {
        this.a = str;
        this.b = yfk1Var;
        this.c = pqe1Var;
        this.d = vfk1Var;
        this.e = list;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igk1)) {
            return false;
        }
        igk1 igk1Var = (igk1) obj;
        return u890.j(this.a, igk1Var.a) && u890.j(this.b, igk1Var.b) && u890.j(this.c, igk1Var.c) && u890.j(this.d, igk1Var.d) && this.e.equals(igk1Var.e) && u890.j(this.f, igk1Var.f) && u890.j(this.g, igk1Var.g) && u890.j(this.h, igk1Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pqe1 pqe1Var = this.c;
        int iHashCode2 = (iHashCode + (pqe1Var == null ? 0 : pqe1Var.hashCode())) * 31;
        vfk1 vfk1Var = this.d;
        int iD = cy30.d(cy30.d(f4i1.b((iHashCode2 + (vfk1Var == null ? 0 : vfk1Var.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        vfk1 vfk1Var = this.d;
        if (vfk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vfk1Var.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
