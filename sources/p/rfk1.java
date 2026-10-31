package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rfk1 implements Parcelable {
    public static final Parcelable.Creator<rfk1> CREATOR = new nhj1((byte) 27);
    public final String a;
    public final String b;
    public final qfk1 c;
    public final String d;

    public rfk1(String str, String str2, qfk1 qfk1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = qfk1Var;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfk1)) {
            return false;
        }
        rfk1 rfk1Var = (rfk1) obj;
        return u890.j(this.a, rfk1Var.a) && u890.j(this.b, rfk1Var.b) && u890.j(this.c, rfk1Var.c) && u890.j(this.d, rfk1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        qfk1 qfk1Var = this.c;
        int iHashCode3 = (iHashCode2 + (qfk1Var == null ? 0 : qfk1Var.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        qfk1 qfk1Var = this.c;
        if (qfk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qfk1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
    }
}
