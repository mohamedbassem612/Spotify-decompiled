package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ofk1 implements wgk1 {
    public static final Parcelable.Creator<ofk1> CREATOR = new nhj1((byte) 25);
    public final String a;
    public final String b;
    public final nfk1 c;
    public final nfk1 d;

    public ofk1(String str, String str2, nfk1 nfk1Var, nfk1 nfk1Var2) {
        this.a = str;
        this.b = str2;
        this.c = nfk1Var;
        this.d = nfk1Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofk1)) {
            return false;
        }
        ofk1 ofk1Var = (ofk1) obj;
        return u890.j(this.a, ofk1Var.a) && u890.j(this.b, ofk1Var.b) && u890.j(this.c, ofk1Var.c) && u890.j(this.d, ofk1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        nfk1 nfk1Var = this.c;
        int iHashCode = (iD + (nfk1Var == null ? 0 : nfk1Var.hashCode())) * 31;
        nfk1 nfk1Var2 = this.d;
        return iHashCode + (nfk1Var2 != null ? nfk1Var2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        nfk1 nfk1Var = this.c;
        if (nfk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nfk1Var.writeToParcel(parcel, i);
        }
        nfk1 nfk1Var2 = this.d;
        if (nfk1Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nfk1Var2.writeToParcel(parcel, i);
        }
    }
}
